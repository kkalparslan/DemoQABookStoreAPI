
  Feature: User should able to generate new token

  @generate
    Scenario: User should input the valid credentials
      Given Input valid credentials
      Then verify token Status Code