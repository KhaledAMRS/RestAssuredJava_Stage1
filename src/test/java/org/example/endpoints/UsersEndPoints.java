package org.example.endpoints;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import org.example.pojo.LoginRequestBody;
import org.example.utils.RestAPIHelper;

import java.util.HashMap;
import java.util.Map;

public class UsersEndPoints {
    static Response response;
    static Map requestHeaders;
    static ObjectMapper objectMapper;

    public static Response authloginEndPoint() {
        //headers
        requestHeaders = new HashMap<>();
        requestHeaders.put("Content-Type", "application/json");

        //request body
        LoginRequestBody loginrequestbody = new LoginRequestBody();
        loginrequestbody.setEmail("marklyan@gmail.com");
        loginrequestbody.setPassword("simple_password");

        objectMapper =new ObjectMapper();
        String requestBody;
        try {
            requestBody = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(loginrequestbody);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        //send request
        response = RestAPIHelper.postAPIRequest(Routes.auth_login, requestBody,requestHeaders);

        return response;
    }


}
