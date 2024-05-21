package Rest_Assured;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import org.hamcrest.Matchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
public class Session04 {
//https://reqres.in/api/users?page=2
	@Test
	public void test_1() {
	Response response=get("https://reqres.in/api/users?page=2");
	int statuscode=response.getStatusCode();
	System.out.println(statuscode);
//	System.out.println(response.getHeader("Content-Type"));
//	System.out.println(response.getStatusLine());
//	System.out.println(response.getTime());
	System.out.println(response.getBody().asPrettyString());
	System.out.println(response.getBody().asString());
	
	Assert.assertEquals(statuscode,200);
	
}
	@Test
	public void test_2() {
		baseURI="https://reqres.in/api";
	given()
		.get("/users?page=2")	
	.then()
		.statusCode(200).body("data.id[1]", equalTo(8));
		
	
}
	private ResponseAwareMatcher<Response> equalTo(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
