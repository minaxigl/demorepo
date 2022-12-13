package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class RunWithTestng {
	@CucumberOptions(features="./src/test/resources/com/features", 
			glue= {"steps","hooks"},
					plugin= {"pretty",
							"html:./reports/report.html",
							"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
			)
	public class Run extends AbstractTestNGCucumberTests {

	}

}
