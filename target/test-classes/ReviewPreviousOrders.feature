@reviewprevorder
Feature:Review Previous Orders and add a message

  Background:
    Given User is on the home page

  Scenario: Review Previous Orders and add a message successfully
    When User selects SignIn link
    Then User should see the Login Page
    When User enter email as "bjsstest234+134@gmail.com" password as "Password123" and select Signin button
    Then User should see his name as "Test test"
    When user selects home button
    Then User is on the home page
    When user selects my orders
    Then user should navigate to order history page
#    When user select product from previous order as "Printed Dress - Color : Orange, Size : S"
    When user select signout link
    Then user should signout successfully