package helper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import org.json.simple.JSONObject;


public class TempApi {

    RequestSpecification httpRequest;
    Response response;
    String url = "http://localhost:3000/";

    @Test
    public void testingAPI(){
        RestAssured.baseURI = url;
        httpRequest = RestAssured.given().auth().preemptive().basic("admin", "admin");

        //Get request
//        response = httpRequest.get("/api/teams/search?name=Teamtam");
//

        //Post request
        JSONObject params = new JSONObject();

        params.put("name", "ATeam");
        params.put("email", "AATeam@gmail.com");
        httpRequest.header("Content-Type", "application/json");
        httpRequest.body(params.toJSONString());
//        response = httpRequest.post("/api/teams");
//        response = httpRequest.put("/api/teams/2");
        response = httpRequest.delete("/api/teams/2");
        response.prettyPrint();

    }
}
