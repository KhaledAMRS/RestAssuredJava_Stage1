package org.example.stepDefs;

import io.cucumber.java.BeforeAll;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.example.endpoints.UsersEndPoints;
import org.example.utils.ConfigurationReader;

public class Hooks {
  static Response response;
  static JsonPath path;
    @BeforeAll
    public static void getToken() {
        response = UsersEndPoints.authloginEndPoint();

        response.prettyPrint();
        path = response.jsonPath();

        String accesstoken = path.getString("data.access_token");

        ConfigurationReader.set("accesstoken",accesstoken);

    }
}