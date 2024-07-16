package testng.pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUploadTextField {
	
	WebDriver driver;
	String url = "https://demo.guru99.com/test/upload/";
	
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
	}
	
  @BeforeMethod
	public void urlLoading() {
		driver.get(url);
  }
  
    @Test
    public void fileUpload() {
    	WebElement upload = driver.findElement(By.name("uploadfile_0"));
    	upload.sendKeys("C:\\Users\\nasne\\OneDrive\\Desktop\\india.pdf");
    	WebElement checkbox = driver.findElement(By.xpath("//input[@id='terms']"));
    	checkbox.click();
    	WebElement button = driver.findElement(By.id("submitbutton"));
    	button.click();
    }
  

}
