package Rest_Assured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class Get_method {
	@Test
public void test_1() {
	given().get("https://reqres.in/api/users?page=2").then().statusCode(200)
	.body("data.id[1]",equalTo(8))
	.body("data.first_name",hasItems("George","Byron"))
	.log().all();
	
}
}
