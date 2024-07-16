package junitpackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonPathPro {
	WebDriver driver;
	String url = "https://www.facebook.com/";
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void buttonPath() {
		driver.get(url);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("adc@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("123");
	    driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
	@After
	public void closeBro() {
		driver.quit();
	}

}
