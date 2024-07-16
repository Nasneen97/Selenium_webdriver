package junitpackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSourceJunitPro {
	WebDriver driver;
	String url = "https://www.google.com/";
	
	@Before
	public void envSetUp() {
		driver = new ChromeDriver();	
		}
	
	@Test
	public void pageSource() {
		driver.get(url);
		String src = driver.getPageSource();
		if(src.contains("Google") && src.contains("Nasneen")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
	
	@After
	public void browserClose() {
		driver.quit();
	}

}
