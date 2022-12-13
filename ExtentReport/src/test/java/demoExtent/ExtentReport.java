package demoExtent;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
static ExtentReports reports;
static ExtentSparkReporter htmlreporter;
static ExtentTest test;

public static void configreport()
{
	reports=new ExtentReports();
	htmlreporter = new ExtentSparkReporter("C:\\Users\\minaxi.goyal\\eclipse-workspace\\photon\\ExtentReport\\src\\test\\java\\extent report results");
	reports.attachReporter(htmlreporter);
	reports.setSystemInfo("URL", "https://opensource-demo.orangehrmlive.com/index.php/auth/login");
      reports.setSystemInfo("OS", "Windows 10");
      reports.setSystemInfo("Browser", "ChromeBrowser");
      reports.setSystemInfo("Tested By", "Minaxi Goyal");
	
      htmlreporter.config().setDocumentTitle("Extent Reports");
      htmlreporter.config().getTimeStampFormat();
	
}

public static void closeReport() {
	reports.flush();
}


}
