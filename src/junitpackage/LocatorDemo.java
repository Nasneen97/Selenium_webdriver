package junitpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {
	WebDriver driver;
	String url = "https://www.facebook.com";
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	@Test
	public void elementLocator() {
		
		driver.findElement(By.id("email")).sendKeys("nasneen1997@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("asif@123");
		driver.findElement(By.name("login")).click();
		
	}
	@Test
	
	public void titleVerify() {
		String exec = "facebook";
		String actl = driver.getTitle();
		System.out.println("Actual result : "+actl);
	}

}
