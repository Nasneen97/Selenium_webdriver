package junitpackage;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPro {
	WebDriver driver;
	String url = "https://www.amazon.in/";
	
	@Before
	public void setUO() {
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	@Test
	public void elementLocate() {
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));//suggestion varumbo web element use cheyaa
		search.sendKeys("electronics",Keys.ENTER);
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("adc@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id='nav-xshop']/a[6]")).click();
		driver.findElement(By.id("nav-cart-count")).click();
		driver.findElement(By.id("nav-hamburger-menu")).click();
		
	}
	
    @Test
		public void locateLinks() {
			List<WebElement> li = driver.findElements(By.tagName("a"));
			System.out.println("Total no. of links in amazon webpage "+li.size());
			
			for(WebElement data : li) {
				String link = data.getAttribute("href");
				System.out.println(data.getText()+" - "+link);
			}
			
			}
		
	@Test
		public void verifyTitle() {
		String expectation = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actual = driver.getTitle();
		System.out.println("Actual text is : "+actual);
		if(expectation.equalsIgnoreCase(actual)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		}
		
	@Test
		public void verifyPagesource() {
			String src = driver.getPageSource();
			if(src.contains("amazon")) {
				System.out.println("Pass");
			}
			else {
				System.out.println("Fail");
			}
		}

}
