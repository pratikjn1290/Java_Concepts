package com.Insight.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Insight.baseclass.TestBase;
import com.Insight.pages.HomePage;

public class HomePageTest extends TestBase{
	HomePage home;
	
	public HomePageTest()
	{
		super();
	}
	
	@Test
	public void verifyMonitorLogo()
	{
		String selectedtab =  home.verifySelectedTab();
		Assert.assertEquals(selectedtab, "Events ");
	}

}
