package testng.pkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EbayWebsite {
   WebDriver driver;
   String url = "https://www.ebay.com/";
   
   @BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
	}
	
  @BeforeMethod
	public void urlLoading() {
		driver.get(url);
		
	}
  
  
  @Test
  public void ebaysite() {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	  WebElement electronics = driver.findElement(By.xpath("//body/div[@id='mainContent']/div[@id='vl-flyout-nav']/ul[1]/li[2]/a[1]"));
	  Actions act = new Actions(driver);
	  act.moveToElement(electronics).perform();
	  
	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Cameras and photos')]"))).click();
	  
	  
	 
	
	  }










}
