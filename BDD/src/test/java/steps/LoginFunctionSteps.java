package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFunctionSteps {
WebDriver d1;


	

	@Given("Open the chrome browser and url of the application")
	public void open_the_chrome_browser_and_url_of_the_application() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		WebDriverManager.chromedriver().setup();
		
		d1=new ChromeDriver();
		
		d1.get("https://ksrtc.in/oprs-web/login/show.do");
		System.out.println("given done");
	}

	@When("Enter the username and password")
	public void enter_the_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		
		d1.findElement(By.id("userName")).sendKeys("aaaa");
		
		d1.findElement(By.name("password")).sendKeys("jgdgsd");
		
		d1.findElement(By.name("submitBtn")).click();
		
		System.out.println("When done");
	}
	
	/*@When("Enter the {string} and {string}")
	public void enter_the_and(String us, String pswd) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	d1.findElement(By.id("userName")).sendKeys(us);
		
		d1.findElement(By.name("password")).sendKeys(pswd);
		
		d1.findElement(By.name("submitBtn")).click();
		
		System.out.println("When done");
	
	}*/

	@Then("Login success")
	public void login_success() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		d1.quit();
		System.out.println("Then done");
	}

}
