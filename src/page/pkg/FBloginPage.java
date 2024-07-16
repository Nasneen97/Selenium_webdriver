package page.pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FBloginPage {
	
	WebDriver driver;
	
	//create object repository
	
	By fbemail = By.id("email");
	By fbpwd = By.id("pass");
	By fbloginbutton = By.name("login");
	
	//constructor
	public FBloginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	//action method
	public void setValues(String email, String pwd) {
		driver.findElement(fbemail).sendKeys(email);
		driver.findElement(fbpwd).sendKeys(pwd);
	}
	
	public void loginButton() {
		driver.findElement(fbloginbutton).click();
	}

}
