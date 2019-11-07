package com.automationPractice.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractice.Utils.Utils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{
    
    @FindBy(css="a.login")
    WebElement signInLink;

    @FindBy(xpath="//div[@id='block_top_menu']/ul[1]/li[2]")
    WebElement dressesOnMenu;

    @FindBy(xpath="//div[@id='block_top_menu']/ul[1]/li[2]")
    WebElement sortingDrpDown;


    @FindBy(xpath="//ul[@class='product_list grid row'] /li[1]/div/div[1]/div[1]")
    WebElement dressItem;

    @FindBy(xpath = "//div[@id='center_column']/h1/span[1]")
    WebElement dressHeader;

    @FindBy(xpath ="//p[@id='add_to_cart']/button/span")
    WebElement dressAddToCart;

    @FindBy(css="iframe.fancybox-iframe")
    WebElement iframe;


    @FindBy(xpath = "//div[@id='layer_cart']/div[1]/div[2]/div[4]/a")
    WebElement proceedToCheckout;

    @FindBy(xpath = "//a[@title='My orders']")
    WebElement viewOrders;

    
    public HomePage(){
        PageFactory.initElements(driver,this);
    }


    public void navigateToSignPage(){
        signInLink.click();
    }
    public void userClickOnDresses(){
        Utils.waitForElementVisible(dressesOnMenu);
        dressesOnMenu.click();
    }

    public Boolean isDressHeaderDisplayed() {
        Utils.waitForElementVisible(dressHeader);
        return dressHeader.isDisplayed();
    }
    //This method is used for sorting highest price dress display
    public void selectionSortingDrpDown(){
        new WebDriverWait(driver, 15).
                until(ExpectedConditions.visibilityOfElementLocated(By.id("uniform-selectProductSort")));

        Select pricedrpdown = new Select(driver.findElement(By.id("selectProductSort")));
        pricedrpdown.selectByVisibleText("Price: Highest first");
    }

    public void viewDressItem(){
      Utils.mouseHoverAndClick(dressItem,dressItem);
        driver.switchTo().frame(iframe);
    }

    public void dressAddToCart() throws InterruptedException {
        Thread.sleep(5000);
        dressAddToCart.click();
    }

    public void proceedToCheckout(){
        Utils.waitForElementVisible(proceedToCheckout);
        proceedToCheckout.click();
    }
    public void navigateToOrdersPage(){
        viewOrders.click();
    }
}
