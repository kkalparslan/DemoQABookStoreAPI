package com.kraft.step_definitions;

import com.kraft.services.GenerateToken;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GenerateTokenStep_Defs {

    GenerateToken generateToken=new GenerateToken();

    @Given("Input valid credentials")
    public void input_valid_credentials() {
        generateToken.generateToken();
    }

    @Then("verify token Status Code")
    public void verify_token_Status_Code() {
        generateToken.verifyGenerateStatusCode();
    }
}
