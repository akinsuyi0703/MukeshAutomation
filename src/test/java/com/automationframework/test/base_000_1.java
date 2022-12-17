package com.automationframework.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import com.automationframework.utilities.browserFactory;

public class base_000_1 {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
	
	  driver=browserFactory.startAplication(driver, "chrome", "https://demo.guru99.com/V4/");
	
}
	@AfterClass
	public void tearDown() {
		
		browserFactory.quitBrowser(driver);
	}

}
