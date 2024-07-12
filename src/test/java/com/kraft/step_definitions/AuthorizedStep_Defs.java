package com.kraft.step_definitions;

import com.kraft.services.Authorized;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AuthorizedStep_Defs {
    Authorized authorized=new Authorized();

    @Given("User should be authorized with valid credentials")
    public void user_should_be_authorized_with_valid_credentials() {
        authorized.userAuthorized();
    }

    @Then("verify authorized Status Code")
    public void verify_authorized_Status_Code() {
        authorized.verifyAuthorizedStatusCode();
    }
}
