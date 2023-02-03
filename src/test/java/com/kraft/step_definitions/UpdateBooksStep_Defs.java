package com.kraft.step_definitions;

import com.kraft.services.UpdateBooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class UpdateBooksStep_Defs {
    UpdateBooks updateBooks=new UpdateBooks();
    @Given("User should update the collection")
    public void user_should_update_the_collection() {
        updateBooks.updateBook();

    }

    @Then("User should verify the update status code")
    public void user_should_verify_the_update_status_code() {
        updateBooks.verifyUpdate();
    }
}
