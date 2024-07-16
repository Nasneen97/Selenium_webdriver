package junitpackage;

import java.time.Duration;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Work {
	WebDriver driver;
	String url = "https://www.google.com/";
	
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	}
	
//	@Test
//	public void login() {
//		driver.findElement(By.name("emailid")).sendKeys("nasneen1997@gmail.com");
//		driver.findElement(By.name("btnLogin")).click();
//	}
	
	@Test
	public void googleSearch() {
		
		Boolean rad = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/img[1]")).isDisplayed();
		if(rad) {
			System.out.println("Logo displayed");
		}
		else {
			System.out.println("Not displayed");
		}
		
		WebElement search = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		search.sendKeys("Books", Keys.ENTER);
	
	}
	
	

}
