package junitpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Work2 {
	
	WebDriver driver;
	String url = "https://www.facebook.com/";
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	@Test
	public void locateElement() {
		driver.findElement(By.id("email")).sendKeys("nasneen1997@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Asif@123");
		driver.findElement(By.name("login")).click();
	}
	
	
	
		
		
		
		
		
        
		}
		
		
		
		
		
		
		
	


