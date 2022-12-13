package functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import objectrepository.Elements;

public class ValidLogin {
@Test
public void loginpage()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\minaxi.goyal\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver;
	
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	driver.manage().window().maximize();
	Elements.user(driver).sendKeys("9416452658");
	  Elements.continuebutton(driver).click();
	   Elements.password(driver).sendKeys("Ginni@01");
	   Elements.loginbutton(driver).click();
	   //WebElement element =driver.findElement(By.id("nav-link-accountList"));
		 //Actions action = new Actions(driver);
		 new Actions(driver).moveToElement(Elements.mousehoveraccountlists(driver)).perform();
	   Elements.signout(driver).click();
	  
}
}
