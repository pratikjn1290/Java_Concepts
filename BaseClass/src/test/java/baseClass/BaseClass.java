package baseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public WebDriver driver;

	@BeforeClass
	public void setupbrowser() {

		Reporter.log("----------Browser Initiated----------");
		System.setProperty("webdriver.gecko.driver", "C:/Users/Pratik/git/SeleniumDemo/Selenium/Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.google.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@AfterClass
	public void stopbrowser()

	{
		driver.close();
		Reporter.log("----------Browser Closed----------");
	}

}
