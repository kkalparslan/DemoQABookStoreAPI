
  Feature: Get all books

    @books
    Scenario: User should able to all books list from store
      Given User should see book list
      Then User verify the books status codes