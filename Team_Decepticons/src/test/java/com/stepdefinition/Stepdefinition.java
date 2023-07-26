package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefinition {

	
	WebDriver driver;
	@Before

	@Given("Launch the Application")
	public void launch_the_application() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://demo.cyclos.org/ui/login");
		PageFactory.initElements(driver, UserfunctionRepository.class);
		
	}

	@Given("Enter User Name")
	public void enter_user_name() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.username));
		UserfunctionRepository.username.click(); 
		UserfunctionRepository.username.sendKeys("Praju");
	   
	}

	@When("Enter Password")
	public void enter_password() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.userpassword));
		UserfunctionRepository.userpassword.click();
		UserfunctionRepository.userpassword.sendKeys("Praju@143$");
		UserfunctionRepository.Submit.click();
	    
	}

	@Then("Click profile and click Edit")
	public void click_profile_and_click_edit() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.profile));
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.edit));
		UserfunctionRepository.profile.click();
		UserfunctionRepository.edit.click();
	    
	}

	@Then("Enter Address")
	public void enter_address() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.addressRegion));
		UserfunctionRepository.addressRegion.clear();
		UserfunctionRepository.addressRegion.sendKeys("Karnataka");

		 
	   
	}

	@When("Enter email")
	public void enter_email() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.email));
		UserfunctionRepository.email.clear();
		UserfunctionRepository.email.sendKeys("rpk62@gmail.com");
	    
	}

	@When("Enter City")
	public void enter_city() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.city));
		UserfunctionRepository.city.clear();
		UserfunctionRepository.city.sendKeys("Bangalore");
	    
	}

	@Then("Click Save")
	public void click_save() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.save));
		UserfunctionRepository.save.click();
	    
	}
//2nd one
	@Given("User should click on edit button")
	public void user_should_click_on_edit_button() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.edit1));
		UserfunctionRepository.edit1.click();
		
	    
	}

	@Given("click on Add address button")
	public void click_on_add_address_button() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.Addaddress));
		UserfunctionRepository.Addaddress.click();
	    
	}

	@Then("click on name text field")
	public void click_on_name_text_field() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.AddaddressName));
		UserfunctionRepository.AddaddressName.click();
	    
	}

	@Then("enter the valid name")
	public void enter_the_valid_name() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.AddaddressName));
		UserfunctionRepository.AddaddressName.sendKeys("67/1ramakridhan nager");
	    
	}

	@Then("click on Address line1 text field")
	public void click_on_address_line1_text_field() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.Addaddressline1));
		UserfunctionRepository.Addaddressline1.click();
	    
	}

	@Then("enter the valid Address line1")
	public void enter_the_valid_address_line1() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.Addaddressline1));
		UserfunctionRepository.Addaddressline1.sendKeys("67/1");
	   
	}

	@Then("Click on city text field")
	public void click_on_city_text_field() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.city1));
		UserfunctionRepository.city1.click();
	    
	}

	@Then("enter the valid city")
	public void enter_the_valid_city() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.city1));
		UserfunctionRepository.city1.sendKeys("chennai");
	    
	}

	@Then("Click on Zipcode text field")
	public void click_on_zipcode_text_field() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.Zipcode));
		UserfunctionRepository.Zipcode.click();
	    
	}

	@Then("enter the valid Zipcode")
	public void enter_the_valid_zipcode() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.Zipcode));
		UserfunctionRepository.Zipcode.sendKeys("6003003");
	    
	}

	@Then("click on save button")
	public void click_on_save_button() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.save));
		UserfunctionRepository.save.click();
	    
	}
	
//3rd one
	
	@Given("User should click on AddMobile phone button")
	public void user_should_click_on_add_mobile_phone_button() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.edit1));
		UserfunctionRepository.edit1.click();
		UserfunctionRepository.Addaddress.click();
	    
	}

	@Then("click on Mobile phone name text field")
	public void click_on_mobile_phone_name_text_field() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.AddMobilePhones));
		UserfunctionRepository.AddMobilePhones.click();
	    
	}

	@Then("enter valid Mobile phone name")
	public void enter_valid_mobile_phone_name() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.MobilePhonename));
		UserfunctionRepository.MobilePhonename.sendKeys("prajwal");
	    
	}

	@Then("click on Mobile phone number text field")
	public void click_on_mobile_phone_number_text_field() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.MobilePhonenumber));
		UserfunctionRepository.MobilePhonenumber.click();
	    
	}

	@Then("enter valid Mobile phone number")
	public void enter_valid_mobile_phone_number() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.MobilePhonenumber));
		UserfunctionRepository.MobilePhonenumber.sendKeys("7010695388");
	    
	}

	@Then("click on save button mobile phone")
	public void click_on_save_button_mobile_phone() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.save1));
		UserfunctionRepository.save1.click();;
	   
	}


	
	
//4thone
	
	@Given("Click on Profile button")
	public void click_on_profile_button() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.profile1));
		UserfunctionRepository.profile1.click();

		
	    
	}

	@Given("Click on password button")
	public void click_on_password_button() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.password1));
		UserfunctionRepository.password1.click();
	}

	@Then("click on Change button")
	public void click_on_change_button() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.changebutton));
		UserfunctionRepository.changebutton.click();
	   
	}

	@Then("Click on Old password text field")
	public void click_on_old_password_text_field() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.oldpassword));
		UserfunctionRepository.oldpassword.click();
	}

	@Then("enter the valid password in password text field")
	public void enter_the_valid_password_in_password_text_field() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.oldpassword));
		UserfunctionRepository.oldpassword.sendKeys("Praju@143$");
	    
	}

	@Then("Click on new password text field")
	public void click_on_new_password_text_field() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.newpassword));
		UserfunctionRepository.newpassword.sendKeys("Praju@143$");
	   
	}

	@Then("enter the new valid password in new password text field")
	public void enter_the_new_valid_password_in_new_password_text_field() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.newpassword));
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.againnewpassword));
		UserfunctionRepository.newpassword.sendKeys("hemaraj12345@");
		UserfunctionRepository.againnewpassword.sendKeys("hemaraj12345@");
	   
	    
	}

	@Then("Click on Submit button")
	public void click_on_submit_button() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.submit2));
		UserfunctionRepository.submit2.sendKeys("hemaraj12345@");
	    
	}
	//5thone
	
	@Given("Click the Profile button")
	public void click_the_profile_button() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.profile3));
		UserfunctionRepository.profile3.click();
	    
	}

	@Then("Click on notification button")
	public void click_on_notification_button() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.notification));
		UserfunctionRepository.notification.click();
	    
	}

	@Then("Click on unread checkbox")
	public void click_on_unread_checkbox() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.checkbox));
		UserfunctionRepository.checkbox.click();
	    
	}
///6thone
	
	@Given("Click on the Profile button")
	public void click_on_the_profile_button() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.profile1));
		UserfunctionRepository.profile1.click();
	    
	    
	}

	@Then("Click on contacts button")
	public void click_on_contacts_button() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.contacts));
		UserfunctionRepository.contacts.click();
	 
	}

	@Then("Click on First profile in the list")
	public void click_on_first_profile_in_the_list() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserfunctionRepository.listview));
		UserfunctionRepository.listview.click();

	}
	
	

}
