package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features={"C:\\Users\\msundarraj\\eclipse-workspace\\Team_Decepticons\\Team_Decepticons\\src\\test\\resources\\Feature Files\\Account information\\AccountInformation2.feature"},
glue = {"com.stepdefinition"},
plugin = {"html:target/cucumber-reports/cucumberreport.html" },
monochrome = true,dryRun=true)
public class AIRunner2 extends AbstractTestNGCucumberTests {
	
}
