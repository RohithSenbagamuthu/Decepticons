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
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.repo.PaymentsRepository;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class InternalPayment {

	public static WebDriver driver;
	File f = new File("C:\\Users\\rsenbagamuthu\\eclipse-workspace\\Team_Decepticons\\Excel\\Book2.xlsx");

	@Given("The User should login with valid credentials")
	public void the_user_should_login_with_valid_credentials() throws IOException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.cyclos.org/ui/login");
		driver.manage().window().maximize();
		PageFactory.initElements(driver, PaymentsRepository.class);

		WebDriverWait wait = new WebDriverWait(driver, 30);
		

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

	}

	@When("After login navigate and click Banking")
	public void after_login_navigate_and_click_banking() {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.bankingbtn));
		PaymentsRepository.bankingbtn.click();

	}

	@When("User should click payment to system")
	public void user_should_click_payment_to_system() {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.paytosysbtn));
		PaymentsRepository.paytosysbtn.click();
	}

	@When("User should enter the amount and description")
	public void user_should_enter_the_amount_and_description() {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.paysysamtfield));
		PaymentsRepository.paysysamtfield.sendKeys("11");

		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.amountdescrfield));
		PaymentsRepository.amountdescrfield.sendKeys("Internal Payment");

	}

	@When("User should click next button")
	public void user_should_click_next_button() {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.NextButton));
		PaymentsRepository.NextButton.click();
	}

	@When("After that user verify the details and click confrim")
	public void after_that_user_verify_the_details_and_click_confrim() {
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(PaymentsRepository.confrimpaybtn));
		PaymentsRepository.confrimpaybtn.click();
		

	}

	@Then("User verify the amount transcation is done")
	public void user_verify_the_amount_transcation_is_done() {
		
		boolean displayed = PaymentsRepository.systosysmsg.isDisplayed();
		
		if (displayed) {
			System.out.println("Payment to system Transcation Successfully Executed..");
			
		}
		else {
			System.out.println("Transcation failed Retry..");
		}

	}

}
