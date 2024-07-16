package junitpackage;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateLinks {
	WebDriver driver;
	String url = "https://www.google.com/";
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		
		
		}
	
	@Test
    public void elementLocator() {    
		driver.get(url);
		List<WebElement> li = driver.findElements(By.tagName("a"));		
		System.out.println("Total no. of links in the page : "+li.size());
		
		for(WebElement data : li) {
			String link = data.getAttribute("href");//values inside the href attribute so use get method
			System.out.println(data.getText()+" - "+link);
		}
		
		/*
		 * for(int i=0; i<li.size(); i++) { 
		 * WebElement s = li.get(i); 
		 * String link =s.getAttribute("href"); 
		   System.out.println(s.getText()+" - "+link); }
		 */
		
	}
	
	@After
	public void closebro() {
		driver.quit();
	}
}
