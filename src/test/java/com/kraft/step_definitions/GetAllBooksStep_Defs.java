package com.kraft.step_definitions;

import com.kraft.services.AllBooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GetAllBooksStep_Defs {

    AllBooks allBooks=new AllBooks();

    @Given("User should see book list")
    public void user_should_see_book_list() {
        allBooks.bookList();
    }

    @Then("User verify the books status codes")
    public void user_verify_the_books_status_codes() {
        allBooks.verifyBookList();
    }
}
