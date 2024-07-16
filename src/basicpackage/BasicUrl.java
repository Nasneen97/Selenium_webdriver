package basicpackage;

import javax.print.attribute.standard.Chromaticity;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver obj = new ChromeDriver();
		obj.get("https://www.google.com/");
		obj.get("https://www.instagram.com/");
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.instagram.com/");
	}

}
