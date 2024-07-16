package testng.pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionDragandDrop {
	
	WebDriver driver;
	String url = "https://demoqa.com/droppable/";
	
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
	public void dragAndDrop() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 100)");
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
		
		
		String expected = "Dropped";
		String actual = driver.findElement(By.id("droppable")).getText();
		System.out.println("Actual text is : "+actual);
		
		if(expected.equalsIgnoreCase(actual)) {
			System.out.println("Text is pass");
		}
		else {
			System.out.println("Text is fail");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
