package com.automationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractice.Utils.Utils;

public class OrderHistoryPage extends BasePage {
   
    @FindBy(xpath = "//h1[text()='Order history']")
    WebElement orderHistoryHeader;

    @FindBy(css=" ")
    WebElement selectProduct;

    @FindBy(css="a.login")
    WebElement signIn;
    
    
    public OrderHistoryPage(){
        PageFactory.initElements(driver,this);
    }

    public Boolean viewOrderHistoryHeader() throws InterruptedException {
        Thread.sleep(5000);
        return orderHistoryHeader.isDisplayed();
    }
    public void selectProdOrder(String prd ){
        Utils.waitForElementVisible(selectProduct);
        Utils.selectByVisibleText(selectProduct,prd);
    }

    public Boolean isSignInDisplayed(){
        return signIn.isDisplayed();
    }
}
