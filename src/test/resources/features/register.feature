Feature: New user register


  Scenario: User should able to register
    Given User should register with valid credentials
    Then User should verify status code