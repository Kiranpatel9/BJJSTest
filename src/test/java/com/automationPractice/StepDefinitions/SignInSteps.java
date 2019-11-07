package com.automationPractice.StepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.automationPractice.Pages.BasePage.driver;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.automationPractice.Pages.HomePage;
import com.automationPractice.Pages.MyAccountPage;
import com.automationPractice.Pages.SignInPage;
import com.automationPractice.Utils.BrowserFactory;

public class SignInSteps {

    public HomePage homePage;
    public SignInPage signInPage;
    public MyAccountPage myAccountPage;

    @BeforeClass
    public void setUp(){
        BrowserFactory.startBrowser();
    }
    @After
    public void cleanUp(Scenario scenario){
        // BrowserFactory.stopBrowser();

        if(scenario.isFailed()){

            final byte[] scr=((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(scr,"image/png");
        }
    }

    @Given("^User is on the home page$")
    public void verifyIsUserOnTheHomePage(){
        homePage=new HomePage();
        Assert.assertTrue(homePage.getTitle().equalsIgnoreCase("My Store"));
    }
    
    @When("^User selects SignIn link$")
    public void user_selects_SignIn_link() {
        homePage.navigateToSignPage();
    }

    @Then("^User should see the Login Page$")
    public void user_should_see_the_Login_Page() {
        signInPage=new SignInPage();
        Assert.assertTrue(signInPage.isUserOnLoginPage());
    }

    @When("^User enter email as \"([^\"]*)\" password as \"([^\"]*)\" and select Signin button$")
    public void user_enter_email_as_password_as_and_select_Signin_button(String email, String password) {
        signInPage.setEmailPasswordAndSubmit(email,password);
    }

    @Then("^User should see his name as \"([^\"]*)\"$")
    public void user_should_see_his_name_as(String userName) {
        myAccountPage=new MyAccountPage();
        String accountName = myAccountPage.getAccountName();
        Assert.assertEquals(userName, accountName );
    }

    @When("^user selects home button$")
    public void user_selects_home_button() {
        myAccountPage = new MyAccountPage();
        myAccountPage.navigateToHomePage();
    }
}
