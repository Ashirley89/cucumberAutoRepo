package com.basic.backgroundSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			
			monochrome=true,
			features= {"src/test/resources/com/basic/backgroundFF/"},
			glue= {"com/basic/backgroundSD/"},
			
				plugin= {"pretty", 
						"html:target/cucumber-htmlreport",
						"json:target/cucumber-report7.json",
						"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport7.html"
					
				}
			
			
		
			)
	


public class RunBackgroundTest {	
	
}
