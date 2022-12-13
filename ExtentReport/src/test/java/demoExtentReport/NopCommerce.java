package demoExtentReport;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class NopCommerce {
	public WebDriver driver;
	public ExtentSparkReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;

	@BeforeTest
	public void setExtent()
	{
		String dateName= new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		htmlReporter= new ExtentSparkReporter(System.getProperty("user.dir") + "/test-report/" + "myReport" + dateName + ".html");
		//htmlReporter= new ExtentSparkReporter(System.getProperty("user.dir")+"/test-report/myReport.html");
		htmlReporter.config().setDocumentTitle("AutomationReport"); //will show in tab
		htmlReporter.config().setReportName("Functional Report");
		htmlReporter.config().setTheme(Theme.DARK);

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		extent.setSystemInfo("browser", "edge");
		extent.setSystemInfo("url", "https://demo.nopcommerce.com/");
		extent.setSystemInfo("OS", "Window 10");
		extent.setSystemInfo("Tester Name", "Minaxi");
		extent.setSystemInfo("Testing", "Regresssion");

	}
	@AfterTest
	public void endReport()
	{
		extent.flush();
	}


	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\minaxi.goyal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
	}

	@Test
	public void noCommerceTitleTest()
	{
		test=extent.createTest("noCommerceTitleTest");
		String title= driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "noCommerce demo store");
	}


	@Test
	public void noCommerceLogoTest()
	{
		test=extent.createTest("noCommerceLogoTest");
		Boolean status= driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		Assert.assertTrue(status);
	}

	@Test
	public void noCommerceloginTest()
	{
		test=extent.createTest("noCommerceLoginTest");
		test.createNode("Login with valid inputs");
		Assert.assertTrue(true);
		test.createNode("Login with invalid inputs");
		Assert.assertTrue(true);
	}
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL,MarkupHelper.createLabel("Test case is FAILED" + result.getName(),ExtentColor.RED));//to add name in extent report
			test.log(Status.FAIL,MarkupHelper.createLabel("Test case is FAILED" + result.getThrowable(),ExtentColor.RED));//to add error/exception in error report
			String screenshotPath=NopCommerce.getScreenshot(driver, result.getName());
			test.addScreenCaptureFromPath(screenshotPath);
		}
		else if(result.getStatus()==ITestResult.SKIP) {
			test.log(Status.SKIP, MarkupHelper.createLabel("Test case skipped is " + result.getName(), ExtentColor.YELLOW));
		}
		else if(result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, MarkupHelper.createLabel("Test case passed is " + result.getName(), ExtentColor.GREEN));
		}
	}


	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException
	{
		String dateName= new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		String destination= System.getProperty("user.dir") + "/Screenshots/" + screenshotName + dateName + ".png";
		File finalDestination= new File(destination);
		//FileHandler.copy(source, new File("C:/reports/screenshot.png"));
		FileUtils.copyFile(source, finalDestination);
		return destination;

	}
}

