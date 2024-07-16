package testng.pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkPro {
	
	WebDriver driver;
	String url = "https://www.indiabix.com/";
	
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
	}
	
	@Test
	public void urlLoading() {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	

}
