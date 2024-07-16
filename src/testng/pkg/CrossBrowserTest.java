package testng.pkg;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	
	WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void setUp(String browser) {
		if(browser.equalsIgnoreCase("firefox")) {
		   driver = new FirefoxDriver();	
		}
		else if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
	}
	
	@Test
	public void testparawithXml() {
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("nasneen1997@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("asif@123");
		driver.findElement(By.name("login")).click();
	}
	

}
