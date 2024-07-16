package junitpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateLinkPro {
	WebDriver driver;
	String url = "https://www.amazon.in/";
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		}
	
	@Test
	public void linksLocate() {
		driver.get(url);
		driver.findElement(By.xpath("//*[@id='nav-xshop']/a[5]")).click();
		driver.findElement(By.xpath("//*[@id='nav-xshop']/a[6]")).click();
	}

}
