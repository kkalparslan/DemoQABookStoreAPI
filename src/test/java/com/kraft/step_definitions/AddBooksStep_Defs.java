package com.kraft.step_definitions;

import com.kraft.services.AddBooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddBooksStep_Defs {

    AddBooks addBooks=new AddBooks();
    @Given("User should add new book")
    public void user_should_add_new_book() {
        addBooks.addBooks();
    }
    @Then("User should verify the add book status code")

    public void user_should_verify_the_add_book_status_code() {
        addBooks.verifyAddBooks();
    }
}
