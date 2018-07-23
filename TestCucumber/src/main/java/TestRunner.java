package main.java;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(			
		features = "src/features",
		glue = {"stepDefinitions"}		
		)

public class TestRunner {
	


}
