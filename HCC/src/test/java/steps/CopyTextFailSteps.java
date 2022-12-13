package steps;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CopyTextPage;
import utils.BaseClass;

public class CopyTextFailSteps {
	CopyTextPage ct;
    WebDriver driver = BaseClass.getDriver();
    @Given("User is in HomePage and Navigating to Invalid page")
    public void user_is_in_home_page_and_navigating_to_invalid_page() throws InterruptedException {
        
        ct= new CopyTextPage(driver);
           ct.Invalidnavigation();
        throw new io.cucumber.java.PendingException();
    }
    @When("Copy the text from AboutHindustanCollege Page")
    public void Copy_the_text_from_AboutHindustanCollege_Page() throws IOException, AWTException, InterruptedException
        {
          ct.copyText();
        }
    @And("Paste it in textfile")
    public void paste_it_in_textfile() throws Throwable
    {
        ct.pastetext();
    }
    @Then("save the textfile")
    public void save_the_textfile() throws InterruptedException, AWTException {
        ct.saveNotepad();
    }
    @And("close the textfile")
    public void close_the_textfile() throws AWTException, InterruptedException
        {
        ct.closenotepad();
            
        }
}
