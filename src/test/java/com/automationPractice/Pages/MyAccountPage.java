package com.automationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends BasePage {
    
    @FindBy(css = ".account")
    WebElement accountName;

    @FindBy(xpath = "//div[@id='center_column']/ul/li/a/span/i")
    WebElement homeButton;

    
    public MyAccountPage(){
        PageFactory.initElements(driver,this);
    }
    
    
    public String getAccountName() {
        return accountName.getText();
    }
    public void navigateToHomePage(){
        homeButton.click();
    }
}
