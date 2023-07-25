package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
features={"C:\\Users\\msundarraj\\eclipse-workspace\\Team_Decepticons\\Team_Decepticons\\src\\test\\resources\\Feature Files\\Account information\\AccountInformation2.feature"},
glue = {"com.stepdefinition"},
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","pretty" },
monochrome = true,dryRun=true)
public class AIRunner2{
	
}
