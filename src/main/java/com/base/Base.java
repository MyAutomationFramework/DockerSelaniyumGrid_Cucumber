package com.base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.util.PropertyReader;

public class Base {
	public static String browzersave;
	// return type driver method
	@Test
	public  void getDriver() throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		browzersave = PropertyReader.getConfigProperty("BrowserName");
		  URL url= new URL("http://localhost:4444/wd/hub");
		if (browzersave.equalsIgnoreCase("chrome")) {
			cap.setBrowserName("chrome");
		}
		
		else if(browzersave.equalsIgnoreCase("firefox")) {
			cap.setBrowserName("firefox");
		}
		
		
		else if(browzersave.equalsIgnoreCase("edge")) {
			cap.setBrowserName("MicrosoftEdge");
		}
		
		// WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444"),cap);
		 WebDriver driver=new RemoteWebDriver(url,cap);
	
		  driver.get("https://www.google.com/");
		  System.out.println("print title------>"+driver.getTitle());
		 driver.quit();
	}
	
	
	
	
	
	
	
	
}
