package com.automationPractice.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class CreateAccountPage extends BasePage{
    @FindBy(css = "form[id='create-account_form']")
    WebElement createAccountForm;

    @FindBy(css = "input[id='email_create']")
    WebElement emailCreate;

    @FindBy(css = "#SubmitCreate")
    WebElement createAccountButton;

    @FindBy(css = "form[id='account-creation_form']")
    WebElement createAccountPage;

    @FindBy(css = "input[name='id_gender']")
    WebElement gender;

    @FindBy(css = "input[name='customer_firstname']")
    WebElement custmrfirstName;

    @FindBy(css = "input[name='customer_lastname']")
    WebElement custmrlastName;

    @FindBy(css = "input[id='passwd']")
    WebElement password;

    @FindBy(css = "input[name='firstname']")
    WebElement firstName;

    @FindBy(css = "input[name='lastname']")
    WebElement lastName;

    @FindBy(css = "input[name='address1']")
    WebElement address;

    @FindBy(css = "input[name='city']")
    WebElement city;

    @FindBy(css = "input[name='postcode']")
    WebElement zipcode;

    @FindBy(css = "input[name='phone_mobile']")
    WebElement phoneMobile;

    @FindBy(css = "button[id='submitAccount']")
    WebElement createAccount;

    @FindBy(id="my-account")
    WebElement myAccountPage;







    public CreateAccountPage(){
        PageFactory.initElements(driver,this);
    }

    public boolean isUserOnCreateAccountPage() {
        return createAccountForm.isDisplayed();
    }
    public void setEmailCreateAccount(String email)  {
        emailCreate.sendKeys(email);
        createAccountButton.click();
    }
    public void isUserOnAccountCreationPage(){
       new WebDriverWait(driver, 15).
        until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("form[id='account-creation_form']")));
        createAccountPage.isDisplayed();
    }

    public void fillInAccountCreationDetails(){
        //YOUR PERSONAL INFORMATION
        gender.click();
        custmrfirstName.sendKeys("Test");
        custmrlastName.sendKeys("test");
        password.sendKeys("Password123");

        //YOUR ADDRESS
        firstName.clear();
        firstName.sendKeys("Test");
        lastName.clear();
        lastName.sendKeys("test");
        address.sendKeys("test");
        city.sendKeys("swindon");

        Select drpcountry = new Select(driver.findElement(By.id("id_country")));
        drpcountry.selectByVisibleText("United States");
        new WebDriverWait(driver, 15).
                until(ExpectedConditions.visibilityOfElementLocated(By.id("uniform-id_state")));

        Select drpstate = new Select(driver.findElement(By.id("id_state")));
        drpstate.selectByVisibleText("Alabama");

        zipcode.sendKeys("12345");
        phoneMobile.sendKeys("12345678");
        createAccount.click();
    }

    public void isUserOnMyAccountPage(){
        new WebDriverWait(driver, 15).
                until(ExpectedConditions.visibilityOfElementLocated(By.id("my-account")));
        myAccountPage.isDisplayed();
    }
}
