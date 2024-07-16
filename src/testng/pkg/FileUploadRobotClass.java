package testng.pkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUploadRobotClass {
	WebDriver driver;
	String url = "https://www.ilovepdf.com/word_to_pdf";
	
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
	}
	
  @BeforeMethod
	public void urlLoading() {
		driver.get(url);
  }
  @Test
  public void fileUpload1() throws AWTException  {
	  driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
	  fileUploadCode("\"C:\\Users\\nasne\\OneDrive\\Desktop\\Test scenario all the links are working fine on the home page.docx\"");
	  
	  }

     public void fileUploadCode(String file)throws AWTException {
    	 StringSelection strSelection = new StringSelection(file);
    	 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
    	 
    	 Robot robot = new Robot();
    	 
    	 robot.delay(3000);
    	 robot.keyPress(KeyEvent.VK_CONTROL);
    	 robot.keyPress(KeyEvent.VK_V);
    	 robot.keyPress(KeyEvent.VK_V);
    	 robot.keyPress(KeyEvent.VK_CONTROL);
    	 
    	 robot.keyPress(KeyEvent.VK_ENTER);
    	 robot.keyRelease(KeyEvent.VK_ENTER);
    	 
    	 
     }

}
