package demoExtent;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class OrangeHRMTest extends ExtentReport {
	WebDriver driver;

@BeforeSuite

public void setUpReport() {
	System.out.println("setup");
	ExtentReport.configreport();
}

@BeforeTest
public void launchBrowser() {
	System.out.println("hello");

	//System.setProperty("webdriver.chrome.driver","C:\\Users\\minaxi.goyal\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\minaxi.goyal\\Downloads\\chromedriver_win32\\chromedriver.exe");
	System.out.println("hellddddo");
	
	driver= new ChromeDriver();
    driver.manage().window().maximize();
     //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds());
}
	
  @Test
  
  public void login() {

      driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
      driver.findElement(By.id("txtUsername")).sendKeys("Admin");
      test.log(Status.INFO, "Username entered");
      driver.findElement(By.id("txtPassword")).sendKeys("admin123");
      test.log(Status.INFO, "Password entered");
      driver.findElement(By.id("btnLogin")).click();
      test.log(Status.INFO, "login successful");
  }

  @Test
  public void forgetPassword() {
      driver.findElement(By.linkText("Forgot your password?")).click();
      driver.findElement(By.id("securityAuthentication_userName")).sendKeys("Geetha");
      driver.findElement(By.id("btnSearchValues")).click();

      Assert.fail("test case deliberately failed");
      test.log(Status.INFO, "test case deliberately failing");

  }
  
  @AfterTest
  public void closeBrowser() {
	  driver.close();
	  driver.quit();
  }
 
  @AfterSuite
  public void tearDownReport() {
	  ExtentReport.closeReport();
  }
}
