package testng.pkg;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Project {
	WebDriver driver;
	String url = "https://www.allbirds.com/";
	
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
	public void login() {
		driver.findElement(By.xpath("//*[@id=\"top-navigation\"]/nav/ul[2]/li[5]/div/a/div")).click();
		
		driver.findElement(By.id("CustomerEmail")).sendKeys("nasneen1997@gmail.com");
		driver.findElement(By.id("CustomerPassword")).sendKeys("Asif@123");
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/input[5]")).click();
		
		driver.navigate().back();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id=\"page-home\"]/div/div[1]/div/div/div/div/div[2]/div/div/div/div/a[1]")).click();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.findElement(By.xpath("//*[@id=\"parent-collection-container\"]/div/div/div[1]/div[2]/div[2]/div[2]/div[3]/div[3]/div/div/div/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"pdp-size-selector\"]/ul/li[4]/button")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.findElement(By.id("add-to-cart")).click();

		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.findElement(By.xpath("//*[@id=\"top-navigation\"]/nav/ul[2]/li[7]/button")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("//*[@id=\"cart\"]/div/div/div/div[3]/div/div/div[4]/a")).click();
		
		driver.findElement(By.id("continue_button")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
