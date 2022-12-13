package steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DataDrivenContactFormPage;
import utils.BaseClass;

public class DataDrivenContactFormSteps {
	WebDriver driver = BaseClass.getDriver();
	DataDrivenContactFormPage cf1;


	@Given("User clicks on contact menu link available on home page")
	public void user_clicks_on_contact_menu_link_available_on_home_page() {
		cf1= new DataDrivenContactFormPage(driver);
		cf1.clickcontactMenu();
	}
	@When("user enters the {string},{string},{string} and {string} into the respective fields")
	public void user_enters_the_and_into_the_respective_fields(String name, String phonenumber, String email, String message)
	{
		cf1.DataDrivenContactFormFields(name, phonenumber, email, message);
	}
	@Then("user should be able to submit the Contact Form")
	public void user_should_be_able_to_submit_the_contact_form() throws InterruptedException {

		cf1.clicksubmitButton();
		if(driver.getPageSource().contains("Thank you for your message. It has been sent."))
		{
			Assert.assertTrue(false);
		}
		else
		{Assert.assertTrue(true);
		}
	}
}
