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



public class CopyTextSteps {
    CopyTextPage ct;
    WebDriver driver = BaseClass.getDriver();
    @Given("User is in HomePage and Navigating to About Hindustancollege page")
    public void user_is_in_homepage_and_Navigating_to_Hindustancollege_page() throws InterruptedException
    {
       ct= new CopyTextPage(driver);
       ct.navigation();
       System.out.println("user is navigated to the about us section of hindustan college page successfully.");
    }
    @When("Copy the text from webpage")
    public void Copy_the_text_from_webpage() throws IOException, AWTException, InterruptedException
        {
          ct.copyText();
          System.out.println("text is being copied");
        }
    @And("Paste it in Notepad")
    public void paste_it_in_Notepad() throws Throwable
    {
        ct.pastetext();
        System.out.println("text is pasted to notepad");
    }
    @Then("save the Notepad")
    public void save_the_Notepad() throws InterruptedException, AWTException {
        ct.saveNotepad();
        System.out.println("notepad is saved");
    }
    @And("close it")
    public void close_it() throws AWTException, InterruptedException
        {
        ct.closenotepad();
        System.out.println("notepad is closed");
            
        }
    }