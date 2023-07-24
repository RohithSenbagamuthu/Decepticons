package com.stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.repo.PaymentsRepository;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.reactivex.rxjava3.functions.Action;

public class PaymentRequests {

	public static WebDriver driver;

	@Given("The user login to the account and navigate to banking menu and click it")
	public void the_user_login_to_the_account_and_navigate_to_banking_menu_and_click_it() throws IOException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.cyclos.org/ui/login");
		driver.manage().window().maximize();
		PageFactory.initElements(driver, PaymentsRepository.class);

		WebDriverWait wait = new WebDriverWait(driver, 30);
		File f = new File("C:\\Users\\rsenbagamuthu\\eclipse-workspace\\Team_Decepticons\\Excel\\Book2.xlsx");
		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);
		Sheet mysheet = wb.getSheet("Sheet1");
		Row row = mysheet.getRow(1);

		Cell cell = row.getCell(0);
		Cell cell2 = row.getCell(1);

		String username = cell.getStringCellValue();
		int password = (int) cell2.getNumericCellValue();

		String pass = Integer.toString(password);

		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.username));
		PaymentsRepository.username.sendKeys(username);

		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.password));
		PaymentsRepository.password.sendKeys(pass);

		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.submit));
		PaymentsRepository.submit.click();

		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.bankingbtn));
		PaymentsRepository.bankingbtn.click();
	}

	@Given("The user select the payment requests and click on send new request")
	public void the_user_select_the_payment_requests_and_click_on_send_new_request() {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.Paymentreqbtn));
		PaymentsRepository.Paymentreqbtn.click();
		
		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.sndnewreqbtn));
		PaymentsRepository.sndnewreqbtn.click();

	}

	@Given("The user should select receiver from contact list")
	public void the_user_should_select_receiver_from_contact_list() {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.contactlistbtn));
		PaymentsRepository.contactlistbtn.click();

		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.selectuser1));
		PaymentsRepository.selectuser1.click();

	}

	@Given("Enter the amount to be requested and select expiration date")
	public void enter_the_amount_to_be_requested_and_select_expiration_date() {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.amountfield));
		PaymentsRepository.amountfield.sendKeys("50");

		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.datehandle));
		PaymentsRepository.datehandle.sendKeys("08/01/2023");

	}

	@Given("The user navigate to scheduling and select pay now")
	public void the_user_navigate_to_scheduling_and_select_pay_now() {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.schedulingbtn));
		PaymentsRepository.schedulingbtn.click();

		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.paynow));
		PaymentsRepository.paynow.click();

	}

	@Then("User should select confrim and manage the pop-up and select confrim button")
	public void user_should_select_confrim_and_manage_the_pop_up_and_select_confrim_button() throws InterruptedException {

		//WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(3000);
		//wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.confrimpaybtn));
		PaymentsRepository.confrimpaybtn.click();

		Thread.sleep(3000);
		//wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.cnfrmpopupbtn));
		PaymentsRepository.cnfrmpopupbtn.click();

	}

	@Given("The user navigate to scheduling and select monthly installment")
	public void the_user_navigate_to_scheduling_and_select_monthly_installment() {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.schedulingbtn));
		PaymentsRepository.schedulingbtn.click();

		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.moninsllbtn));
		PaymentsRepository.moninsllbtn.click();

	}

	@Given("Enter number of installment for the request")
	public void enter_number_of_installment_for_the_request() {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.moninstllnum));
		PaymentsRepository.moninstllnum.sendKeys("5");

	}

	@Given("Select the First installment is immediate radio button")
	public void select_the_first_installment_is_immediate_radio_button() {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.moninstllradiobtn));
		PaymentsRepository.moninstllradiobtn.click();

	}

	@Then("The user should select confrim and manage the pop-up and click confrim button")
	public void the_user_should_select_confrim_and_manage_the_pop_up_and_click_confrim_button() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.confrimpaybtn));
		PaymentsRepository.finlcnfrmbtn.click();

		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.cnfrmpopupbtn));
		//Thread.sleep(3000);
		PaymentsRepository.finlcnfrmpopupbtn.click();

	}

}
