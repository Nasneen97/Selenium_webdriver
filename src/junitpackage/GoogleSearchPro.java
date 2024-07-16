package junitpackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchPro {
	WebDriver driver;
	String url = "https://www.google.com/";
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
	}
	
	@Test
	public void textElement() {
		driver.get(url);
		String expectation = "Google Search";
		String actual = driver.findElement(By.name("btnK")).getAttribute("value");
		System.out.println("Actual text is : "+actual);
		if(expectation.equalsIgnoreCase(actual)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
	
	@After
	public void closeBro() {
		driver.quit();
	}
	

}
