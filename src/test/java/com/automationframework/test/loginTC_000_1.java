package com.automationframework.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.automationframework.pages.loginPage;
import com.automationframework.utilities.helperClass;


public class loginTC_000_1 extends base1{
	
	
	
	@Test(priority=1)
	public void loginTest() {
		
		logger=extent.createTest("Login to guru99Demo");
		
		loginPage lp=PageFactory.initElements(driver, loginPage.class);
		
		logger.info("Starting Application");
		
		lp.login("mngr463587", "yrYzAqA");
		
		logger.pass("Login successfully");
		
		helperClass.captureScreenshot(driver);
		
	}
	
	@Test(priority=2)
	public void invalidLoginTest() {
		
		logger=extent.createTest("Login to guru99Demo");
		
		loginPage lp=PageFactory.initElements(driver, loginPage.class);
		
		logger.info("Starting Application");
		
		lp.login("mngr463582", "yrYzAqA");
		
		logger.pass("Login successfully");
		
		helperClass.captureScreenshot(driver);
		
	}

}
