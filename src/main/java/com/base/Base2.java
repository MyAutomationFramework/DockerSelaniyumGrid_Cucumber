package com.base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Base2 {
	
	      String browser="firefox";
	      DesiredCapabilities cap;
	 public	 WebDriver 	  driver;
	 
	
	public static String hubaddress="http://localhost:4444/wd/hub";
	// method
	 public WebDriver setDriver() throws MalformedURLException {
		 if (browser=="chrome") {
			 cap=DesiredCapabilities.chrome();
			 cap.setBrowserName("chrome");
		 }
		 
		 
		 else if(browser=="firefox") {
			 cap=DesiredCapabilities.firefox();
			 cap.setBrowserName("firefox");
		 }
		 
		 
	 else if(browser=="edge") {
		 cap=DesiredCapabilities.edge();
		 cap.setBrowserName("edge");
	            
	
		 }
		 
 	  driver= new RemoteWebDriver(new URL(hubaddress),cap);
 	  
		 // driver.manage().window().maximize();
		  return driver;
		 
	 }// end method

	 
	 
	
	 
}
