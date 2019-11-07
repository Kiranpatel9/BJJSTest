package com.automationPractice.StepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import com.automationPractice.Pages.*;

public class PurchaseItemSteps {
    
	public HomePage homePage;
    public ShoppingCartPage shoppingCartPage;
    public OrderConfirmationPage orderConfirmationPage;

    @Then("^user click on Dresses$")
    public void user_click_on_dresses(){
        homePage=new HomePage();
        homePage.userClickOnDresses();
    }
    @When("^user Quick view dress product$")
    public void user_Quick_view_Dress_product() {
        homePage=new HomePage();
        homePage.viewDressItem();
    }

    @Then("^user should see dress products$")
    public void user_should_see_dress_products() {
        Assert.assertTrue(homePage.isDressHeaderDisplayed());
    }

    @Then("^user select highest price option from sorting$")
    public void user_select_price_sorting(){
        homePage.selectionSortingDrpDown();
    }

    @When("^add the item to the cart$")
    public void add_the_item_to_the_cart() throws InterruptedException {
        homePage.dressAddToCart();
    }

    @When("^user proceed to checkout$")
    public void user_proceed_to_checkout() {
        homePage.proceedToCheckout();
    }

    @Then("^user should be on Shopping cart page$")
    public void user_should_be_on_Summary_page(){
        shoppingCartPage=new ShoppingCartPage();
        shoppingCartPage.viewShopppingCartHeader();
    }

    @Then("^user should see S size Dress$")
    public void user_should_see_S_size_Dress() {
    	Assert.assertTrue(shoppingCartPage.getDressSize().contains("Size : S"));
    }

    @Then("^user should see the correct price for Dress$")
    public void user_should_see_dollar_price_for_Dress() {
    	Assert.assertTrue(shoppingCartPage.checkDressPrice().contains("26"));
    }

    @Then("^user should purchase products successfully$")
    public void user_should_purchase_products_successfully() {
        orderConfirmationPage=new OrderConfirmationPage();
        Assert.assertTrue(orderConfirmationPage.viewOrderConfirmaionHeader());
    }
    @When("^user select signout link$")
    public void user_select_signout_link() {
        orderConfirmationPage=new OrderConfirmationPage();
        orderConfirmationPage.signOutLink();
    }

}
