package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import utils.BaseClass;



public class DataDrivenContactFormPage {
	WebDriver driver =BaseClass.getDriver();
	public DataDrivenContactFormPage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(id="nav-menu-item-15178")
	WebElement contactMenu;



	@FindBy(name="your-name")
	WebElement nameContact;



	@FindBy(xpath="//input[@name='your-phone']")
	WebElement phonenum;



	@FindBy(xpath="//input[@name='your-email']")
	WebElement emailContact;



	@FindBy(xpath="//textarea[@name='your-message']")
	WebElement messageContact;



	@FindBy(xpath="//*[@id=\"submit\"]")
	WebElement Submit;



	public void clickcontactMenu()
	{
		contactMenu.click();
	}




	public void clicksubmitButton() throws InterruptedException
	{
		Thread.sleep(1000);
		Submit.click();
	}



	public void DataDrivenContactFormFields(String name,String phonenumber, String email,String message) {



		nameContact.sendKeys(name);
		phonenum.sendKeys(String.valueOf(phonenumber));
		emailContact.sendKeys(email);
		messageContact.sendKeys(message);
	}



}

