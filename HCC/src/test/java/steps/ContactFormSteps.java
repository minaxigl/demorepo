package steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ContactFormPage;
import utils.BaseClass;

public class ContactFormSteps {
	WebDriver driver = BaseClass.getDriver();
	ContactFormPage cf;
	
	@Given("User is in homepage and clicking the contact link to reach its contact form page")
	public void user_is_in_homepage_and_clicking_the_contact_link_to_reach_its_contact_form_page() {
	    cf= new ContactFormPage(driver);
	    cf.clickcontactMenu();
	    System.out.println("Contact menu has been clicked successfully.");
	}
	@When("user enters the data into the respective fields")
	public void user_enters_the_data_into_the_respective_fields() {
	    cf.ContactFormFields();
	    System.out.println("data to respective fields has been entered.");
	}
	@Then("user should be able to submit the details on clicking submit button")
	public void user_should_be_able_to_submit_the_details_on_clicking_submit_button() throws InterruptedException {
	   //cf.clicksubmitButton();
	   if(driver.getPageSource().contains("Thank you for your message. It has been sent."))
       {
           Assert.assertTrue(true);
       }
       else
       {Assert.assertTrue(false);
       }
	}
}
