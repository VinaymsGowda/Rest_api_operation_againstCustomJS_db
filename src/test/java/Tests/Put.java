package Tests;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Put {
	@Test
	public void postreq() {
		
		System.out.println("Put Success");
	
		baseURI="http://localhost:3000/";
		
		JSONObject jsob=new JSONObject();
		jsob.put("name", "Shashank");
		jsob.put("semester",7);
		
		given().contentType(ContentType.JSON).accept(ContentType.JSON).body(jsob.toJSONString())
		.when().put("/students/3").then().statusCode(200).log().all();
		
	}
}