
  Feature: Get user's book list

    @book
    Scenario: User should able to see the collection
      Given User should see the book list
      Then User should verify the book status code