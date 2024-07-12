package com.kraft.step_definitions;

import com.kraft.services.GetUserByID;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GetUserByIdStep_Defs {

    GetUserByID getUserByID=new GetUserByID();

    @Given("User should see the book list")
    public void user_should_see_the_book_list() {
        getUserByID.getUser();
    }

    @Then("User should verify the book status code")
    public void user_should_verify_the_book_status_code() {
        getUserByID.verifyUser();
    }
}
