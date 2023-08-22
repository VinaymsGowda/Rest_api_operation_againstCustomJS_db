package Tests;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Delete {
	@Test
	public void postreq() {
		
		System.out.println("Delete Success");
	
		baseURI="http://localhost:3000/";
		
		when().delete("/teachers/1").then().statusCode(200).log().all();
	}
}