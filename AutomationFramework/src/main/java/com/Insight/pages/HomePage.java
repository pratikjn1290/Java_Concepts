package com.Insight.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Insight.baseclass.TestBase;

public class HomePage extends TestBase {


	@FindBy(xpath = "//a[text() = 'Events ']")
	WebElement selectedTab;
	
	public HomePage() {

		PageFactory.initElements(driver, this);

	}
	
	public String verifySelectedTab() {
		return selectedTab.getText();
	}
}
