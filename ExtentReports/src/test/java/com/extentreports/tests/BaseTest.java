package com.extentreports.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.model.Log;
import com.extentreport.pages.HomePage;

public class BaseTest {
    public WebDriver driver;
    public HomePage  homePage;
    public WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void classLevelSetup() {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\minaxi.goyal\\Downloads\\chromedriver_win32\\chromedriver.exe");
        Log.info("Tests is starting!");
        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void methodLevelSetup() {
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void teardown() {
        Log.info("Tests are ending!");
        driver.quit();
    }
}