package com.Internet.herokuapp.helper.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(

		features = "src/test/resources/employee.feature",

		glue = "com.Internet.herokuapp.stepDefinitions",
		
		tags = "@tag2",

		plugin = { "pretty", "html:target/cucumber-report.html" }

//		
)

public class Runner {

}
