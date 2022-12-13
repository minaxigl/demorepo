package steps;

import java.awt.AWTException;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DownloadPage;
import utils.BaseClass;

public class DownloadSteps {

	DownloadPage dc;
	WebDriver driver = BaseClass.getDriver();


	@Given("User is in homepage and clicking the Courses link to reach Download page")
	public void user_is_in_homepage_and_clicking_the_courses_link_to_reach_download_page() {
		dc=new DownloadPage(driver) ;
		dc.clickCourseMenu();
		System.out.println("course menu has been clicked");
	}
	@And("click the download button")
	public void click_the_download_button() {
		//dc=new DownloadCourseToSystemPage(driver) ;
		dc.Downloadcourselink();    
		System.out.println("download course button is clicked");

	}
	@When("Save the Courses File")
	public void save_the_courses_file() throws AWTException, InterruptedException {

		dc.SwitchToDownloadPDFWindow();
		System.out.println("user is being switched to the download pdf window");
		dc.CourseDownload();
		System.out.println("course is being downloaded");

	}
	@Then("Check whether downloaded file is available")
	public void check_whether_downloaded_file_is_available() throws AWTException, InterruptedException {
		boolean flag = false;

		File fi=new File("C:\\Users\\minaxi.goyal\\Downloads");
		File[] total_files=fi.listFiles();
		for( File search_file:total_files) {

			if(search_file.getName().equals("a.pdf")) {
				System.out.println("File is downloaded");
				flag=true;

			}
		}
		Assert.assertTrue(flag);

	}
}
