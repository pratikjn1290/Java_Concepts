package com.Insight.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Insight.baseclass.TestBase;

public class LoginPage extends TestBase {

	@FindBy(id = "username")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(xpath = "//*[@id='terms']")
	WebElement termsAndCondition;

	@FindBy(xpath = "//button[@id = 'kc-login']")
	WebElement signIn;

	@FindBy(xpath = "//a[text() ='REGISTER HERE']")
	WebElement registration;

	@FindBy(xpath = "//a[text() ='FORGOT PASSWORD?']")
	WebElement forgotPassword;

	public LoginPage() {
		PageFactory.initElements(driver, LoginPage.class);
	}

	// Actions

	public String verifyTitle() {
		return driver.getTitle();
	}

	public ForgotPassword verifyForgotPassword() {
		forgotPassword.click();
		return new ForgotPassword();
	}

	public void verifyRegisterHereLink() {
		registration.click();
	}

	public HomePage login(String uname, String pword) {
		username.sendKeys(uname);
		password.sendKeys(pword);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", termsAndCondition);
		signIn.click();
		return new HomePage();
	}

}