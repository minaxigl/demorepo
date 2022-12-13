package com.extentreport.pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.model.Log;

public class HomePage extends BasePage {
    /**
     * Constructor
     */
    public HomePage(WebDriver driver) {
        super(driver);
    }

    /**
     * Variables
     */
    String baseURL = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";

    /**
     * Web Elements
     */
    //By signInButtonClass = By.className("btnSignIn");

    /**
     * Page Methods
     */
    //Go to Homepage
    public HomePage goToN11() {
        Log.info("Opening N11 Website.");
        driver.get(baseURL);
        return this;
    }

   /* //Go to LoginPage
    public LoginPage goToLoginPage() {
        Log.info("Going to Login Page..");
       // click(signInButtonClass);
        return new LoginPage(driver);
    }*/
}