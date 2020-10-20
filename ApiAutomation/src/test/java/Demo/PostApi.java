package Demo;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PostApi {

	@Test
	public void post() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "pratik");
		map.put("job", "QA");

		System.out.println(map);

		JSONObject jso = new JSONObject();
		jso.put("name", "pratik");
		jso.put("job", "QA");

		System.out.println(jso.toJSONString());

		given().body(jso.toJSONString()).when().post("https://reqres.in/api/users").then().statusCode(201);

	}

}
