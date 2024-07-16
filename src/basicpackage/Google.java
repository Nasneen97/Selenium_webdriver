package basicpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String expected = "Google";
		String actual = driver.getTitle();
		System.out.println("Actual tilte is : "+actual);
		
		if(expected.equals(actual)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		

	}

}
