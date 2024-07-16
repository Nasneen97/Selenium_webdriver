package basicpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String src = driver.getPageSource();
		
		if(src.contains("Gmail") && src.contains("Nasneen")) {
			System.out.println("Test is pass");
		}
		else {
			System.out.println("Test is fail");
		}

	}

}
