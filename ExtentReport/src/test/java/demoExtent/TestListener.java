package demoExtent;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class TestListener extends ExtentReport implements ITestListener
{

	public void onTestStart(ITestResult result) {
	test = reports.createTest(result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS,MarkupHelper.createLabel("Test case is passed" + result.getName(),ExtentColor.GREEN));
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL,MarkupHelper.createLabel("Test case is FAILED" + result.getName(),ExtentColor.RED));
		test.log(Status.FAIL,MarkupHelper.createLabel("Test case is FAILED" + result.getThrowable(),ExtentColor.RED));
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP,MarkupHelper.createLabel("Test case is SKIPPED" + result.getName(),ExtentColor.YELLOW));
	}

	public void onStart(ITestContext context) {
		ExtentReport.configreport();
	}

	public void onFinish(ITestContext context) {
		ExtentReport.closeReport();
	}
	

}
