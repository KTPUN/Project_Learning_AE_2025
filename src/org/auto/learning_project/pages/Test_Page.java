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

public class Test_Page 
{
	WebDriver driver;
		
	public Test_Page(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public void click_Test_men() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("HomePage_category_men_xpath"))).click();
	}
	
	public void click_Test_category_Tshirt() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("HomePage_sub_category_Tshirt_xpath"))).click();
	}
	/*
	
	public void click_view_product1_dress() throws Exception
	{
		driver.findElement(By.cssSelector(ReadPropFiles.readelement("HomePage_category_view_product1_dress_css"))).click();
	}
	
	public void click_add_to_cart1_dress() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("HomePage_category_addCart1_dress_xpath"))).click();
	}
	
	public void click_continue1_dress() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("HomePage_category_continue1_dress_xpath"))).click();
		driver.navigate().back();
	}
	
	public void click_view_product2_dress() throws Exception
	{
		driver.findElement(By.cssSelector(ReadPropFiles.readelement("HomePage_category_view_product2_dress_css"))).click();
	}
	
	public void click_add_to_cart2_dress() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("HomePage_category_addCart2_dress_xpath"))).click();
	}
	
	public void click_continue2_dress() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("HomePage_category_continue2_dress_xpath"))).click();
		driver.navigate().back();
	}
	
	
	public void click_view_product3_dress() throws Exception
	{
		driver.findElement(By.cssSelector(ReadPropFiles.readelement("HomePage_category_view_product3_dress_css"))).click();
	}
	
	public void click_add_to_cart3_dress() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("HomePage_category_addCart3_dress_xpath"))).click();
	}
		
	public void click_viewcart_dress() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("HomePage_category_viewCart_dress_xpath"))).click();
	
	}
	
	
	//Check Out Functionality
	public void click_checkout_dress() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("HomePage_category_checkout_dress_xpath"))).click();
	}
	
	//Page Scrolling(up/Down)
	public void scroll_page_down() throws Exception
	{
		Actions act =new Actions(driver);
		//act.scrollByAmount(0, 1000).perform();
		act.sendKeys(Keys.PAGE_DOWN).perform();
	}

	public void enter_text_comment_dress(String comments) throws Exception
	{
		driver.findElement(By.cssSelector(ReadPropFiles.readelement("HomePage_category_comments_dress_css"))).sendKeys(comments);
	}
	
	public void click_placeOrder_dress() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("HomePage_category_placeOrder_dress_xpath"))).click();
	}
	
				public void enter_nameInCard(String nameInCard) throws Exception 
	{
			driver.findElement(By.name(ReadPropFiles.readelement("HomePage_category_cardInfo_accntName_name"))).sendKeys(nameInCard);
		}
	
			public void enter_CardNumber(String cardNumber) throws Exception 
			{
					driver.findElement(By.name(ReadPropFiles.readelement("HomePage_category_cardInfo_cardNumber_name"))).sendKeys(cardNumber);
				}
			
			
			public void enter_cvc(String cvc) throws Exception 
			{
					driver.findElement(By.cssSelector(ReadPropFiles.readelement("HomePage_category_cardInfo_cvc_css"))).sendKeys(cvc);
				}
			
			public void enter_expMonth(String expMonth) throws Exception 
			{
					driver.findElement(By.xpath(ReadPropFiles.readelement("HomePage_category_cardInfo_expMonth_xpath"))).sendKeys(expMonth);
				}
	
			public void enter_expYear(String expYear) throws Exception 
			{
					driver.findElement(By.name(ReadPropFiles.readelement("HomePage_category_cardInfo_expYear_name"))).sendKeys(expYear);
				}
			
			public void click_submitbttn() throws Exception 
			{
					driver.findElement(By.id(ReadPropFiles.readelement("HomePage_category_cardInfo_submitbttn_id"))).click();
				}
			
			public void validate_orderPlace_confPage() throws Exception 
			{
				
				String ExptPage="Automation Order Placed";	
				//String ExptPage="Automation Exercise - Order Placed";	
				String ActPage=driver.getTitle();
				Assert.assertEquals(ActPage,ExptPage);
				
				//SoftAssert Assertion
				//String ExptPage="Automation Order Placed";	
				String ExptPage="Automation Exercise - Order Placed";	
				String ActPage=driver.getTitle();
				
				SoftAssert sa=new SoftAssert();
				sa.assertEquals(ActPage,ExptPage);
				sa.assertAll();
													
				}
					
					public void click_continuebttn() throws Exception 
			{
					driver.findElement(By.xpath(ReadPropFiles.readelement("HomePage_category_lastPage_continue_xpath"))).click();
				}
							
			public void validate_return_homepage() throws Exception 
			{
				String ExptPage="Automation Exercise";	
				//String ExptPage="Automation Exercise - Order Placed";	
				String ActPage=driver.getTitle();
				Assert.assertEquals(ActPage,ExptPage);
				
				}
			//-- End of women category Dress sub category 
			
			//-- start of women category Tops sub category 
			
			
			
			
			//public void click_view_cart_dress() throws Exception
	//{
	//	driver.findElement(By.xpath(ReadPropFiles.readelement("HomePage_category_viewCart_dress_xpath"))).click();
	//}
	
	
	/*
	public void click_category_men() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("HomePage_category_men_xpath"))).click();
	}
	
	public void click_category_kids() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("HomePage_category_kids_xpath"))).click();
	}
	public void scrol_down() throws Exception
	{
	Actions act=new Actions(driver);
	act.sendKeys(Keys.PAGE_DOWN).perform();
	//act.scrollByAmount(0,2000).perform(); 	
	act.sendKeys(Keys.PAGE_DOWN).perform();
	act.sendKeys(Keys.PAGE_DOWN).perform();
	
	act.sendKeys(Keys.PAGE_UP).perform();
	act.sendKeys(Keys.PAGE_UP).perform();
	act.sendKeys(Keys.PAGE_UP).perform();
	
	}
	
	public void click_addCart1() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("HomePage_Add_Cart1_xpath"))).click();
	}
	*/
}
