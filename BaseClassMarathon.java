package baseclassMarathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utils.ExcelCode;

public class BaseClassMarathon extends AbstractTestNGCucumberTests {
	public String filename;
	
	public static ExtentHtmlReporter repo;

	public static  ExtentReports extend;

	public  static ExtentTest test;

	public String testcase, testCaseDescription, testcaseCategory, testcaseAuthor;
	
public static final ThreadLocal<RemoteWebDriver> tldriver=new ThreadLocal<RemoteWebDriver>();
	
	//public String filename;
	
	
	public void setDriver()
	{
		tldriver.set(new ChromeDriver());
	}
	
	public RemoteWebDriver getDriver()
	{
		return tldriver.get();
	}
	

	
	@BeforeMethod
	public void preCondition() throws InterruptedException
	{
		setDriver();
		getDriver().get("https://login.salesforce.com");
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		

		
	}
	
	@AfterMethod
	public void postCondition()
	{
		getDriver().close();
		
	}
	
	
	@BeforeSuite
	public void startReport()
	{
		repo = new ExtentHtmlReporter("./report/result.html");
	    
	    repo.setAppendExisting(true);
	   
	     extend = new ExtentReports();
	   
	    extend.attachReporter(repo);
	}
		

	@AfterSuite
	public void stopReport()
	{
		extend.flush();
	}
	@BeforeClass
	public void testDetails()
	{
	   test = extend.createTest(testcase, testCaseDescription);
	    test.assignCategory(testcaseCategory);
	    test.assignAuthor(testcaseAuthor);
	}
	
	
	public int takeSnap() throws IOException
	{
		int random=(int)(Math.random()*99999);
		File source=getDriver().getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps/image"+random+".png");
		FileUtils.copyFile(source, dest);
		return random;
	}
public void reportStep(String message, String status) throws IOException
{
	if(status.equalsIgnoreCase("pass"))
	{
		test.pass(message,MediaEntityBuilder.createScreenCaptureFromPath("../snaps/image"+takeSnap()+".png").build());
	}
	
	else if(status.equalsIgnoreCase("fail"))
	{
		test.fail(message,MediaEntityBuilder.createScreenCaptureFromPath("../snaps/image"+takeSnap()+".png").build());
	}
}
	
	

}
