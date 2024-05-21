package Rest_Assured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.util.*;
import org.json.simple.*;
public class Post_method {
	@Test
public void test_1_post() {
	Map<String,Object> map=new HashMap<String,Object>();
	map.put("name", "morpheus");
	map.put("job", "teacher");
	System.out.println(map);
	JSONObject request=new JSONObject(map);
	System.out.println(request);
	System.out.println(request.toJSONString());
	
	given().header("Content-Type","Application/json")
	.body(request.toJSONString() )
	.when().post("https://reqres.in/api/users")
	.then().statusCode(201);
	

}
}
