package pages;
	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;

	import java.util.Iterator;
	import java.util.Set;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import utils.BaseClass;
	public class DownloadPage    {

		WebDriver driver =BaseClass.getDriver();
		public DownloadPage(WebDriver rdriver)
		{
			driver=rdriver;
			PageFactory.initElements(rdriver,this);

		}

		//Elements in Course
		@FindBy(xpath = "//li[@id='nav-menu-item-16010']")
		public static WebElement Course;

		@FindBy(xpath = "//*[@id=\"content\"]/article/div[3]/div/div/div/div/div/div/a")
		public static WebElement Downloadcourse;

		public void clickCourseMenu()
		{
			Course.click();
		}

		public void Downloadcourselink()
		{
			Downloadcourse.click();
		}

		public void SwitchToDownloadPDFWindow(){

			//Getting Window Handles
			Set<String> windowHandles=driver.getWindowHandles();
			//System.out.println(windowHandles);
			Iterator<String> itr = windowHandles.iterator();
			String w1=itr.next();
			String w2=itr.next();
			driver.switchTo().window(w2);
			System.out.println(driver.getCurrentUrl());

		}

		public void CourseDownload () throws AWTException, InterruptedException{

			//For clicking keyboard Action
			Robot r1=new Robot();
			r1.keyPress(KeyEvent.VK_CONTROL);
			r1.keyPress(KeyEvent.VK_S);
			r1.keyRelease(KeyEvent.VK_S);
			r1.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(2000);
			r1.keyPress(KeyEvent.VK_A);
			r1.keyRelease(KeyEvent.VK_A);
			r1.keyPress(KeyEvent.VK_ENTER);
			r1.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			r1.keyPress(KeyEvent.VK_TAB);
			r1.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			r1.keyPress(KeyEvent.VK_ENTER);
			r1.keyRelease(KeyEvent.VK_ENTER);

			Thread.sleep(4000);
		}
		
	}





