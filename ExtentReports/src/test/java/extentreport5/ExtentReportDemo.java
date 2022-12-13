package extentreport5;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {

	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("Extentreport.html");
	@Test
	public void f1()
	{
		ExtentTest test=extent.createTest("Launch browser and website");
		test.log(Status.PASS, "user launched website");
		test.pass("user launched website verified");
	}
	@Test
	public void f2()
	{
		ExtentTest test=extent.createTest("verify login");
		test.info("alert dispalying");
		test.pass("user logged into application");
		test.warning("reset password alert displaying");
	}
	@Test
	public void f3()
	{
		ExtentTest test=extent.createTest("verify dashboard");
		test.skip("verify dashboard skipped");
	}
	@Test
	public void f4()
	{
		ExtentTest test=extent.createTest("verify user send emails from test application ");
		test.fail("unable to email due to server down time");

	}
	@Test
	public void f5()
	{
		ExtentTest test=extent.createTest("verify report and analytics");
		test.fail("reports getting crashed");
 	}
	@Test
	public void f6()
	{
		ExtentTest test=extent.createTest("verify logout feature");
		test.pass("user logged out of the application");
		test.info("user is redirected to login page");
	}
	@BeforeTest
	public void beforeTest()
	{

		extent.attachReporter(spark);

	}
	@AfterTest
	public void AfterTest()
	{

		extent.attachReporter(spark);
		extent.flush();
	}


}
