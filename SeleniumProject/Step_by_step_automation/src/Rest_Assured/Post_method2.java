package Rest_Assured;
import java.util.Map;
import java.util.HashMap;
import org.json.simple.*;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Post_method2 {
	@Test
	public void test1() {
Map<String,Object> map=new HashMap<String,Object>();
map.put("name", "sadhana");
map.put("job", "teacher");

JSONObject jo=new JSONObject(map);
System.out.println(jo.toJSONString());

RestAssured.given().body(jo.toJSONString()).post("https://reqres.in/api/users")
.then().statusCode(201);


}
	
}
