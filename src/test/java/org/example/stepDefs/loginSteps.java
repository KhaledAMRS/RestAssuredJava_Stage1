package org.example.stepDefs;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.example.endpoints.Routes;
import org.example.endpoints.UsersEndPoints;
import org.example.pojo.LoginRequestBody;
import org.example.utils.RestAPIHelper;

import java.util.HashMap;
import java.util.Map;

public class loginSteps {
Response response;

JsonPath path;

    @Given("get auth token")
    public void getAuthToken()
    {
    response= UsersEndPoints.authloginEndPoint();
    response.getBody().prettyPrint();

    //extract value
    path = response.jsonPath();

    String accessToken = path.getString("data.access_token");


    }

}
