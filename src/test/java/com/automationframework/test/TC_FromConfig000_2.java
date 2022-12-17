package com.automationframework.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.automationframework.pages.loginPage;
import com.automationframework.utilities.helperClass;


public class TC_FromConfig000_2 extends base1{
	
	
	
	@Test
	public void loginTest() {
		
		logger=extent.createTest("Login to guru99Demo");
		
		loginPage lp=PageFactory.initElements(driver, loginPage.class);
		
		logger.info("Starting Application");
		
		lp.login(config.getUsername(), config.getPassword());
		
        logger.pass("Login successfully");
		
		helperClass.captureScreenshot(driver);
		
	}

}
