
  Feature: Add new book

    @add
    Scenario: User should able to add new book to the collection
      Given User should add new book
      Then User should verify the add book status code