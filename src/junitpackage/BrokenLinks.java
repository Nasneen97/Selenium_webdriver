
package junitpackage;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	WebDriver driver;
	String url = "https://www.luminartechnolab.com/";
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	@Test
	public void brokenLinks() {
		List<WebElement> li = driver.findElements(By.tagName("a"));
		System.out.println("Total no. of links : "+li.size());
		
		for(WebElement data : li) {
			String link = data.getAttribute("href");//values inside the href attribute so use get method
			System.out.println(data.getText()+" - "+link);
			verify(link);
		}
	}

	public void verify(String u) {
		try {
		URL ul = new URL(u);
		HttpURLConnection con = (HttpURLConnection) ul.openConnection();
		con.setConnectTimeout(3000);
		con.connect();
		
		if(con.getResponseCode()==200) {
			System.out.println("Valid = "+u);
		}
		else {
			System.out.println("Invalid = "+u);
		}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
