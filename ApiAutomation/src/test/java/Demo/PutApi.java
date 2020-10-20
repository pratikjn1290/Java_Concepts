package Demo;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PutApi {

	@Test
	public void put() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "pratik1");
		map.put("job", "QA2");

		System.out.println(map);

		JSONObject jso = new JSONObject();
		jso.put("name", "pratik1");
		jso.put("job", "QA2");

		System.out.println(jso.toJSONString());

		given().body(jso.toJSONString()).when().put("https://reqres.in/api/users/2").then().statusCode(20);

	}

}
