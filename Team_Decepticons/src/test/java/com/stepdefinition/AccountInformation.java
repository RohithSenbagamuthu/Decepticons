package com.stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.repo.*;
public class AccountInformation {
	public static WebDriver driver;
	public WebDriverWait wait;
	
	//Hook is repeating  before of all testCase
	@Before
	public static void config()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		
	}
	//Repeated steps in each testCase are used Background keyword
	@Given("launch the Cyclos Website")
	public void launch_the_cyclos_website() {
		driver.get("https://demo.cyclos.org/ui/login");
	    driver.manage().window().maximize();
	}

	@Given("User should enter the username and password to login")
	public void user_should_enter_the_username_and_password_to_login() throws IOException {
		 PageFactory.initElements(driver,Repo.class);
		    wait = new WebDriverWait(driver,30);
		    //Using DataDriven for user name and password
			File f = new File("C:\\Users\\msundarraj\\eclipse-workspace\\Team_Decepticons\\Team_Decepticons\\Excel\\Ai.xlsx");
			FileInputStream fis = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			Sheet mysheet = wb.getSheet("Sheet1");
			Row row = mysheet.getRow(1);
			Cell cell = row.getCell(0);
			Cell cell2 = row.getCell(1);
			String username = cell.getStringCellValue();
			int password = (int) cell2.getNumericCellValue();
			String pass = Integer.toString(password);
	  wait.until(ExpectedConditions.visibilityOf(Repo.userName));
		  Repo.userName.sendKeys(username);
		  Repo.password.sendKeys(pass);
	}

	@Given("User should click Submit button")
	public void user_should_click_submit_button() {
		driver.findElement(By.xpath("//button[contains(@class,'btn d-flex')]")).click();
	}

	@Given("User should click Banking Menu")
	public void user_should_click_banking_menu() {
		wait.until(ExpectedConditions.visibilityOf(Repo.BankingMenu));
		   Repo.BankingMenu.click();
	}
	
	
	
	//View account summary TestCase=1
	@Then("User should click Member Account")
	public void user_should_click_member_account() throws IOException, InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(Repo.memberAccount)).click();
		Thread.sleep(3000);
		TakesScreenshot screenShot1=(TakesScreenshot)driver;
		   File img=screenShot1.getScreenshotAs(OutputType.FILE);
		   File file1=new File("C:\\Users\\msundarraj\\eclipse-workspace\\Team_Decepticons\\Team_Decepticons\\ScreenShot\\AccountSummary.png");
		   FileUtils.copyFile(img,file1);
		
	}
	
	
	//View current balance TestCase=2
	@Then("Get the Current balance")
	public void get_the_current_balance() throws IOException {
		TakesScreenshot screenShot1=(TakesScreenshot)driver;
		   File image1=screenShot1.getScreenshotAs(OutputType.FILE);
		   File file1=new File("C:\\Users\\msundarraj\\eclipse-workspace\\Team_Decepticons\\Team_Decepticons\\ScreenShot\\CurrentBalance.png");
		   FileUtils.copyFile(image1,file1);
	}
	
	
	
	//View payment history TestCase=3 
	@Then("Click on Notification Link")
	public void click_on_notification_link() throws IOException, InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(Repo.Notification)).click();
		Thread.sleep(3000);
	   TakesScreenshot screenShot=(TakesScreenshot)driver;
	   File image=screenShot.getScreenshotAs(OutputType.FILE);
	   File file=new File("C:\\Users\\msundarraj\\eclipse-workspace\\Team_Decepticons\\Team_Decepticons\\ScreenShot\\TransactionHistory.png");
	   FileUtils.copyFile(image,file);
	}
	
	
	
	//Print and export payment TestCase=4  
	@Given("Click any one of the Account transaction")
	public void click_any_one_of_the_account_transaction() throws InterruptedException {
		Thread.sleep(6000);
        wait.until(ExpectedConditions.visibilityOf(Repo.paymentUserbtn));
        Repo.paymentUserbtn.click();
        wait.until(ExpectedConditions.visibilityOf(Repo.contactlistbtn));
        Repo.contactlistbtn.click();
        wait.until(ExpectedConditions.visibilityOf(Repo.selectuser));
        Repo.selectuser.click();
	}
	@Then("In transfer details window click on print button")
	public void in_transfer_details_window_click_on_print_button() throws InterruptedException {
		Thread.sleep(6000);
		wait.until(ExpectedConditions.visibilityOf(Repo.amountfield));
		Repo.amountfield.sendKeys("20");
		wait.until(ExpectedConditions.visibilityOf(Repo.amountdescrfield));
		Repo.amountdescrfield.sendKeys("Current Bill");
		  wait.until(ExpectedConditions.visibilityOf(Repo.NextButton));
		  Repo.NextButton.click();
	        Thread.sleep(3000);
	        Repo.confrimpaybtn.click();
	        Thread.sleep(3000);
	        boolean displayed = Repo.shownotify.isDisplayed();
	        if (displayed) {
	            System.out.println(Repo.shownotify.getText());
	        } else {
	            System.out.println(Repo.shownotify.getText());
	        }
		  System.out.println("Driver is Successfully Closed");
		 ExtentCucumberAdapter.addTestStepLog(Status.PASS + "Successfully Passed");
	}
	
}
