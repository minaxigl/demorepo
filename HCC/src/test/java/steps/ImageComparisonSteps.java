package steps;

import java.awt.AWTException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.ImageComparisonPage;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import utils.BaseClass;

public class ImageComparisonSteps {
	ImageComparisonPage ic;
	BufferedImage actualimage, expectedimage;
	WebDriver driver = BaseClass.getDriver();
	
	
	@Given("User is on home page and download the expected image from gallery")
	public void user_is_on_home_page_and_download_the_expected_image_from_gallery() throws InterruptedException, AWTException {
		ic=new ImageComparisonPage(driver);
		ic.download_expected_image();
		System.out.println("expected image from web is saved");
		

	}
	@And("Capture the actual image by taking screenshot")
	public void capture_the_actual_image_by_taking_screenshot() throws IOException {
		ic.capturing_actual_image(ImageComparisonPage.imageelement);
		System.out.println("screenshot of actual image has been captured");
	
	}
	@When("Reading both the images from their location and Compare the both images")
	public void reading_both_the_images_from_their_location_and_compare_the_both_images() throws IOException {
		//reading both actual and expected image from their locations
				 actualimage = ImageIO.read(new File("./Screenshots/actualimage.jpg"));

				expectedimage = ImageIO.read(new File("C:\\Users\\minaxi.goyal\\Downloads\\A.jpg"));
		
System.out.println("both images have been read from their respective location");
	}

	@Then("We can see that two images are different or same")
	public void we_can_see_that_two_images_are_different_or_same() throws IOException {
		ImageDiffer imgdiff = new ImageDiffer();
		ImageDiff diff = imgdiff.makeDiff(expectedimage, actualimage);
		if (diff.hasDiff() == true) {
			System.out.println("Image is differing");
			Assert.assertTrue(false);
		} else {
			System.out.println("Image is same");
			Assert.assertTrue(true);
		}
		
	}
}
