@createaccount
Feature: Create an account

  Background:
    Given User is on the home page

  Scenario: User can able to create an account
    When User selects SignIn link
    Then User should see the Create Account Page
    When User enter email as "bjsstest234+138@gmail.com"
    Then User should see account registration page
    And User fill in account creation details
    Then User should see my account page
    When user select signout link
    Then user should signout successfully