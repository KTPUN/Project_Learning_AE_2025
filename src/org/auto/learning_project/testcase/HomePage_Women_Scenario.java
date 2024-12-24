package org.auto.learning_project.testcase;

import org.auto.learning_project.pages.HP_Women_Category;
import org.auto.learning_project.pages.LoginPage;
import org.auto.learning_project.pages.RegistrationPage;
import org.auto.learning_project_basePkg.InitializeBrowser;
import org.testng.annotations.Test;


public class HomePage_Women_Scenario extends InitializeBrowser
{

	@Test(priority=2) //dependsOnMethods="tc002_LoginFunct"
	public void tc03_validhomepagefunc() throws Exception
	{
      LoginPage login = new LoginPage(driver);
		
		login.click_signuploginbttn();
		login.enter_email("nepal@gmail.com");
		login.enter_password("nepal123");
		Thread.sleep(3000);
		login.click_loginbttn(); 
		login.validate_login();
		Thread.sleep(3000);
		
		
		HP_Women_Category  homepg = new HP_Women_Category(driver);
		
		homepg.click_category_women();
		Thread.sleep(3000);
		homepg.click_sub_category_dress();
		Thread.sleep(3000);
		homepg.click_view_product1_dress();
		Thread.sleep(3000);
		homepg.click_add_to_cart1_dress();
		Thread.sleep(3000);
		
		homepg.click_continue1_dress();
		Thread.sleep(3000);
		
		homepg.click_view_product2_dress();
		Thread.sleep(3000);
		homepg.click_add_to_cart2_dress();
		Thread.sleep(3000);
		homepg.click_continue2_dress();
		Thread.sleep(3000);
		homepg.click_view_product3_dress();
		Thread.sleep(3000);
		homepg.click_add_to_cart3_dress();
		Thread.sleep(3000);
				
		homepg.click_viewcart_dress();
		Thread.sleep(3000);
							
		homepg.click_checkout_dress();
		Thread.sleep(3000);
		homepg.scroll_page_down();
		Thread.sleep(3000);
		homepg.enter_text_comment_dress("Order should be delivered by 20 December 2024");
		Thread.sleep(3000);
		homepg.click_placeOrder_dress();
		
		Thread.sleep(3000);
		homepg.enter_nameInCard("Tika Pun");
		Thread.sleep(3000);
		homepg.enter_CardNumber("123542");
		Thread.sleep(3000);
		homepg.enter_cvc("123");
		Thread.sleep(3000);
		homepg.enter_expMonth("07");
		Thread.sleep(3000);
		homepg.enter_expYear("2030");
		Thread.sleep(3000);
		homepg.click_submitbttn();
		Thread.sleep(3000);
		homepg.validate_orderPlace_confPage();
		Thread.sleep(3000);
		homepg.click_continuebttn();
		Thread.sleep(3000);
		homepg.validate_return_homepage();
					
			
		
     }
}