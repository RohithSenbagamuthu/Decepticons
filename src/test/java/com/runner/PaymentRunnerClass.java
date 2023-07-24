package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

features="C:\\Users\\rsenbagamuthu\\eclipse-workspace\\Team_Decepticons\\Feature Files\\Payments\\RecurringPayment.feature",
glue = {"com.stepdefinition"}
)

public class PaymentRunnerClass {

}
