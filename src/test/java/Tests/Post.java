package Tests;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Post {
	@Test
	public void postreq() {
		
		System.out.println("Post Success");
	
		baseURI="http://localhost:3000/";
		
		JSONObject jsob=new JSONObject();
		jsob.put("name", "Siraj");
		jsob.put("semester",6);
		
		given().contentType(ContentType.JSON).accept(ContentType.JSON).body(jsob.toJSONString())
		.when().post("/students").then().statusCode(201).log().all();
		
	}
}