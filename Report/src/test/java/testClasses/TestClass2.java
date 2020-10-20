package testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class TestClass2 {

	@Test(description = "Test4")
	@Severity(SeverityLevel.NORMAL)
	@Story("Home Story")
	public void test4() {
		Assert.assertEquals(true, true, "Passed");
	}

	@Severity(SeverityLevel.CRITICAL)
	@Test(description = "Test5")
	@Story("Home Story")
	public void test5() {
		Assert.assertEquals(true, true, "Passed");
	}

	@Severity(SeverityLevel.CRITICAL)
	@Story("Home Story")
	@Test(description = "Test6")
	public void test6() {
		Assert.assertEquals(true, false, "Failed");
	}	
	
}
