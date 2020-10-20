package testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;


public class TestClass1 {

	SoftAssert asert = new SoftAssert();	
	@Test(description = "Test1")
	@Severity(SeverityLevel.TRIVIAL)
	@Story("Login Story")
	public void test1() {
		asert.assertEquals(true, true, "Passed");
		asert.assertAll();
	}

	@Test(description = "Test2")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Login Story")
	public void test2() {
		asert.assertEquals(true, true, "Passed");
		asert.assertAll();
	}

	@Test(description = "Test3")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Login Story")
	public void test3() {
		asert.assertEquals(true, true, "Passed");
		asert.assertAll();
	}
	
	@Test(description = "Test7")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Login Story")
	public void test7() {
		asert.assertEquals(true, false, "Failed");
		asert.assertAll();
	}
	
	@Test(description = "Test8")
	@Severity(SeverityLevel.CRITICAL)
	@Story("Login Story")
	public void test8() {
		asert.assertEquals(true, false, "Failed");
		asert.assertAll();
	}

}

