package Rest_Assured;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class Get_Method2 {
	@Test 
public void test1() {
	
	//https://reqres.in/api/users?page=2
	RestAssured.given().get("https://reqres.in/api/users?page=2")
	.then().statusCode(200)
	.body("total",equalTo(12));
	
		
		
		
}
}
