package org.auto.learning_project.testcase;

import org.auto.learning_project.pages.RegistrationPage;
import org.auto.learning_project_basePkg.InitializeBrowser;
import org.testng.annotations.Test;


public class SignupScenario extends InitializeBrowser
{

	@Test
	public void tc01_validsignupfunc() throws Exception
	{
		RegistrationPage signup = new RegistrationPage(driver);
		
		signup.click_signuploginbttn();
		signup.enter_name("Tika Pun");
		signup.enter_email("nepal_890@gmail.com");
		Thread.sleep(3000);
		signup.click_signupbttn(); 
		signup.select_male_radiobttn(); 
		signup.enter_name1("Tika");
		//signup.enter_email1=
		signup.enter_newpassword("nepal123");
		signup.dob_day("5");
		signup.dob_month("January");
		signup.dob_year("1980");
		signup.checkbox1();
		signup.checkbox2();
		Thread.sleep(3000);
		signup.enter_fname("Tika");
		signup.enter_lname("Pun");
		signup.enter_company("Amazon");
		Thread.sleep(3000);
		signup.scroll_down0();
		//signup.scroll_down();
		Thread.sleep(3000);
		signup.enter_address("123 Davis st");
		signup.enter_address2("Apt 23");
		signup.enter_country("United States");
		signup.enter_state("California");
		signup.enter_city ("Oakland");
		//signup.scroll_up();
		signup.scroll_up1();
		Thread.sleep(3000);
		signup.scroll_down2();
		//signup.scroll_down1();
		Thread.sleep(3000);
		signup.enter_zipcode("12542");
		signup.enter_mobilenumber("2145258545");
		Thread.sleep(3000);
		//signup.scroll_up();
		signup.scroll_up1();
		Thread.sleep(3000);
		signup.scroll_down2();
		//signup.scroll_down1();
		Thread.sleep(3000);
		/*
		signup.click_create_accountbttn();
		Thread.sleep(3000);
		signup.click_continuebttn();
		Thread.sleep(5000);
		signup.click_logoutbttn(); */
	}
}
