package testng.pkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
	@BeforeTest
	public void setUp() {
		System.out.println("browser open");
	}

	@BeforeMethod
	public void urlLoad() {
		System.out.println("url loading");
		
	}
	
	@Test(priority = 1)
	public void main1() {
		System.out.println("Title verification");
	}
	
	@Test(invocationCount = 2)
	public void main2() {
		System.out.println("Page source");
	}
	
	@Test(priority = -1)
	public void main3() {
		System.out.println(" broken links");
	}
	
	@Test(dependsOnMethods = {"main3"})
	public void alert() {
		System.out.println("alert box");
	}
	
	@AfterMethod
	public void closeBrowser() {
		System.out.println("Browser closing");
	}
}
