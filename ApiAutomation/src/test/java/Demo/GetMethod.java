package Demo;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetMethod {

	@Test
	public void test() {
		Response res = RestAssured.get(
				"https://test-explore-api.corpository.com/1.0/qtapi/rest/server-common/login/getExploreDetails?corpositoryUserId=878");
		System.out.println(res.statusCode());
		System.out.println(res.getBody().asString());
		System.out.println(res.getTimeIn(TimeUnit.SECONDS));
		
		int statuscode = res.getStatusCode();
		Assert.assertEquals(statuscode, 200);

	}

}
