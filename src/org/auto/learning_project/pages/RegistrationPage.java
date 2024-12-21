package org.auto.learning_project.pages;

import org.auto.learning_project.utilities.ReadPropFiles;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegistrationPage 
{
	WebDriver driver;
	
	public RegistrationPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public void click_signuploginbttn() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("Signup_signuploginbttn_xpath"))).click();
	}

	public void enter_name(String name) throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("Signup_name_xpath"))).sendKeys(name);
	}
	
	public void enter_email(String email) throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("Signup_email_xpath"))).sendKeys(email);
	}
	
	public void click_signupbttn() throws Exception
	{
		driver.findElement(By.cssSelector(ReadPropFiles.readelement("Signup_signupbttn_css"))).click();
	}
	
	public void select_male_radiobttn() throws Exception
	{
		WebElement mrradiobttn=driver.findElement(By.id(ReadPropFiles.readelement("Signup_title_mr_id")));
		boolean isCheckedmr=mrradiobttn.isSelected();
		
		if (isCheckedmr)
		{
			System.out.println("The male radio button is checked");
		}
		else
		{
			System.out.println("The male radio button is not checked");
		}
		if (!isCheckedmr)
		{
			mrradiobttn.click(); 
		System.out.println("The male radio button is clicked and selected");
		}
				
	}
	public void select_female_radiobttn() throws Exception
	{
		WebElement mrsradiobttn=driver.findElement(By.id(ReadPropFiles.readelement("Signup_title_mrs_id")));
		boolean isCheckedmrs =mrsradiobttn.isSelected();
		
		if (isCheckedmrs)
		{
			System.out.println("The female radio button is checked");
		}
		else
		{
			System.out.println("The female radio button is not checked");
		}
		if (!isCheckedmrs)
		{
			mrsradiobttn.click(); 
		System.out.println("The female radio button is clicked and selected");
		}	
		}
	
	public void enter_name1(String name) throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("Signup_name1_xpath"))).clear();
		driver.findElement(By.xpath(ReadPropFiles.readelement("Signup_name1_xpath"))).sendKeys(name);
	}
	public void enter_email1() throws Exception
	{
	WebElement email1_field=driver.findElement(By.xpath(ReadPropFiles.readelement("Signup_email1_xpath")));
	boolean isEmailFieldEnabled=email1_field.isEnabled();
	//Assert.assertEquals(isEmailFieldEnabled, isEmailFieldEnabled);
	if (isEmailFieldEnabled)
	{
		System.out.println("The Email Field is Enable");
	}
	else
	{
		System.out.println("The Email Field is not Enable");
	}
	}
	public void enter_newpassword(String npass) throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("Signup_newpassword_xpath"))).sendKeys(npass);
	}
		public void dob_day(String day) throws Exception
	{
		Select dobday = new Select(driver.findElement(By.id(ReadPropFiles.readelement("Signup_dob_day_id"))));
		dobday.selectByVisibleText(day);
	}
	
	public void dob_month(String month) throws Exception
	{
		Select dobmonth = new Select(driver.findElement(By.name(ReadPropFiles.readelement("Signup_dob_month_id"))));
		dobmonth.selectByVisibleText(month);
		
	}
	
	public void dob_year(String year) throws Exception
	{
		Select dob_year = new Select(driver.findElement(By.name(ReadPropFiles.readelement("Signup_dob_year_name"))));
		dob_year.selectByVisibleText(year);
	}
	
	public void checkbox1() throws Exception
	{
		WebElement checkbox1=driver.findElement(By.id(ReadPropFiles.readelement("Signup_checkbox_newsletter_id")));
		boolean isChecked1 =checkbox1.isSelected();
		
		if (isChecked1)
		{
			System.out.println("The newsletter checkbox is checked");
		}
		else
		{
			System.out.println("The newsletter checkbox is not checked");
		}
		if (!isChecked1)
		{
			checkbox1.click(); 
		System.out.println("The newsletter checkbox is clicked and selected");
		}	
	}
	
	public void checkbox2() throws Exception
	{
		WebElement checkbox1=driver.findElement(By.xpath(ReadPropFiles.readelement("Signup_checkbox_specialoffers_xpath")));
		boolean isChecked1 =checkbox1.isSelected();
		
		if (isChecked1)
		{
			System.out.println("The specialoffers checkbox is checked");
		}
		else
		{
			System.out.println("The specialoffers checkbox is not checked");
		}
		if (!isChecked1)
		{
			checkbox1.click(); 
		System.out.println("The specialoffers checkbox is clicked and selected");
		}	
	}

	public void enter_fname(String fname) throws Exception
	{
		driver.findElement(By.id(ReadPropFiles.readelement("Signup_firstname_id"))).sendKeys(fname);
	}
	
	public void enter_lname(String lname) throws Exception
	{
		driver.findElement(By.id(ReadPropFiles.readelement("Signup_lastname_id"))).sendKeys(lname);
	}
	
	public void enter_company(String company) throws Exception
	{
		driver.findElement(By.id(ReadPropFiles.readelement("Signup_company_id"))).sendKeys(company);
	}
	
	 //Actions class for scrolling down
			public void scroll_down0() throws Exception
			{
				Actions act= new Actions(driver);
				act.sendKeys(Keys.PAGE_DOWN).perform();
				
			}		
			
	
	/*
	// Scroll down using 'scrollByAmount' method 
	public void scroll_down() throws Exception
	{
		Actions act= new Actions(driver);
	 act.scrollByAmount(0,500).perform(); // Scroll down by 500 pixels
	}
	*/
		
	public void enter_address(String address) throws Exception
	{
		driver.findElement(By.id(ReadPropFiles.readelement("Signup_address_id"))).sendKeys(address);
	}
	
	public void enter_address2(String address2) throws Exception
	{
		driver.findElement(By.id(ReadPropFiles.readelement("Signup_address2_id"))).sendKeys(address2);
	}
	
	public void enter_country(String country) throws Exception
	{
		driver.findElement(By.id(ReadPropFiles.readelement("Signup_country_id"))).sendKeys(country);
	}
	public void enter_state(String state) throws Exception
	{
		driver.findElement(By.id(ReadPropFiles.readelement("Signup_state_id"))).sendKeys(state);
	}
	
	public void enter_city(String city) throws Exception
	{
		driver.findElement(By.id(ReadPropFiles.readelement("Signup_city_id"))).sendKeys(city);
	}		
			
	public void enter_zipcode(String zipcode) throws Exception
	{
		driver.findElement(By.id(ReadPropFiles.readelement("Signup_zipcode_id"))).sendKeys(zipcode);
	}
			
	public void enter_mobilenumber(String mobilenumber) throws Exception
	{
		driver.findElement(By.id(ReadPropFiles.readelement("Signup_mobilenumber_name"))).sendKeys(mobilenumber);
	}
	
	//Actions class for scrolling down
	public void scroll_up1() throws Exception
	{
		Actions act= new Actions(driver);
		act.sendKeys(Keys.PAGE_UP).perform(); 
		
		// Wait for observation (optional)
        try {
            Thread.sleep(2000); // Pause for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace(); 
        } 
	}		
	

/*
// Scroll up using 'scrollByAmount' method 
public void scroll_up() throws Exception
{
Actions act= new Actions(driver);
act.scrollByAmount(0,-500).perform(); // Scroll down by 500 pixels
}
*/
		
	//Actions class for scrolling down
		public void scroll_down2() throws Exception
		{
			Actions act= new Actions(driver);
			act.sendKeys(Keys.PAGE_DOWN).perform();
			// Wait for observation (optional)
	        try {
	            Thread.sleep(2000); // Pause for 2 seconds
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        } 
		}		
		

	/*
	// Scroll down using 'scrollByAmount' method 
	public void scroll_down1() throws Exception
	{
	Actions act= new Actions(driver);
	act.scrollByAmount(0,500).perform(); // Scroll down by 500 pixels
	} */
	
	public void click_create_accountbttn() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("signup_create_accountbttn_xpath"))).click();
	}

		public void click_continuebttn() throws Exception
	{
		driver.findElement(By.cssSelector(ReadPropFiles.readelement("signup_continue_css"))).click();
	}
	public void click_logoutbttn() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("signup_logout_xpath"))).click();
	}
}
