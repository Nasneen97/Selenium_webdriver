package test.pkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.pkg.CreatePage;


public class PageFactory extends BaseClass {
	@Test(priority = -1)
	public void fbLogin() {
		CreatePage obj = new CreatePage(driver);
		obj.setValues("nasneen1997@gmail.com", "Asif@123");
	    obj.loginClick();
	    driver.navigate().back();
	    driver.navigate().back();
		
	}
	
	  @Test
	   public void assertion() {
		   CreatePage obj = new CreatePage(driver);
		   obj.createPagelink();
		   String excepted = "Facebook";
		   String actual = driver.getTitle();
		   System.out.println("Actual title is : "+actual);
		   
		   Assert.assertEquals(actual, excepted, "Title not found");
		   
		   
		   
		   
		   
		   
	   }

}
