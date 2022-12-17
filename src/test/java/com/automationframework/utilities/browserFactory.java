package com.automationframework.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserFactory {
	
	//static WebDriver driver;
	

	public static WebDriver startAplication(WebDriver driver, String browserName, String appURL) {
	
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else {
			System.out.println("We do not support this browser");
			
	 }
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appURL);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;

	
  }
	public static void quitBrowser(WebDriver driver) {
		
		driver.quit();
	}


}
