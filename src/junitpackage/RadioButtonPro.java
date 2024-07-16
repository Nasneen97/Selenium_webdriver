package junitpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonPro {

	WebDriver driver;
	String url = "https://register.rediff.com/register/register.php?FormName=user_details";
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	@Test
	public void radiButton() {
		Boolean rad = driver.findElement(By.xpath("//tbody/tr[24]/td[3]/input[1]")).isSelected();
		if(rad) {
		  System.out.println("Selected");	
		}
		else
		{
			System.out.println("Not selected");
		}
	}
	@Test
	public void logoDisplayed() {
		Boolean rad1 = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/img[1]")).isDisplayed();
		if(rad1) {
		  System.out.println("Logo is displayed");	
		}
		else
		{
			System.out.println("Logo Not selected");
		}
	}
	
	@Test
	public void buttonEnable() {
		Boolean ena = driver.findElement(By.id("Register")).isEnabled();
		if(ena) {
		  System.out.println("Button enabled");	
		}
		else
		{
			System.out.println("Not enabled");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
