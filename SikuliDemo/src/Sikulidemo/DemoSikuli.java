package Sikulidemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class DemoSikuli {

	public static void main(String[] args) throws FindFailed, Exception {

		System.getProperties();
		Screen s1 = new Screen();
		Pattern img1 = new Pattern("C:/Users/Pratik/Desktop/RestAssured/SikuliDemo/Screenshots/EmailId.png");
		Pattern img2 = new Pattern("C:/Users/Pratik/Desktop/RestAssured/SikuliDemo/Screenshots/Password.png");
		Pattern img3 = new Pattern("C:/Users/Pratik/Desktop/RestAssured/SikuliDemo/Screenshots/Signin.png");
		Pattern img4 = new Pattern("C:/Users/Pratik/Desktop/RestAssured/SikuliDemo/Screenshots/TermsandCondition.png");
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Pratik\\Desktop\\RestAssured\\SikuliDemo\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://test.corpository.com/home/authentication/login");
		driver.manage().window().maximize();
		

		s1.wait(img1, 10);

		s1.type(img1, "pratik.jain@corpository.com");

		// This will type of password field

		s1.type(img2, "password1");

		// This will click on login button

		s1.click(img3);
		
		s1.click(img4);
	}

}