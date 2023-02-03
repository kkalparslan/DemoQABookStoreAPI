package com.kraft.services;

import com.kraft.utilities.ConfigurationReader;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class GenerateToken {

    Response response;
    public String token;

    public void generateToken(){
        /**
        {
           "userName": "string",
           "password": "string"
          }

         */
        String password= ConfigurationReader.get("commonPassword");
        String username=ConfigurationReader.get("username");

        Map<String,Object>body=new HashMap<>();
        body.put("userName",username);
        body.put("password",password);

        response= RestAssured.given().contentType(ContentType.JSON)
                .body(body)
                .when().log().all()
                .post("/Account/v1/GenerateToken").prettyPeek();

        token=response.path("token");
        System.out.println("token = " + token);
    }
    public void verifyGenerateStatusCode(){
        response.then().statusCode(200);
    }
}
