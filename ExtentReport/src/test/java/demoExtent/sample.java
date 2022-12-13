package demoExtent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sample {
	

@Test
	public void f()
	{
		System.out.println("hello");

System.setProperty("webdriver.chrome.driver","C:\\Users\\minaxi.goyal\\Downloads\\chromedriver_win32\\chromedriver.exe");
//System.setProperty("webdriver.chrome.driver","Desktop\\chromedriver.exe")
		System.out.println("hellddddo");
		WebDriver driver;
		driver= new ChromeDriver();
	    driver.manage().window().maximize();
	   
	}
}
