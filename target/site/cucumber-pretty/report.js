$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddProductToCart.feature");
formatter.feature({
  "line": 2,
  "name": "Login",
  "description": "and add most expensive dress to cart",
  "id": "login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 13598972782,
  "status": "passed"
});
formatter.before({
  "duration": 6473925909,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User is on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "SignInSteps.verifyIsUserOnTheHomePage()"
});
formatter.result({
  "duration": 195927871,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "User can able to login and add an expensive dress to cart",
  "description": "",
  "id": "login;user-can-able-to-login-and-add-an-expensive-dress-to-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@addtothecart"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User selects SignIn link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User should see the Login Page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User enter email as \"bjsstest234+134@gmail.com\" password as \"Password123\" and select Signin button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User should see my account page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User should see his name as \"Test test\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user selects home button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User is on the home page",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user click on Dresses",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user should see dress products",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 19,
      "value": "#    Then user select highest price option from sorting"
    }
  ],
  "line": 20,
  "name": "user Quick view dress product",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "add the item to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user proceed to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user should be on Shopping cart page",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "user should see S size Dress",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user should see the correct price for Dress",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user select signout link",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user should signout successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInSteps.user_selects_SignIn_link()"
});
formatter.result({
  "duration": 2036342193,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.user_should_see_the_Login_Page()"
});
formatter.result({
  "duration": 72571219,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bjsstest234+134@gmail.com",
      "offset": 21
    },
    {
      "val": "Password123",
      "offset": 61
    }
  ],
  "location": "SignInSteps.user_enter_email_as_password_as_and_select_Signin_button(String,String)"
});
formatter.result({
  "duration": 2195706145,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountSteps.user_see_my_account_page()"
});
formatter.result({
  "duration": 127793358,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test test",
      "offset": 29
    }
  ],
  "location": "SignInSteps.user_should_see_his_name_as(String)"
});
formatter.result({
  "duration": 46181720,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.user_selects_home_button()"
});
formatter.result({
  "duration": 1928044281,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.verifyIsUserOnTheHomePage()"
});
formatter.result({
  "duration": 7554634,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseItemSteps.user_click_on_dresses()"
});
formatter.result({
  "duration": 1468430453,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseItemSteps.user_should_see_dress_products()"
});
formatter.result({
  "duration": 709407045,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseItemSteps.user_Quick_view_Dress_product()"
});
formatter.result({
  "duration": 439144336,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseItemSteps.add_the_item_to_the_cart()"
});
formatter.result({
  "duration": 5107193137,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseItemSteps.user_proceed_to_checkout()"
});
formatter.result({
  "duration": 2950524264,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseItemSteps.user_should_be_on_Summary_page()"
});
formatter.result({
  "duration": 33562433,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseItemSteps.user_should_see_S_size_Dress()"
});
formatter.result({
  "duration": 37797462,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseItemSteps.user_should_see_dollar_price_for_Dress()"
});
formatter.result({
  "duration": 28291757,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseItemSteps.user_select_signout_link()"
});
formatter.result({
  "duration": 2454782115,
  "status": "passed"
});
formatter.match({
  "location": "ReviewPreviousOrdersSteps.user_should_see_signin_link()"
});
formatter.result({
  "duration": 72738008,
  "status": "passed"
});
formatter.after({
  "duration": 160134,
  "status": "passed"
});
formatter.after({
  "duration": 53150,
  "status": "passed"
});
formatter.after({
  "duration": 39294,
  "status": "passed"
});
formatter.uri("CreateAccount.feature");
formatter.feature({
  "line": 2,
  "name": "Create an account",
  "description": "",
  "id": "create-an-account",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@createaccount"
    }
  ]
});
formatter.before({
  "duration": 6707427630,
  "status": "passed"
});
formatter.before({
  "duration": 7032980380,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "SignInSteps.verifyIsUserOnTheHomePage()"
});
formatter.result({
  "duration": 28116829,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "User can able to create an account",
  "description": "",
  "id": "create-an-account;user-can-able-to-create-an-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "User selects SignIn link",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User should see the Create Account Page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User enter email as \"bjsstest234+139@gmail.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User should see account registration page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User fill in account creation details",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User should see my account page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user select signout link",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user should signout successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInSteps.user_selects_SignIn_link()"
});
formatter.result({
  "duration": 2094440913,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountSteps.user_should_see_the_Create_Account_Page()"
});
formatter.result({
  "duration": 66483742,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bjsstest234+139@gmail.com",
      "offset": 21
    }
  ],
  "location": "CreateAccountSteps.user_enter_email_as_password_as_and_select_Signin_button(String)"
});
formatter.result({
  "duration": 469860362,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountSteps.user_see_account_registration_page()"
});
formatter.result({
  "duration": 1857768243,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountSteps.user_fill_in_account_creation_details()"
});
formatter.result({
  "duration": 3284598815,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountSteps.user_see_my_account_page()"
});
formatter.result({
  "duration": 95992576,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseItemSteps.user_select_signout_link()"
});
formatter.result({
  "duration": 1527838931,
  "status": "passed"
});
formatter.match({
  "location": "ReviewPreviousOrdersSteps.user_should_see_signin_link()"
});
formatter.result({
  "duration": 50226435,
  "status": "passed"
});
formatter.after({
  "duration": 52081,
  "status": "passed"
});
formatter.after({
  "duration": 604766,
  "status": "passed"
});
formatter.after({
  "duration": 30832,
  "status": "passed"
});
formatter.uri("ReviewPreviousOrders.feature");
formatter.feature({
  "line": 2,
  "name": "Review Previous Orders and add a message",
  "description": "",
  "id": "review-previous-orders-and-add-a-message",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@reviewprevorder"
    }
  ]
});
formatter.before({
  "duration": 7886118564,
  "status": "passed"
});
formatter.before({
  "duration": 12241323827,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "SignInSteps.verifyIsUserOnTheHomePage()"
});
formatter.result({
  "duration": 25667086,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Review Previous Orders and add a message successfully",
  "description": "",
  "id": "review-previous-orders-and-add-a-message;review-previous-orders-and-add-a-message-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "User selects SignIn link",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User should see the Login Page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User enter email as \"bjsstest234+134@gmail.com\" password as \"Password123\" and select Signin button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User should see his name as \"Test test\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user selects home button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User is on the home page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user selects my orders",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user should navigate to order history page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 16,
      "value": "#    When user select product from previous order as \"Printed Dress - Color : Orange, Size : S\""
    }
  ],
  "line": 17,
  "name": "user select signout link",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user should signout successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInSteps.user_selects_SignIn_link()"
});
formatter.result({
  "duration": 306438725,
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003ca class\u003d\"login\" href\u003d\"http://automationpractice.com/index.php?controller\u003dmy-account\" rel\u003d\"nofollow\" title\u003d\"Log in to your customer account\"\u003e...\u003c/a\u003e is not clickable at point (1153, 83). Other element would receive the click: \u003ca href\u003d\"http://automationpractice.com/index.php?controller\u003dcontact\" title\u003d\"Contact Us\"\u003e...\u003c/a\u003e\n  (Session info: chrome\u003d78.0.3904.87)\nBuild info: version: \u00273.9.1\u0027, revision: \u002763f7b50\u0027, time: \u00272018-02-07T22:25:02.294Z\u0027\nSystem info: host: \u0027UK-AB400-M.local\u0027, ip: \u0027fe80:0:0:0:91:18cf:26ab:da35%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.6\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 78.0.3904.87, chrome: {chromedriverVersion: 78.0.3904.70 (edb9c9f3de024..., userDataDir: /var/folders/ds/t4p9fz1s7lq...}, goog:chromeOptions: {debuggerAddress: localhost:63909}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 889a88d98e7aff362fed4dd1546e5166\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:160)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:279)\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\n\tat com.automationPractice.Pages.HomePage.navigateToSignPage(HomePage.java:53)\n\tat com.automationPractice.StepDefinitions.SignInSteps.user_selects_SignIn_link(SignInSteps.java:50)\n\tat ✽.When User selects SignIn link(ReviewPreviousOrders.feature:8)\n",
  "status": "failed"
});
formatter.match({
  "location": "SignInSteps.user_should_see_the_Login_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "bjsstest234+134@gmail.com",
      "offset": 21
    },
    {
      "val": "Password123",
      "offset": 61
    }
  ],
  "location": "SignInSteps.user_enter_email_as_password_as_and_select_Signin_button(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Test test",
      "offset": 29
    }
  ],
  "location": "SignInSteps.user_should_see_his_name_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SignInSteps.user_selects_home_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SignInSteps.verifyIsUserOnTheHomePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ReviewPreviousOrdersSteps.user_selects_my_orders()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ReviewPreviousOrdersSteps.user_should_navigate_to_order_history_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PurchaseItemSteps.user_select_signout_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ReviewPreviousOrdersSteps.user_should_see_signin_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 2032857316,
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 1371672578,
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "duration": 1539536398,
  "status": "passed"
});
});