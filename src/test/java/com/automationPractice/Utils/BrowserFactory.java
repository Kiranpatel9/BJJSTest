package com.automationPractice.Utils;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.automationPractice.Pages.BasePage;

import java.util.concurrent.TimeUnit;

public class BrowserFactory extends BasePage {
    
	
	public static void startBrowser(){
       
		String path=System.getProperty("user.dir")+"/src/main/resources/";

        if(AutomationConstants.BROWSER_TYPE.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver",path+"chromedriver");
            driver=new ChromeDriver();
        }
        else if(AutomationConstants.BROWSER_TYPE.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver",path+"geckodriver");
            driver=new FirefoxDriver();
        }

        driver.get(AutomationConstants.baseURL);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
	
    public static void stopBrowser(){
        if(driver!=null){
            driver.close();
            driver.quit();
        }
    }
}
