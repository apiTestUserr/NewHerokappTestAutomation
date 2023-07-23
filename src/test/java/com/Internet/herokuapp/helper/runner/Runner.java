package com.Internet.herokuapp.helper.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(

		features = "src/test/resources",

		glue = "com.Internet.herokuapp.stepDefinitions",


		plugin = { "json:C:\\Data\\cucumber.json", "pretty", "html:C:\\Data\\cucumber-html-reports\\cucumber.html" }

//		
)

public class Runner {

}
