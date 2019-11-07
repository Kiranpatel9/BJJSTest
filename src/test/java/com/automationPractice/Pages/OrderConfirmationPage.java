package com.automationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationPage extends BasePage {
    

    @FindBy(css="h1.page-heading")
    WebElement orderConfirmationHeader;

    @FindBy(xpath = "//header[@id='header']/div[2]/div/div/nav/div[2]/a")
    WebElement signOut;

    
    public OrderConfirmationPage(){
        PageFactory.initElements(driver,this);
    }
    
    public Boolean viewOrderConfirmaionHeader(){
        return orderConfirmationHeader.isDisplayed();
    }
    public void signOutLink(){
        signOut.click();
    }
}
