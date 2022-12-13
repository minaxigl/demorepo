package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class ImageComparisonPage 
{
	@FindBy(xpath="//img[@src='https://hindustancollege.in/wp-content/uploads/2022/06/HC-18.jpg']")
	public static WebElement imageclick;

	@FindBy(xpath="//img[@id='fullResImage']")
	public static WebElement imageelement;

	WebDriver driver;

	public ImageComparisonPage(WebDriver rdriver) 
	{

		driver= rdriver;
		PageFactory.initElements(rdriver, this);
	}



	public void download_expected_image() throws InterruptedException, AWTException
	{ 
        
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		act.moveToElement(imageclick).click().build().perform();
		Thread.sleep(11000);
		//actual image
		Actions action = new Actions (driver);  
		action.contextClick(imageelement).perform ();
		Robot robot = new Robot();  // Robot class throws AWT Exception	
		Thread.sleep(5000); // Thread.sleep throws InterruptedException	
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public void capturing_actual_image(WebElement e) throws IOException
	{
		//expected image
		File f = e.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("./Screenshots/actualimage.jpg"));
      
	}
	


}
