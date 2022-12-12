package stepDifinations;

import java.net.MalformedURLException;

import com.base.Base2;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GoogleExcution extends Base2{
	
	@Given("I open google url")
	public void i_open_google_url() throws MalformedURLException {
		   driver=setDriver();
	    driver.get("https://www.google.com/");
	    System.out.println("print urllllllll"+driver.getCurrentUrl());
	    
	}

	@Then("validate title")
	public void validate_title() {
	   System.out.println("bakeee hain validate title");
	}

	
	

}
