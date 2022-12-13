package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFunctionStepsScenario {
WebDriver d1;


	

	@Given("Open the chrome browser and url of the application scenario")
	public void open_the_chrome_browser_and_url_of_the_application_scenario() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		WebDriverManager.chromedriver().setup();
		
		d1=new ChromeDriver();
		
		d1.get("https://ksrtc.in/oprs-web/login/show.do");
		System.out.println("given done");
	}

	@When("Enter the username and password for scenario")
	public void enter_the_username_and_password_for_scenario() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		
		d1.findElement(By.id("userName")).sendKeys("aaaa");
		
		d1.findElement(By.name("password")).sendKeys("jgdgsd");
		
		d1.findElement(By.name("submitBtn")).click();
		
		System.out.println("When done");
	}
	@Then("Login scenario success")
	public void login_scenario_success() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		d1.quit();
		System.out.println("Then done");
	}

}
