package junitpackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitPro {
	WebDriver driver;
	String url = "https://www.google.com/";
	
	@Before
	public void enivSetUp() {
		driver = new ChromeDriver();
	}
	
	@Test
	public void titleVerification() {
		driver.get(url);
		String expectation = "Google";
		String actual = driver.getTitle();
		System.out.println("Actual title is : "+actual);
		if(expectation.contains(actual)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
	
	@After
	public void browserClose() {
		driver.close();
	}

}
