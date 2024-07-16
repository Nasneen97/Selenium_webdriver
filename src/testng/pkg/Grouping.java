package testng.pkg;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Grouping {
	
	@BeforeTest
	public void setUp() {
		System.out.println("browser open");
	}

	@BeforeMethod
	public void urlLoad() {
		System.out.println("url loading");
	}
	
	@Test(groups = {"sanity"})
	public void main1() {
		System.out.println("This is main1");
	}
	
	@Test(groups = {"sanity","smoke"})
	public void main2() {
		System.out.println("This is main2");
	}
	
	@Test(groups = {"regresion"})
	public void main3() {
		System.out.println("This is main3");
	}
	
	@Test(groups = {"regresion","sanity"})
	public void main4() {
		System.out.println("This is main4");
	}
	
	@Test(groups = {"sanity"})
	public void main5() {
		System.out.println("This is main1");
	}
	
	@Test(groups = {"smoke"})
	public void main6() {
		System.out.println("This is main2");
	}

}
