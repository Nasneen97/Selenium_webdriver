package basicpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();//web driver interface inside chrome, edge, safari....
		driver.get("https://www.instagram.com/");
		
		driver = new EdgeDriver();
		driver.get("https://www.google.com/");

	}

}
