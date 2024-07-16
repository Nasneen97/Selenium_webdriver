package testng.pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionPro {
	
	WebDriver driver;
	String url = "https://register.rediff.com/register/register.php?FormName=user_details";
	
	 @BeforeTest
		public void setUp() {
			driver = new ChromeDriver();
		}
		
	@BeforeMethod
		public void urlLoading() {
			driver.get(url);
			
		}
	
	@Test
	public void actionKey() {
		WebElement redif_name = driver.findElement(By.xpath("//tbody/tr[3]/td[3]/input[1]"));
		redif_name.sendKeys("abcde");
		
		WebElement redif_id = driver.findElement(By.xpath("//tbody/tr[7]/td[3]/input[1]"));
		
		Actions act = new Actions(driver);
		act.keyDown(redif_name,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		act.keyDown(redif_name,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		act.keyDown(redif_id,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		act.build().perform();
		
		
		
		
		
	}
		
		

}
