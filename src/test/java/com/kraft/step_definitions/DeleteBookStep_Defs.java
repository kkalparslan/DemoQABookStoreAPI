package com.kraft.step_definitions;

import com.kraft.services.DeleteBook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DeleteBookStep_Defs {

    DeleteBook deleteBook=new DeleteBook();

    @Given("User should delete a book")
    public void user_should_delete_a_book() {
        deleteBook.deleteBook();
    }

    @Then("User should verify delete status code")
    public void user_should_verify_delete_status_code() {
        deleteBook.verifyDelete();
    }

}
