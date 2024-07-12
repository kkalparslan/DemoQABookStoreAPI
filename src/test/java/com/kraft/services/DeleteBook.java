package com.kraft.services;

import com.kraft.utilities.ConfigurationReader;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import java.util.HashMap;
import java.util.Map;

public class DeleteBook {

    Response response;

    public void deleteBook(){

        String body="{\n" +
                "  \"isbn\": \""+ConfigurationReader.get("isbn7")+"\",\n" +
                "  \"userId\": \""+ConfigurationReader.get("userID")+"\"\n" +
                "}";

        Map<String,Object> token=new HashMap<>();
        token.put("Authorization", "Bearer " + ConfigurationReader.get("token"));

        response= RestAssured.given().contentType(ContentType.JSON)
                .headers(token)
                .body(body)
                .when().log().all()
                .delete("/BookStore/v1/Book").prettyPeek();
    }
    public void verifyDelete(){
        response.then().statusCode(204);
    }
}
