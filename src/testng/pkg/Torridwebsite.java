package testng.pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Torridwebsite {
	WebDriver driver;
	String url = "https://www.facebook.com";
	
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlLoading() {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@Test
	public void torridsite() {
		driver.findElement(By.id("email")).sendKeys("8606295904");
		driver.findElement(By.name("pass")).sendKeys("Asif@123");
		driver.findElement(By.name("login")).click();
		
		String curent_url = driver.getCurrentUrl();
		System.out.println("current url is : "+curent_url);
		String exec = "https://www.facebook.com/?sk=welcome";
		
		if(exec.equalsIgnoreCase(curent_url)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}

}
