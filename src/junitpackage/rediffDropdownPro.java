package junitpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class rediffDropdownPro {

	WebDriver driver;
	String url = "https://register.rediff.com/register/register.php?FormName=user_details";
	
	@Before
	public void rediffPro() {
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	@Test
	public  void drodown() {
		WebElement day = driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select"));
		Select d = new Select(day);
		d.selectByVisibleText("02");
		
		WebElement month = driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
		Select d2 = new Select(month);
		d2.selectByVisibleText("JUN");////d3.selectByIndex(6);
		
		WebElement year = driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
		Select d3 = new Select(year);
		d3.selectByVisibleText("2024");
	}

}
