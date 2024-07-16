package test.pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.pkg.FBloginPage;

public class FBloginTest {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test
	public void fbLogin() {
		FBloginPage obj = new FBloginPage(driver);
		obj.setValues("nasneen1997@gmail.com", "Asif@123");
		obj.loginButton();
		driver.navigate().back();
	}

}
