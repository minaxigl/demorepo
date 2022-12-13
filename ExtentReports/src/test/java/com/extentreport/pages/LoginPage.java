package com.extentreport.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.model.Log;

public class LoginPage extends BasePage {
    /**
     * Constructor
     */
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Web Elements
     */
    By userNameId                = By.id("txtUsername");
    By passwordId                = By.name("txtPassword");
    By loginButtonId             = By.id("btnLogin");
   By errormessage               = By.id("spanMessage");
    /**
     * Page Methods
     */
    public LoginPage loginToN11(String username, String password) {
        Log.info("Trying to login the N11.");
        writeText(userNameId, username);
        writeText(passwordId, password);
        click(loginButtonId);
        return this;
    }

    
}
