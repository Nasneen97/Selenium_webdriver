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

public class DragandDrop {
	 WebDriver driver;
	   String url = "https://demoqa.com/droppable";
	   
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
	 
	  public void draganddrop() {
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  
		  js.executeScript("window.scrollBy(0,500)");
			
		  WebElement source = driver.findElement(By.id("draggable"));
		  WebElement target = driver.findElement(By.id("droppable"));
		  
		  Actions act = new Actions(driver);
		  act.dragAndDrop(source, target).perform();
		  
		  
		  String expectation = "Dropped!";
		  String actual = driver.findElement(By.xpath("//p[contains(text(),'Dropped!')]")).getText();
		  System.out.println("Actual text is : "+actual);
		  
		  if(expectation.equalsIgnoreCase(actual)) {
			  System.out.println("pass");
		  }
		  else {
			  System.out.println("fail");
		  }
	  }
}
	  
	 

