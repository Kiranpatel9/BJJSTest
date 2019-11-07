package com.automationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePage{
    
    @FindBy(css = "form[id='login_form']")
    WebElement loginForm;

    @FindBy(css = "input[id='email']")
    WebElement emailField;

    @FindBy(css = "input[id='passwd']")
    WebElement passwordField;

    @FindBy(css = "#SubmitLogin")
    WebElement signInButton;

    
    public SignInPage(){
        PageFactory.initElements(driver,this);
    }
    
    public boolean isUserOnLoginPage() {
        return loginForm.isDisplayed();
    }
    public void setEmailPasswordAndSubmit(String email, String password)  {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        signInButton.click();
    }
}
