package Demo;
	import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

	public class DeleteAPI {

		@Test
		public void delete() {
			JSONObject jso = new JSONObject();
			given().body(jso.toJSONString()).when().delete("https://reqres.in/api/users/2").then().statusCode(204);

		}

}
