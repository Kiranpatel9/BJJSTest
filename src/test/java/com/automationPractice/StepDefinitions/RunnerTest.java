package com.automationPractice.StepDefinitions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
				plugin = {"pretty", 
						  "json:target/cucumber.json", 
						  "html:target/site/cucumber-pretty"},
				features= "src/test/resources/",
        		glue = {"com/automationPractice/StepDefinitions"},
				tags = {"@addtothecart, @createaccount,@reviewprevorder"}
        		
				)
public class RunnerTest {
}
