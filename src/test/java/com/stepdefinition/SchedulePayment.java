package com.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.repo.PaymentsRepository;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SchedulePayment {

	public static WebDriver driver;

	@Given("Login with valid credentials in that application")
	public void login_with_valid_credentials_in_that_application() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.cyclos.org/ui/login");
		driver.manage().window().maximize();
		PageFactory.initElements(driver, PaymentsRepository.class);

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.username));
		PaymentsRepository.username.sendKeys("demo");

		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.password));
		PaymentsRepository.password.sendKeys("1234");

		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.submit));
		PaymentsRepository.submit.click();

	}

	@Given("After user login mouse over to the Banking menu")
	public void after_user_login_mouse_over_to_the_banking_menu() {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.bankingbtn));
		PaymentsRepository.bankingbtn.click();

	}

	@Given("User should click payment to user menu")
	public void user_should_click_payment_to_user_menu() {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.paymentUserbtn));
		PaymentsRepository.paymentUserbtn.click();

	}

	@Given("User should select user in the contact list")
	public void user_should_select_user_in_the_contact_list() {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.contactlistbtn));
		PaymentsRepository.contactlistbtn.click();

		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.selectuser));
		PaymentsRepository.selectuser.click();

	}

	@Given("User should enter amount to be pay")
	public void user_should_enter_amount_to_be_pay() {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.amountfield));
		PaymentsRepository.amountfield.sendKeys("45");

	}

	@Given("After that select schedule payment and schedule the date")
	public void after_that_select_schedule_payment_and_schedule_the_date() {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.schedulingbtn));
		PaymentsRepository.schedulingbtn.click();

		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.schedulebtn));
		PaymentsRepository.schedulebtn.click();

		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.datehandle));
		PaymentsRepository.datehandle.click();

		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.datehandle));
		PaymentsRepository.datehandle.sendKeys("08/01/2023");

	}

	@Given("Click next verify the user details and select confrim")
	public void click_next_verify_the_user_details_and_select_confrim() {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.NextButton));
		PaymentsRepository.NextButton.click();

		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.confrimpaybtn));
		PaymentsRepository.confrimpaybtn.click();
	}

	@Then("Navigate to Schedule payments and click it")
	public void navigate_to_schedule_payments_and_click_it() {

		PaymentsRepository.SchedulePaymenyt.click();

	}

	@Then("User should Verify the scheduled payment is displayed")
	public void user_should_verify_the_scheduled_payment_is_displayed() {

		boolean displayed = PaymentsRepository.VerifySchedule.isDisplayed();

		if (displayed) {

			System.out.println("The payment is Scheduled Successfully..");
		} else {
			System.out.println("The payment is not Scheduled" + "\n" + "*ERROR OCCURED*");

		}

	}

}
