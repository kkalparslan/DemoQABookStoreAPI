package com.kraft.services;

import com.kraft.utilities.ConfigurationReader;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class GetUserByID {

    Response response;

    public void getUser(){
        Map<String,Object> token=new HashMap<>();
        token.put("Authorization", "Bearer " + ConfigurationReader.get("token"));

        response= RestAssured.given().contentType(ContentType.JSON)
                .pathParam("id", ConfigurationReader.get("userID"))
                .headers(token)
                .when().log().all()
                .get("/Account/v1/User/{id}").prettyPeek();
    }

    public void verifyUser(){
        response.then().statusCode(200);
    }
}
