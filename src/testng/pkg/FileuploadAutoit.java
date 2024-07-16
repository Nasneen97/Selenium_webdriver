package testng.pkg;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class FileuploadAutoit {
	
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
  
  @org.testng.annotations.Test
  public void fileUpload() throws InterruptedException, IOException{
	  driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
	  Thread.sleep(3000);
	  Runtime.getRuntime().exec("C:\\Users\\nasne\\OneDrive\\Desktop\\AutoitScript\\Script.exe");
	  Thread.sleep(4000);
  }

}
