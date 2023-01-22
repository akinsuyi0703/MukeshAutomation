package com.automationframework.test;



import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.*;

import com.automationframework.utilities.browserFactory;
import com.automationframework.utilities.excelDataProviders;
import com.automationframework.utilities.helperClass;
import com.automationframework.utilities.readConfig;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class base1 {
	
	public WebDriver driver;
	public excelDataProviders excel;
	public readConfig config;
	public ExtentReports extent;
	public ExtentSparkReporter spark;
	public ExtentTest logger;
	
	@BeforeSuite
	public void setUpSuite() throws Exception {
		
	Reporter.log("Setting up reports and Test Started", true);
		
	excel=new excelDataProviders();
	config=new readConfig();
	
	extent = new ExtentReports();
	File file = new File("index.html");
	spark = new ExtentSparkReporter(file);//html file will be generated
	spark.loadXMLConfig(new File("./src/test/resources/extent-config.xml"));
	extent.attachReporter(spark);
	Reporter.log("Setting Done- Test can be Started", true);
	
	}
	
	@Parameters({"browser", "urlToBeTested"})
	@BeforeClass
	public void setUp(String browser, String url) {
	//public void setUp() {
	
	Reporter.log("Trying to start browser and getting application ready", true);
	//driver=browserFactory.startAplication(driver, config.getBrowser(), config.getStagingURL());
	driver=browserFactory.startAplication(driver, browser, url);
	
	Reporter.log("Browser and Application is up and running", true);
	
}
	@AfterClass
	public void tearDown() {
		
		
		browserFactory.quitBrowser(driver);
	}
	
	@AfterMethod
	public void closeDown(ITestResult result) throws IOException {
		
		Reporter.log("Test is about to end", true);
		
         Reporter.log("Test is about to end", true);
		
		if(result.getStatus()==ITestResult.FAILURE) {
		
		   logger.fail("Test Failed", MediaEntityBuilder.createScreenCaptureFromPath(helperClass.captureScreenshot(driver)).build());
	}
		else if(result.getStatus()==ITestResult.SUCCESS) {
			
		   logger.pass("Test Passed", MediaEntityBuilder.createScreenCaptureFromPath(helperClass.captureScreenshot(driver)).build());
		}
		
		else if(result.getStatus()==ITestResult.SKIP) {
			
		   logger.skip("Test Skip", MediaEntityBuilder.createScreenCaptureFromPath(helperClass.captureScreenshot(driver)).build());
			
		}
	
		
		
		extent.flush();
		
		Reporter.log("Test Completed >>>> A report generated", true);
		Desktop.getDesktop().browse(new File("index.html").toURI());//open the file in the desktop default browse
		
		
		
	}
	
		
		
	}


