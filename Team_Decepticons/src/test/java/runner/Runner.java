package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
	features = {  

//		"C:\\Users\\DELL\\Downloads\\Team_Decepticons\\Team_Decepticons\\Feature Files\\Userfunction\\Updateprofile.feature",
		"C:\\Users\\DELL\\Downloads\\Team_Decepticons\\Team_Decepticons\\Feature Files\\Userfunction\\Multipleaddress.feature",
		"C:\\Users\\DELL\\Downloads\\Team_Decepticons\\Team_Decepticons\\Feature Files\\Userfunction\\Multiplephone.feature",
		"C:\\Users\\DELL\\Downloads\\Team_Decepticons\\Team_Decepticons\\Feature Files\\Userfunction\\Managepasswords.feature",
		"C:\\Users\\DELL\\Downloads\\Team_Decepticons\\Team_Decepticons\\Feature Files\\Userfunction\\Notificationpreference.feature",
		"C:\\Users\\DELL\\Downloads\\Team_Decepticons\\Team_Decepticons\\Feature Files\\Userfunction\\Managecontacts.feature",
		"C:\\Users\\DELL\\Downloads\\Team_Decepticons\\Team_Decepticons\\Feature Files\\Userfunction\\Updateprofile.feature",
},
glue = {"com.stepdefinition" },



dryRun = false,

monochrome = true,

plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "pretty" })
public class Runner {

}
