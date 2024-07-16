package testng.pkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basicpackage.GetTitle;

public class WindowHandleproooGuru {
	
	
	WebDriver driver;
	String url = "https://demo.guru99.com/popup.php";
	
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		
	}
	
	@BeforeMethod
	public void urlLoading() {
		driver.get(url);
	}
	
	@Test
	public void windowHandle() {
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent window title is : "+driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		for(String handles : allWindowHandles) {
			if(!handles.equalsIgnoreCase(parentWindow)) {
				driver.switchTo().window(handles);
				
				driver.findElement(By.name("emailid")).sendKeys("nasneen1997@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
				driver.close();
			}
			
			driver.switchTo().window(parentWindow);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
