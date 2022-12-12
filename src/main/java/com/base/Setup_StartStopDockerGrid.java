package com.base;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.util.PropertyReader;

public class Setup_StartStopDockerGrid {
	public static String browzersave;
	
	@Test(priority=1)
	public void start_DockerGrid() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("cmd /c start start_dockergrid.bat");
		Thread.sleep(15000);
			
	}
	
	
	@Test(priority = 2)
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
	
	
	
//	
//	@Test(priority=3)
//	public void stop_DockerGrid() throws IOException, InterruptedException {
//		Runtime.getRuntime().exec("cmd /c start stop_dockergrid.bat");
//		Thread.sleep(5000);
//		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");// close cmd 
//	}
//	

}
