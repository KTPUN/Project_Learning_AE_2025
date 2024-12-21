package org.auto.learning_project.testcase;

import org.auto.learning_project.pages.LoginPage;
import org.auto.learning_project.pages.RegistrationPage;
import org.auto.learning_project_basePkg.InitializeBrowser;
import org.testng.annotations.Test;


public class LoginScenario extends InitializeBrowser
{

	@Test
	public void tc02_validloginfunc() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.click_signuploginbttn();
		login.enter_email("nepal@gmail.com");
		login.enter_password("nepal123");
		Thread.sleep(3000);
		login.click_loginbttn(); 
		login.validate_login();
		Thread.sleep(3000);
		
		login.click_logoutbttn_negTest();
		Thread.sleep(3000);
		login.enter_valid_email("nepal@gmail.com"); 
		login.enter_invalid_password("12345");
		Thread.sleep(3000);
		login.click_loginbttn_for_negTest();
		//For validation 
		login.neg_validate_login();
				
	}
}
