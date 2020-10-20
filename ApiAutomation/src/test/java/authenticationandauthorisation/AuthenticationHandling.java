package authenticationandauthorisation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class AuthenticationHandling {
	@Test
	public void authentication() {
		RestAssured.baseURI = "https://client-api.corpository.com/clientapi/api/cbisysarc/login";
		int scode = RestAssured.given().auth().preemptive().basic("pratik.jain@corpository.com", "!Corpository123")
				.when().get().getStatusCode();

		System.out.println("Response Code: " + scode);

	}

}
