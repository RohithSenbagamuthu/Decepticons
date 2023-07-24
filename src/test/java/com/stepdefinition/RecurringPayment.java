package com.stepdefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.repo.PaymentsRepository;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RecurringPayment {

	public static WebDriver driver;
	

	@Given("To launch the cyclos website and login with the valid username and password")
	public void to_launch_the_cyclos_website_and_login_with_the_valid_username_and_password() {

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

	@Given("To click on banking")
	public void to_click_on_banking() {

		//JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.bankingbtn));
	 PaymentsRepository.bankingbtn.click();
		

	}

	@Given("To click on payment to user")
	public void to_click_on_payment_to_user() {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.paymentUserbtn));
		PaymentsRepository.paymentUserbtn.click();

	}

	@Given("Clicking on the list of contacts and select user")
	public void clicking_on_the_list_of_contacts_and_select_user() {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.contactlistbtn));
		PaymentsRepository.contactlistbtn.click();

		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.selectuser));
		PaymentsRepository.selectuser.click();

	}

	@Given("Enter the amount and select recurring payment from the dropdown")
	public void enter_the_amount_and_select_recurring_payment_from_the_dropdown() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.amountfield));
		PaymentsRepository.amountfield.sendKeys("40");

		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.schedulingbtn));
		PaymentsRepository.schedulingbtn.click();

		// wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.recinstllbtn));
		Thread.sleep(3000);
		PaymentsRepository.recinstllbtn.click();

	}

	@Given("Click the radiobuttons necessary")
	public void click_the_radiobuttons_necessary() {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.fxdnoofoccradbtn));
		PaymentsRepository.fxdnoofoccradbtn.click();
	}

	@Given("Click the number of occurences and months")
	public void click_the_number_of_occurences_and_months() {

		WebDriverWait wait = new WebDriverWait(driver, 60);

		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.recurroccno));
		PaymentsRepository.recurroccno.sendKeys("2");

		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.prcessevrycount));
		PaymentsRepository.prcessevrycount.sendKeys("2");

		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.daymonweek));
		PaymentsRepository.daymonweek.click();

		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.recurringday));
		PaymentsRepository.recurringday.click();

	}

	@Given("Enter the description")
	public void enter_the_description() {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.amountdescrfield));
		PaymentsRepository.amountdescrfield.sendKeys("Making Recurring Payment");

	}

	@Given("Click the next button")
	public void click_the_next_button() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.NextButton));
		PaymentsRepository.NextButton.click();

	}

	@Given("Check the details and click confirm")
	public void check_the_details_and_click_confirm() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.confrimpaybtn));
		PaymentsRepository.confrimpaybtn.click();

	}

	@Then("Check if the payment has been processed")
	public void check_if_the_payment_has_been_processed() {

	}

}
