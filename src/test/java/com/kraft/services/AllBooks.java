package com.kraft.services;

import com.kraft.utilities.ConfigurationReader;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import java.util.HashMap;
import java.util.Map;

public class AllBooks {

    Response response;

    public void bookList(){
        Map<String,Object>token=new HashMap<>();
        token.put("Authorization", "Bearer " +ConfigurationReader.get("token"));

        response= RestAssured.given().contentType(ContentType.JSON)
                .headers(token)
                .when().log().all()
                .get("/BookStore/v1/Books").prettyPeek();
    }

    public void verifyBookList(){
        response.then().statusCode(200);
    }
}
