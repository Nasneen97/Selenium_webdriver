package testng.pkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePicker {
	
	WebDriver driver;
	String url = "https://www.trivago.com/";
	
	
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
	  public void datePicker() throws InterruptedException {
		  JavascriptExecutor js = (JavascriptExecutor) driver;
	 	  js.executeScript("window.scrollBy(0,200)");
     	  driver.findElement(By.xpath("//span[contains(text(),'Check in')]")).click();
     	  datepickermethod("August 2024","23");
     	 
	
}
	 
	private void datepickermethod(String expmont, String exdate) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(4000);
		while(true) {
			String month = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[2]/h3")).getText();
			System.out.println(month); 
			if(month.equals(expmont)){
				System.out.println("month = "+month);
				break;
			}
			else {
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]/span")).click();
				
			}
		}
		
		List<WebElement> alldates = driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[2]/div[2]/button/time"));
		for(WebElement dateelement : alldates) {
			String date = dateelement.getText();
			if(date.equals(exdate)) {
				System.out.println(date);
				dateelement.click();
				break;
			}
		}
		
		
		
	}
	
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   

}
