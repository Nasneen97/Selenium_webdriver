package junitpackage;

import java.awt.RenderingHints.Key;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorGoogle {
	WebDriver driver;
	String url = "https://www.google.com/";
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
	}
	
	@Test
	public void elementLocator() {
		driver.get(url);
		//driver.findElement(By.id("APjFqb")).sendKeys("Books");
		//driver.findElement(By.name("btnK")).click();//for button use click
		WebElement search = driver.findElement(By.id("APjFqb"));
		search.sendKeys("Books",Keys.ENTER);// or search.sumbit();
		

	}

}
