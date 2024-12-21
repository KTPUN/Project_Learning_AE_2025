package org.auto.learning_project.pages;

import org.auto.learning_project.utilities.ReadPropFiles;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class LoginPage 
{
	WebDriver driver;
	
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public void click_signuploginbttn() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("Signup_signuploginbttn_xpath"))).click();
	}
		
	public void enter_email(String email) throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("Login_email_xpath"))).sendKeys(email);
	}
	
	public void enter_password(String passw) throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("Login_password_xpath"))).sendKeys(passw);
	}
	
	public void click_loginbttn() throws Exception
	{
		driver.findElement(By.cssSelector(ReadPropFiles.readelement("Login_loginbttn_css"))).click();
	}
	
	public void validate_login() throws Exception
	{
		//Hard Assertion 
		//String ExptTitle ="AutomationExercise";
	String ExptTitle ="Automation Exercise";
	String ActTitle=driver.getTitle();
	Assert.assertEquals(ActTitle,ExptTitle);
	
	/*	
	//Soft Assertion 
	//String ExptTitle ="AutomationExercise";
	 String ExptTitle ="Automation Exercise";
     String ActTitle=driver.getTitle();
     SoftAssert sa=new SoftAssert();
     sa.assertEquals(ActTitle,ExptTitle);*/
	}	
	//Negative Test
	public void click_logoutbttn_negTest() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("Login_logout_neg_test_xpath"))).click();
	}
	
	public void enter_valid_email(String email_neg) throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("Login_email_xpath"))).sendKeys(email_neg);
	}
	
	public void enter_invalid_password(String passw_neg) throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("Login_password_xpath"))).sendKeys(passw_neg);
	}
	
	public void click_loginbttn_for_negTest() throws Exception
	{
		driver.findElement(By.cssSelector(ReadPropFiles.readelement("Login_loginbttn_css"))).click();
	}
	
	public void neg_validate_login() throws Exception
	{
		//Hard Assertion 
		//String ExptTitle ="AutomationExercise";
	String ExptMessg ="Your email or password is incorrect!";
	String ActMessg=driver.findElement(By.xpath(ReadPropFiles.readelement("Login_for_negative_test_xpath"))).getText();
	Assert.assertEquals(ActMessg,ExptMessg);
	System.out.println("Expected Message for invalid credentials:"+ ExptMessg);
	System.out.println("Actual Message for invalid credentials:"+ ActMessg);
	/*	
	//Soft Assertion 
	//String ExptTitle ="AutomationExercise";
	 String ExptTitle ="Automation Exercise";
     String ActTitle=driver.getTitle();
     SoftAssert sa=new SoftAssert();
     sa.assertEquals(ActTitle,ExptTitle);*/
	}
}
