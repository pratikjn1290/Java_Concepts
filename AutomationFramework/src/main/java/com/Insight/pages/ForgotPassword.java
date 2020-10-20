package com.Insight.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Insight.baseclass.TestBase;

public class ForgotPassword extends TestBase {

	@FindBy(xpath = "//div[@id = 'signUp']//h2")
	WebElement forgotPassword;

	public ForgotPassword() {
		PageFactory.initElements(driver, this);
	}

	public String verifyHeader() {

		return forgotPassword.getText();
		
	}

}
