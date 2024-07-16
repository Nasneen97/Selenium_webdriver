package page.pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePage {
	
	WebDriver driver;
	
	@FindBy(id = "email")
	WebElement fbemail;
	
	@FindBy(id = "pass")
	WebElement fbpwd;
	
	@FindBy(name = "login")
	WebElement fblogin;
	
	@FindBy(xpath = "//*[@id=\"reg_pages_msg\"]/a")
	WebElement createpage;
	
	
	public CreatePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void setValues(String email, String pwd) {
		fbemail.sendKeys(email);
		fbpwd.sendKeys(pwd);
		
	}
	
	public void loginClick() {
		fblogin.click();
	}
	
	public void createPagelink() {
		createpage.click();
		
	}
	
	
	
	
	

}
