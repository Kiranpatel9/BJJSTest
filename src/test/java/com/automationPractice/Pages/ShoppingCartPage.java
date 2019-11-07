package com.automationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractice.Utils.Utils;

public class ShoppingCartPage extends BasePage {
    
    @FindBy(css="h1.page-heading")
    WebElement shoppingCartHeading;

    @FindBy(xpath = "//a[text()='Color : Orange, Size : S']")
    WebElement dressSize;

    @FindBy(xpath = "//span[@id='product_price_3_13_234954']/span")
    WebElement dressPrice;



    public ShoppingCartPage(){
        PageFactory.initElements(driver,this);
    }

    public Boolean viewShopppingCartHeader(){
        return shoppingCartHeading.isDisplayed();
    }
    public String getDressSize(){
       return dressSize.getText();
    }

    public String checkDressPrice(){
        return dressPrice.getText();
    }

}
