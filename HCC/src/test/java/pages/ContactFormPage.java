package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseClass;

public class ContactFormPage {
	WebDriver driver =BaseClass.getDriver();
	public ContactFormPage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(id="nav-menu-item-15178")
	WebElement contactMenu;

	@FindBy(name="your-name")
	WebElement nameContact;

	@FindBy(xpath="//input[@name='your-phone']")
	WebElement phonenumber;

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

	public void setName()
	{
		nameContact.sendKeys("Jyothi");
	}

	public void setphonenumber()
	{
		phonenumber.sendKeys("3473847387");
	}
	public void setEmail()
	{
		emailContact.sendKeys("abcs@gmail.com");
	}

	public void setmessage()
	{
		messageContact.sendKeys("hi.. need details for b com course. please call or text me.");
	}
	public void clicksubmitButton() throws InterruptedException
	{
		Thread.sleep(1000);
		Submit.click();
	}

	public void ContactFormFields() {

		setName();
		setphonenumber();
		setEmail();
		setmessage();
	}

}
