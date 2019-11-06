package com.automationPractice.StepDefinitions;
import com.automationPractice.Pages.CreateAccountPage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.automationPractice.Pages.BasePage.driver;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.automationPractice.Utils.BrowserFactory;


public class CreateAccountSteps {
    @Before
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


    public CreateAccountPage createAccountPage;

    @Then("^User should see the Create Account Page$")
    public void user_should_see_the_Create_Account_Page() {
        createAccountPage=new CreateAccountPage();
        Assert.assertTrue(createAccountPage.isUserOnCreateAccountPage());
    }

    @When("^User enter email as \"([^\"]*)\"$")
    public void user_enter_email_as_password_as_and_select_Signin_button(String email) {
        createAccountPage.setEmailCreateAccount(email);
    }

    @Then("^User should see account registration page$")
    public void user_see_account_registration_page(){
        createAccountPage.isUserOnAccountCreationPage();
    }

    @And("^User fill in account creation details$")
    public void user_fill_in_account_creation_details(){
        createAccountPage.fillInAccountCreationDetails();
    }

    @Then("^User should see my account page$")
    public void user_see_my_account_page(){
        createAccountPage= new CreateAccountPage();
        createAccountPage.isUserOnMyAccountPage();
    }
}
