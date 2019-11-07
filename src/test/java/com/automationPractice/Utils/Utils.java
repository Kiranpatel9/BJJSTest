package com.automationPractice.Utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils extends BrowserFactory {

    //MouseHoverAndClick
    public static void mouseHoverAndClick(WebElement elementToHover,WebElement elementToClick){
        Actions action=new Actions(driver);
        action.moveToElement(elementToHover).click(elementToClick).build().perform();
    }
    //Wait for element visible
    public static void waitForElementVisible(WebElement element){
        WebDriverWait wait=new WebDriverWait(driver,AutomationConstants.TIMEOUT);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    //Wait for Element Clickable
    public static void waitForElementClickable(WebElement element){
        WebDriverWait wait=new WebDriverWait(driver,AutomationConstants.TIMEOUT);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    //Select
    public static void selectByVisibleText(WebElement element,String value) {
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }
}
