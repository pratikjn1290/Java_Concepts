package baseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass extends BaseClass {

	@Test
	public void testapplication() {
		WebElement elem = driver.findElement(By.name("q"));
		elem.sendKeys("Learn-Automation");
		System.out.println(driver.getTitle());
		Reporter.log("----------First Test Completed--------------");
	}
	
	
	
	@Test
	public void testapplication2() {
		WebElement elem = driver.findElement(By.name("q"));
		elem.sendKeys("Learn-Automation");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getClass());
		System.out.println(driver.getWindowHandle());
		Reporter.log("----------Second Test Completed--------------");
	}

}
