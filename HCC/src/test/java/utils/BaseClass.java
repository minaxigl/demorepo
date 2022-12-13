package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
		public static void setdriver()
	{
		ReadConfig readconfig=new ReadConfig();
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get(readconfig.getApplicationURL());
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	
	
}
