package testng.pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScrollDown {
    WebDriver driver;
    String url = "https://www.amazon.in/";
    
    @BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlLoading() {
		driver.get(url);
		
	}
	
	@Test
	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	}
	
	@Test
	public void scrollDown1() {
		WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'51% off')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", ele);
	}
	
	@Test
	public void scrollDown2() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	
	
	
	
}
