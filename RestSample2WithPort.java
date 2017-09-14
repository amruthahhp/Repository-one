package api.com;

import org.testng.annotations.BeforeClass;

import com.jayway.restassured.RestAssured;
import static com.jayway.restassured.RestAssured.given;

public class RestSample2WithPort {

    @BeforeClass
    public static void setup() {
        String port = System.getProperty("server.port");
        if (port == null) {
            RestAssured.port = Integer.valueOf(8080);
        }
        else{
            RestAssured.port = Integer.valueOf(port);
        }


        String basePath = System.getProperty("server.base");
        if(basePath==null){
            basePath = "/rest-garage-sample/";
        }
        RestAssured.basePath = basePath;

        String baseHost = System.getProperty("server.host");
        if(baseHost==null){
            baseHost = "https://en.wikipedia.org/";
        }
        RestAssured.baseURI = baseHost;

    }

}

