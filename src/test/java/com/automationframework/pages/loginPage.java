package com.automationframework.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class loginPage {
	
	WebDriver driver;
	
	public loginPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
    
	
	@FindBy(name="uid") @CacheLookup WebElement txtUsername;

	@FindBy(name="password") @CacheLookup WebElement txtPassword;

	@FindBy(name="btnLogin") @CacheLookup WebElement clickSubmit;


	
	//@FindBy(linkText="Log out") @CacheLookup WebElement clickLogout;
	
	 
	
	
	
	
	public void login(String uname, String pwd) {
		
		txtUsername.sendKeys(uname);
		txtPassword.sendKeys(pwd);
	    clickSubmit.sendKeys(Keys.RETURN);
}

		
		
	}
	


