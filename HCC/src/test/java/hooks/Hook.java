package hooks;

import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.BaseClass;



public class Hook {


	@Before
	
	public void launchBrowser()
	{
		BaseClass.setdriver();
	}
	@AfterStep
	public void attachscreenshot(Scenario scenario) throws IOException
	{
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) BaseClass.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "image");
		}
	}

	@After(order=0)
	public void tearDown()
	{
		BaseClass.getDriver().quit();

	}

}
