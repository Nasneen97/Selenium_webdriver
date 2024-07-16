package testng.pkg;

import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowHandlePro {
	WebDriver driver;
	String url = "https://demo.guru99.com/popup.php";
	
	@BeforeTest
	public void setup() {
		driver =  new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@Test
	public void windowHandle() {
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window = "+driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		for(String handle : allWindowHandles) {
			if(!handle.equalsIgnoreCase(parentWindow)) {
				driver.switchTo().window(handle);
				
				driver.findElement(By.name("emailid")).sendKeys("nasneen1997@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
				
				driver.close();
				
			}
			driver.switchTo().window(parentWindow);
		}
	}

}
