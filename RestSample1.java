package api.com;
import static com.jayway.restassured.RestAssured.given;

import org.testng.annotations.Test;


public class RestSample1 {

 @Test
 public void makeSureThatGoogleIsUp() {
     given().when().get("http://www.google.com").then().statusCode(200);
 }
}