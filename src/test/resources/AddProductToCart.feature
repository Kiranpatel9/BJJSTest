
Feature:Login
  and add most expensive dress to cart

Background:
  Given User is on the home page

  @addtothecart
  Scenario:User can able to login and add an expensive dress to cart
    When User selects SignIn link
    Then User should see the Login Page
    When User enter email as "bjsstest234+134@gmail.com" password as "Password123" and select Signin button
    Then User should see my account page
    Then User should see his name as "Test test"
    When user selects home button
    Then User is on the home page
    Then user click on Dresses
    Then user should see dress products
#    Then user select highest price option from sorting
    Then user Quick view dress product
    And add the item to the cart
    And user proceed to checkout
    Then user should be on Shopping cart page
    And user should see S size Dress
    And user should see the correct price for Dress
    When user select signout link
    Then user should signout successfully
