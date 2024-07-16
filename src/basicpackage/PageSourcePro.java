package basicpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageSourcePro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/"); 
		
		
		String src = driver.getPageSource();
		if(src.contains("I'm Feeling Lucky")) {
			System.out.println("Test is pass");
		}else {
			System.out.println("Test is fail");
		}

	}

}
