package testng.pkg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportGeneratorPro {
	
	WebDriver driver;
	String url = "https://www.facebook.com";
	
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	
	@BeforeTest
	public void befTest() {
		reporter = new ExtentHtmlReporter("./Reports/myreport1.html");
		reporter.config().setDocumentTitle("Automation Report");
		reporter.config().setReportName("Functional Test");
		reporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Hostname", "localhost");
		extent.setSystemInfo("OS", "Window11");
		extent.setSystemInfo("Tester Name", "Nasneen");
		extent.setSystemInfo("Browser Name", "Chrome");
		
		driver = new ChromeDriver();
		
	}
	
	@BeforeMethod
	public void loadUrl() {
		driver.get(url);
		
	}
	
	@Test
	public void fbTitleVerification() {
		test = extent.createTest("FbTitleVerification");
		String exp = "facebook";
		String actual = driver.getTitle();
		System.out.println(actual);
		org.testng.Assert.assertEquals(actual, exp);
	}
	
	@Test
	public void buttonTextVerification() {
		test = extent.createTest("buttonVerification");
		String expectation = "Log in";
		String actual1 = driver.findElement(By.name("login")).getText();
		System.out.println("Actual text is : "+actual1);
		org.testng.Assert.assertEquals(actual1, expectation);	}
	
	@AfterMethod
	public void browserClose(ITestResult result) throws IOException {
		
		if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL, "test case failed is "+result.getName());
			test.log(Status.FAIL, "test case failed is "+result.getThrowable());
			String screenshotpath = screenshotMethod(driver,result.getName());
			test.addScreenCaptureFromPath(screenshotpath);
		}
		
		else if(result.getStatus()==ITestResult.SKIP) {
			test.log(Status.SKIP, "test case skipped is "+result.getName());
		}
		
		else if (result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, "test case passed is "+result.getName());
			
		}
	}

	   private String screenshotMethod(WebDriver driver, String screenshotname) throws IOException {
		// TODO Auto-generated method stub
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destination = "./Screenshot/"+screenshotname+".png";
		
		FileHandler.copy(src, new File(destination));
		return destination;
	}
	
	@AfterTest
	public void teardown() {
		extent.flush();
	}

	
}
