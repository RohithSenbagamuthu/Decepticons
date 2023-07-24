package com.stepdefinition;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.repo.PaymentsRepository;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UsertoUserPayment {

	public static WebDriver driver;
	@Given("User Should  navigate to the login page")
	public void user_should_navigate_to_the_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.cyclos.org/ui/login");
		driver.manage().window().maximize();
		PageFactory.initElements(driver, PaymentsRepository.class);
		
	}

	@When("User should submit username and password and login to the application")
	public void user_should_submit_username_and_password_and_login_to_the_application() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.username));
	    PaymentsRepository.username.sendKeys("demo");
	    wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.password));
	    PaymentsRepository.password.sendKeys("1234");
	    wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.submit));
	    PaymentsRepository.submit.click();
	}

	@When("User should click the Banking Menu")
	public void user_should_click_the_banking_menu() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.bankingbtn));
		PaymentsRepository.bankingbtn.click(); 
		
		
	    
	}

	@When("User should click the payment to user")
	public void user_should_click_the_payment_to_user() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.paymentUserbtn));
		PaymentsRepository.paymentUserbtn.click();
	    
	}

	@When("User should select user")
	public void user_should_select_user() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.contactlistbtn));
		PaymentsRepository.contactlistbtn.click();
		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.selectuser));
		PaymentsRepository.selectuser.click();
	   
	}

	@Given("User Should navigate to amount field")
	public void user_should_navigate_to_amount_field() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.amountfield));
		PaymentsRepository.amountfield.sendKeys("20");
	   
	}

	@Given("User should enter text in description")
	public void user_should_enter_text_in_description() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.amountdescrfield));
		PaymentsRepository.amountdescrfield.sendKeys("Current Bill");
	    
	}

	@Given("User should click next")
	public void user_should_click_next() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.NextButton));
		PaymentsRepository.NextButton.click();
	   
	}

	@Given("User should click confrim")
	public void user_should_click_confrim() throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.confrimpaybtn));
		Thread.sleep(3000);
		PaymentsRepository.confrimpaybtn.click();
	   
	}

	@When("User should verify the balance after transcation")
	public void user_should_verify_the_balance_after_transcation() {
	   
	}

	@Given("User Should navigate to amount field and enter the value")
	public void user_should_navigate_to_amount_field_and_enter_the_value() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.amountfield));
	   PaymentsRepository.amountfield.sendKeys("10000000");
	   wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.amountdescrfield));
	   PaymentsRepository.amountdescrfield.sendKeys("Maximum Ttanscation");
	}
}
