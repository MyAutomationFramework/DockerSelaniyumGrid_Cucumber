package testRunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

@CucumberOptions(
							
		features = {"src/test/resources/features/google.feature"},
		 glue={"stepDifinations"},
						
         
			
        plugin={
                "pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/cucumber-jason-reports/Cucumber.json",
                "html:target/cucumber-html-reports/cucumber.html",
                 "junit:target/cucumber-xml-reports/Cucumber.xml",
                "json:target/cucumber.json"},
        
        dryRun = false,
        monochrome = true
)
public class TestRunner {

}
