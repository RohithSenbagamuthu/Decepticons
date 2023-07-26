package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
	features = {  

		"C:\\Users\\hagunaseelan\\eclipse-workspace\\javatest\\PilotProject1\\src\\test\\resources\\FeatureFiles\\Updateprofile.feature",
		"C:\\Users\\hagunaseelan\\eclipse-workspace\\javatest\\PilotProject1\\src\\test\\resources\\FeatureFiles\\Multipleaddress.feature",
		"C:\\Users\\hagunaseelan\\eclipse-workspace\\javatest\\PilotProject1\\src\\test\\resources\\FeatureFiles\\Multiplephone.feature",
		"C:\\Users\\hagunaseelan\\eclipse-workspace\\javatest\\PilotProject1\\src\\test\\resources\\FeatureFiles\\Managepasswords.feature",
		"C:\\Users\\hagunaseelan\\eclipse-workspace\\javatest\\PilotProject1\\src\\test\\resources\\FeatureFiles\\Notificationpreference.feature",
		"C:\\Users\\hagunaseelan\\eclipse-workspace\\javatest\\PilotProject1\\src\\test\\resources\\FeatureFiles\\Managecontacts.feature",
},
glue = {"com.stepdefinition" },



dryRun = false,

monochrome = true,

plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "pretty" })
public class Runner {

}
