package Tests;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Patch {
	@Test
	public void postreq() {
		
		System.out.println("Patch Success");
	
		baseURI="http://localhost:3000/";
		
		JSONObject jsob=new JSONObject();
		jsob.put("name", "aakash");
		jsob.put("semester",8);
		
		given().contentType(ContentType.JSON).accept(ContentType.JSON).body(jsob.toJSONString())
		.when().patch("/students/2").then().statusCode(200).log().all();
		
	}
}