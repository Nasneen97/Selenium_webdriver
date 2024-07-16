package junitpackage;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshort {
	WebDriver driver;
	String url = "https://www.amazon.in/";
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	@Test
	public void screenshot() throws IOException {
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:\\Users\\nasne\\OneDrive\\Desktop\\screenshot.png"));
	}
	
	@Test
	public void screenshotElement() throws IOException {
		WebElement ele = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		File src1 = ele.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1,new File("C:\\\\Users\\\\nasne\\\\OneDrive\\\\Desktop\\\\screenshot1.png"));
	}

}
