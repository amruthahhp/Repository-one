package api.com;

import org.testng.annotations.Test;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;

public class RestSample3A extends RestSample2WithPort{
	
	@Test
	public void ValidateApplicationUrlIsUp(){
		RestAssured.given().contentType(ContentType.JSON).when().get(" http://api.5min.com/").then().statusCode(200);
	}
	@Test
    public void invalidParkingSpace() {
		RestAssured.given().when().get("https://pimadmin-uat.apple.com/v/")
            .then().statusCode(404);
    }
	
	
	

}
