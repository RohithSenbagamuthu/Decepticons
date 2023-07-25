package com.runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@io.cucumber.testng.CucumberOptions(

		features = {

				"C:\\Users\\mnatarajan\\Downloads\\Team_Decepticons\\Team_Decepticons\\Feature Files\\Messaging\\newMessage.feature",
				"C:\\Users\\mnatarajan\\Downloads\\Team_Decepticons\\Team_Decepticons\\Feature Files\\Alerts & logging\\AlertsLoggig.feature",
				"C:\\Users\\mnatarajan\\Downloads\\Team_Decepticons\\Team_Decepticons\\Feature Files\\Market Place\\MarketPlace.feature",
				"C:\\Users\\mnatarajan\\Downloads\\Team_Decepticons\\Team_Decepticons\\Feature Files\\Market Place\\MarketPlace2.feature"
		},

//feature file path

		glue = { "com.stepDefinition" },

		plugin = { "html:target/cucumber-reports/cucumberreport.html" },

//plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","pretty"},

		monochrome = true

)

public class runner extends  AbstractTestNGCucumberTests{

}
