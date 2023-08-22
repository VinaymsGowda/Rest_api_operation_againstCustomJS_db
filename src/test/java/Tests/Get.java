package Tests;

import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Get {
	@Test
	public void getreq() {
		
		System.out.println("Get Success");
	
		baseURI="http://localhost:3000/";
		
		given().
			get("/students").
		then().
			statusCode(200).log().all();
		
	}
	
	
}
