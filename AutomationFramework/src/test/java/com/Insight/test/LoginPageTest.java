package com.Insight.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Insight.baseclass.TestBase;
import com.Insight.pages.ForgotPassword;
import com.Insight.pages.HomePage;
import com.Insight.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage login;
	HomePage homepage;
	ForgotPassword fp;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initApplication();
		login = new LoginPage();
	}

	@Test
	public void loginPageTitle() {
		String title = login.verifyTitle();
		Assert.assertEquals(title, "Corpository | Indian Company Information | Financials");
	}

	@Test
	public void LoginPagetest() {
		homepage = login.login(reader.getUsername(), reader.getPassword());
	}

	@Test
	public void forgotPasswordTest() {

		login.verifyForgotPassword();
		String header = fp.verifyHeader();
		Assert.assertEquals(header, "Forgot Password");
	}

	@AfterMethod
	public void closeall() {
		tearDown();
	}
}
