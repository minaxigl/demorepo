package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Elements {
	public static WebElement user(WebDriver driver) {
		return driver.findElement(By.id("ap_email"));
		}
	public static WebElement continuebutton(WebDriver driver) {
		return driver.findElement(By.id("continue"));	
		}
	
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.id("ap_password"));	
		}

	public static WebElement loginbutton(WebDriver driver) {
		return driver.findElement(By.id("signInSubmit"));	
		}
	
	public static WebElement mousehoveraccountlists(WebDriver driver)
	{
		return driver.findElement(By.id("nav-link-accountList"));
		
    }
	public static WebElement signout(WebDriver driver)
	{
		return driver.findElement(By.id("nav-item-signout"));
		
    }
}
