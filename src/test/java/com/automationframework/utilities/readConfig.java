package com.automationframework.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readConfig {
	
	Properties pro;
	
	public readConfig() {
	
	File src =new File("./Configuration/config.properties");
	
	try {
		FileInputStream fis=new FileInputStream(src);
		
		pro=new Properties();
		
		pro.load(fis);
	} catch (Exception e) {
		System.out.println("Not able to losd config file >>"+e.getMessage());
	
	}
	
	}
	
	public String getDataFromConfig(String keyToSearch) {
		
		return pro.getProperty(keyToSearch);
		
	}
	
    public String getBrowser() {
    	
    	return pro.getProperty("browser");
		
	}
    public String getStagingURL() {
    	
    	return pro.getProperty("qaURL");
	
}

    public String getUsername(){
    	
    	return pro.getProperty("username");
    	
    }
    
    public String getPassword() {
    	
    	return pro.getProperty("password");
    }


 
}
