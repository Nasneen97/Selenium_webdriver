package junitpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebpagePro {

	WebDriver driver;
	String url = "file:///C:/Users/nasne/Downloads/aler1.html";
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		}
	
	@Test
	public void linksLocate() {
		driver.get(url);
		driver.findElement(By.xpath("//input[1]")).click();
		Alert alert = driver.switchTo().alert();
		
		String alertText =alert.getText();
		if(alertText.equalsIgnoreCase("Hello Iam an alert box !!")){
			System.out.println("Text is present");
		}
		else {
			System.out.println("Text not present");
			
		}
		alert.accept();
		
		driver.findElement(By.xpath("//input[2]")).sendKeys("nas@gmail.com");
		driver.findElement(By.xpath("//input[3]")).sendKeys("123");
		driver.findElement(By.xpath("//input[4]")).click();
		
//		driver.findElement(By.xpath("html/body/input[1]")).click();
//		driver.findElement(By.xpath("html/body/input[2]")).sendKeys("nas@gmail.com");
//		driver.findElement(By.xpath("html/body/input[3]")).sendKeys("123");
//		driver.findElement(By.xpath("html/body/input[4]")).click();
		
	

	}


}