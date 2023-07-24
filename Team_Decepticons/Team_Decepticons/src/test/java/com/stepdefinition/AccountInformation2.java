package com.stepdefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.repo.Repo;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AccountInformation2 {
	public static WebDriver driver;
	public static WebDriverWait wait;
	@Before
	public static void config()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.cyclos.org/ui/login");
	    driver.manage().window().maximize();
	    PageFactory.initElements(driver,Repo.class);
	    wait = new WebDriverWait(driver,30);
       wait.until(ExpectedConditions.visibilityOf(Repo.userName)).sendKeys("demo");
       wait.until(ExpectedConditions.visibilityOf(Repo.password)).sendKeys("1234"); 
       driver.findElement(By.xpath("//button[contains(@class,'btn d-flex')]")).click();
       wait.until(ExpectedConditions.visibilityOf(Repo.BankingMenu));
	   Repo.BankingMenu.click();
	}
	
	@When("User should click the Show  Filter button")
	public void user_should_click_the_show_filter_button() throws InterruptedException {
		Thread.sleep(6000);
		wait.until(ExpectedConditions.visibilityOf(Repo.filter));
		Repo.filter.click();
	}

	@When("Select pick from your contact list on the user filter and select a contact")
	public void select_pick_from_your_contact_list_on_the_user_filter_and_select_a_contact() {
		wait.until(ExpectedConditions.visibilityOf(Repo.inputUser));
		Repo.inputUser.sendKeys("Active Walking");
	}

	@When("Click the peroid menu and select any one option")
	public void click_the_peroid_menu_and_select_any_one_option() {
		wait.until(ExpectedConditions.visibilityOf(Repo.period));
		Repo.period.sendKeys(" Last 12 months ");
	}

	@When("Select the Description menu and enter the values")
	public void select_the_description_menu_and_enter_the_values() {
		wait.until(ExpectedConditions.visibilityOf(Repo.describtionFilter));
		Repo.describtionFilter.sendKeys("no");
	}

	@When("Select the From Amount menu enter the amount value")
	public void select_the_from_amount_menu_enter_the_amount_value() {
		wait.until(ExpectedConditions.visibilityOf(Repo.fromAmt));
		Repo.fromAmt.sendKeys("12");
	}

	@When("Click the Filter menu and select one option")
	public void click_the_filter_menu_and_select_one_option() {
		wait.until(ExpectedConditions.visibilityOf(Repo.typeFilter));
		Repo.typeFilter.click();
		wait.until(ExpectedConditions.visibilityOf(Repo.typeFilterSelection));
		Repo.typeFilterSelection.click();
	}
	@Then("Click the To Amount option and enter the value")
	public void click_the_to_amount_option_and_enter_the_value() {
		wait.until(ExpectedConditions.visibilityOf(Repo.toAmt));
		Repo.toAmt.sendKeys("12");
	}
	@Given("Click any one from Member Account")
	public void click_any_one_from_member_account() {
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
		wait.until(ExpectedConditions.visibilityOf(Repo.SingleAccount)).click();
	}

	@Then("User should click the print button")
	public void user_should_click_the_print_button() {
		wait.until(ExpectedConditions.visibilityOf(Repo.printPayment)).click();
	}
}
