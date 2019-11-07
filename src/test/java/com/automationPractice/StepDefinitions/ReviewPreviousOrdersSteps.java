package com.automationPractice.StepDefinitions;

import com.automationPractice.Utils.BrowserFactory;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import com.automationPractice.Pages.HomePage;
import com.automationPractice.Pages.OrderHistoryPage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static com.automationPractice.Pages.BasePage.driver;

public class ReviewPreviousOrdersSteps {
    
	public HomePage homePage;
    public OrderHistoryPage orderHistoryPage;
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
    
    @When("^user selects my orders$")
    public void user_selects_my_orders() {
    	homePage=new HomePage();
    	homePage.navigateToOrdersPage();
    }

    @Then("^user should navigate to order history page$")
    public void user_should_navigate_to_order_history_page()throws InterruptedException{
    	orderHistoryPage=new OrderHistoryPage();
    	orderHistoryPage.viewOrderHistoryHeader();
    }

    @When("^user select product from previous order as \"([^\"]*)\"$")
    public void user_select_product_from_previous_order_as_something(String order){
    	orderHistoryPage.selectProdOrder(order);
    }

    @Then("^user should signout successfully$")
    public void user_should_see_signin_link(){
        orderHistoryPage=new OrderHistoryPage();
        Assert.assertTrue(orderHistoryPage.isSignInDisplayed());
    }
}


