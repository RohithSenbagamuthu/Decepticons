package com.stepdefinition;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.repo.Repo;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AccountInformation2 {
	public static WebDriver driver;
	@Before
	public void config() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.cyclos.org/ui/login");
	    driver.manage().window().maximize();
	    PageFactory.initElements(driver,Repo.class);
	   WebDriverWait wait = new WebDriverWait(driver,30);
       wait.until(ExpectedConditions.visibilityOf(Repo.userName)).sendKeys("demo");
       wait.until(ExpectedConditions.visibilityOf(Repo.password)).sendKeys("1234"); 
       driver.findElement(By.xpath("//button[contains(@class,'btn d-flex')]")).click();
       Thread.sleep(3000);
       wait.until(ExpectedConditions.visibilityOf(Repo.BankingMenu));
	   Repo.BankingMenu.click();
	}
	
	@When("User should click the Show  Filter button")
	public void user_should_click_the_show_filter_button() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,30);
	   Thread.sleep(3000);
       wait.until(ExpectedConditions.visibilityOf(Repo.BankingMenu));
	   Repo.BankingMenu.click();
		 Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(Repo.filter));
		Repo.filter.click();
	}

	@When("Select pick from your contact list on the user filter and select a contact")
	public void select_pick_from_your_contact_list_on_the_user_filter_and_select_a_contact() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(Repo.inputUser)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[contains(text(),' Active Walking')])[3]")).click();
	}

	@When("Click the peroid menu and select any one option")
	public void click_the_peroid_menu_and_select_any_one_option() throws InterruptedException, IOException {
		 WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(Repo.period)).click();
		driver.findElement(By.xpath("//a[contains(text(),' Last 3 ')]")).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,300)");
		TakesScreenshot screenShot1=(TakesScreenshot)driver;
		   File image3=screenShot1.getScreenshotAs(OutputType.FILE);
		   File file3=new File("C:\\Users\\msundarraj\\eclipse-workspace\\Team_Decepticons\\Team_Decepticons\\ScreenShot\\Filters.png");
		   FileUtils.copyFile(image3,file3);
	}

	@Given("Click any one from Member Account")
	public void click_any_one_from_member_account() {
		 WebDriverWait wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOf(Repo.BankingMenu));
		   Repo.BankingMenu.click();
		wait.until(ExpectedConditions.visibilityOf(Repo.SingleAccount)).click();
	}

	@Then("In transfer details window view single user payment details")
	public void in_transfer_details_window_view_single_user_payment_details() throws IOException, InterruptedException {
		Thread.sleep(3000);
		TakesScreenshot screenShot=(TakesScreenshot)driver;
		   File image=screenShot.getScreenshotAs(OutputType.FILE);
		   File file=new File("C:\\Users\\msundarraj\\eclipse-workspace\\Team_Decepticons\\Team_Decepticons\\ScreenShot\\PaymentDetails.png");
		   FileUtils.copyFile(image,file);
	}

	@Given("User should click the Member Account")
	public void user_should_click_the_member_account() {
		 WebDriverWait wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOf(Repo.memberAccount));
		   Repo.memberAccount.click();
		wait.until(ExpectedConditions.visibilityOf(Repo.SingleAccount)).click();
	}

	@Then("User should click the print button")
	public void user_should_click_the_print_button() {
		 WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(Repo.printPayment)).click();
		ExtentCucumberAdapter.addTestStepLog(Status.PASS + "Successfully Passed");
	}
	
}
