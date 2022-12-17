package com.automationframework.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.automationframework.pages.loginPage;
import com.automationframework.utilities.helperClass;


public class TC_FromExcel0003 extends base1{
	
	
	
	@Test(priority=1)
	public void loginTest() {
		
        logger=extent.createTest("Login to guru99Demo");
		
		loginPage lp=PageFactory.initElements(driver, loginPage.class);
		
		logger.info("Starting Application");
		
		lp.login(excel.getStringData("Sheet1", 0, 0), excel.getStringData("Sheet1", 0, 1));
		
		logger.pass("Login successfully");
		
		helperClass.captureScreenshot(driver);
		
		
		
	}
	@Test(priority=2)
	public void loginTest1() {
		
        logger=extent.createTest("Logout");
		
	    logger.fail("Logout failed");
		
		
		
		
	}

}
