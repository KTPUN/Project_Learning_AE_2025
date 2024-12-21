package org.auto.learning_project.testcase;

import org.auto.learning_project.pages.LoginPage;
import org.auto.learning_project_basePkg.InitializeBrowser;
import org.auto.learning_project_datagenerators.TestDataGeneraor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class LoginScenario_DDF extends InitializeBrowser 
{

	@Test(DataProvider="staticdata",dataProviderClass=TestDataGeneraor.class)
	public void tc002_validcredentialLogin(String username, String password) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.click_signuploginbttn();
		login.enter_email(username);
		login.enter_password(password);
		login.click_loginbttn();
					
	}

}
