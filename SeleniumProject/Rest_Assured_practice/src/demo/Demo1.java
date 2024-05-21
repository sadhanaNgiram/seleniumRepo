package demo;

import java.net.URI;

import org.testng.annotations.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Demo1 {
	@test
	public void test_1() {
given()
.get("https://reqres.in/api/users?page=2")
.then().statusCode();
	}
}

