package testng.pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HardAssertion {
	
	WebDriver driver;
	String url = "https://www.google.com/";
	
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
	}
	
   @BeforeMethod
	public void urlLoading() {
		driver.get(url);	
		
	}
   
   @Test
   public void assertion() {
	   String excepted = "google";
	   String actual = driver.getTitle();
	   System.out.println("Actual title is : "+actual);
	   
	   Assert.assertEquals(actual, excepted, "Title not found");
	   
	   
	   
	   
	   
	   
	   
   }

}
