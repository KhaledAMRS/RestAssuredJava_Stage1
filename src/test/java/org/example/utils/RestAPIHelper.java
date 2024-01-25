package org.example.utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.Map;

public class RestAPIHelper {

    public static Response postAPIRequest(String url, String requestBody, Map requestHeaders) {

        return RestAssured.given().headers(requestHeaders).body(requestBody).baseUri(url)
                .when().post().then()
                .assertThat().statusCode(200).extract().response();
    }

    public static Response getAPIRequest(String url, String requestBody, Map requestHeaders) {
        return RestAssured.given().headers(requestHeaders).baseUri(url).when().get().then().assertThat()
                .statusCode(200).extract().response();
    }

    public static Response putAPIRequest(String url, String requestBody, Map requestHeaders) {
        return RestAssured.given().headers(requestHeaders).body(requestBody).baseUri(url).when()
                .put().then().assertThat().statusCode(200).extract().response();
    }

    public static Response patchAPIRequest(String url, String requestBody, Map requestHeaders) {
        return RestAssured.given().headers(requestHeaders).body(requestBody)
                .baseUri(url).when().patch().then().assertThat().statusCode(200).extract().response();
    }

    public static Response deleteAPIRequest(String url, String requestBody, Map requestHeaders) {
        return RestAssured.given().headers(requestHeaders)
                .baseUri(url).when().delete().then().extract().response();
    }

}
