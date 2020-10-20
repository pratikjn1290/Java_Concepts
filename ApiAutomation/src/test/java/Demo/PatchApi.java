package Demo;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PatchApi {

	@Test
	public void patch() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "pratik2");
		map.put("job", "QA3");

		System.out.println(map);

		JSONObject jso = new JSONObject();
		jso.put("name", "pratik2");
		jso.put("job", "QA3");

		System.out.println(jso.toJSONString());

		given().body(jso.toJSONString()).when().patch("https://reqres.in/api/users/2").then().statusCode(200);

	}

}
