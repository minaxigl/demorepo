package pages;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import utils.BaseClass;



public class CopyTextPage {
    
    WebDriver driver =BaseClass.getDriver();
    
    @FindBy(xpath="//*[@id=\"about-row\"]/div[1]/div/div/div/div/p[2]/a/i")
    public static WebElement hindustancollegelink;
    
    @FindBy(xpath="//*[@id=\"about-row\"]/div[1]/div/div/div/div/p[2]/a/t")
    public static WebElement Invalid;
    
    
    @FindBy(xpath="//*[@class=\"wpb_wrapper\"]")
    public static WebElement text;
    
    
    public CopyTextPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);



   }



   public void navigation() throws InterruptedException
    {
        Thread.sleep(2000);
        hindustancollegelink.click();
    }
    
   public void Invalidnavigation() throws InterruptedException
   {
       Thread.sleep(2000);
       Invalid.click();
       
   }
    
    public void copyText() throws IOException, AWTException, InterruptedException {
        Thread.sleep(12000);
         String S=text.getText();
         StringSelection stringSelection = new StringSelection(S);
         Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
         
         String command = "notepad.exe";
        Runtime run = Runtime.getRuntime();
        run.exec(command);
        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Thread.sleep(3000);
    }
    



   
    public void pastetext() throws AWTException
    {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }
    



   public void saveNotepad() throws InterruptedException, AWTException
    {
    try
        {
        Thread.sleep(3000);
        Robot r1 = new Robot();
             
             r1.keyPress(KeyEvent.VK_CONTROL);
             r1.keyPress(KeyEvent.VK_S);
             r1.keyRelease(KeyEvent.VK_CONTROL);
             r1.keyRelease(KeyEvent.VK_S);
             Thread.sleep(3000);
             r1.keyPress(KeyEvent.VK_G);
             r1.keyPress(KeyEvent.VK_G);
             r1.keyPress(KeyEvent.VK_ENTER);
             r1.keyPress(KeyEvent.VK_LEFT);
             r1.keyPress(KeyEvent.VK_ENTER);
             Thread.sleep(3000);
             r1.keyRelease(KeyEvent.VK_G);
             r1.keyRelease(KeyEvent.VK_G);
             r1.keyRelease(KeyEvent.VK_ENTER);
             r1.keyRelease(KeyEvent.VK_LEFT);
             r1.keyRelease(KeyEvent.VK_ENTER);
             Thread.sleep(3000);
             r1.keyPress(KeyEvent.VK_ALT);
             r1.keyPress(KeyEvent.VK_F);
             r1.keyPress(KeyEvent.VK_X);
             r1.keyRelease(KeyEvent.VK_ALT);
             r1.keyRelease(KeyEvent.VK_F);
             r1.keyRelease(KeyEvent.VK_X);
             Thread.sleep(3000);
        }
     catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    }
    public void closenotepad() throws AWTException, InterruptedException
    {
         Robot r1 = new Robot();
        r1.keyPress(KeyEvent.VK_ALT);
        r1.keyPress(KeyEvent.VK_F);
        r1.keyPress(KeyEvent.VK_X);
        r1.keyRelease(KeyEvent.VK_ALT);
        r1.keyRelease(KeyEvent.VK_F);
        r1.keyRelease(KeyEvent.VK_X);
        Thread.sleep(3000);
    }



}