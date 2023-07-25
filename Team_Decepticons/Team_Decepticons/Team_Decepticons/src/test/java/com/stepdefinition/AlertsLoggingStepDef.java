package com.stepdefinition;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.repo.alertAndLoggingRepository;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsLoggingStepDef {
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,30);
	
	
	@Given("navigate to the marketplace page")
	public void navigate_to_the_marketplace_page() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		
		PageFactory.initElements(driver,alertAndLoggingRepository.class);
		

		driver.get("https://demo.cyclos.org/ui/home");
		Thread.sleep(5000);
		alertAndLoggingRepository.login.click();
		
		Thread.sleep(3000);
		alertAndLoggingRepository.username.sendKeys("demo");
		alertAndLoggingRepository.password.sendKeys("1234");
		
		alertAndLoggingRepository.submit.click();
		
		Thread.sleep(6000);
		alertAndLoggingRepository.mp.click();
	
	   
	}

	@When("Click the Advertisement option")
	public void click_the_advertisement_option() {
		wait.until(ExpectedConditions.visibilityOf(alertAndLoggingRepository.add));
		alertAndLoggingRepository.add.click();
	   
	}

	@When("Click the Show advertisement and its displays a more advertisement")
	public void click_the_show_advertisement_and_its_displays_a_more_advertisement() {
		wait.until(ExpectedConditions.visibilityOf(alertAndLoggingRepository.showAdd));
		alertAndLoggingRepository.showAdd.click();
	}

	@When("click any one of the advertisement")
	public void click_any_one_of_the_advertisement() {
		wait.until(ExpectedConditions.visibilityOf(alertAndLoggingRepository.product));
		alertAndLoggingRepository.product.click();
	}

	@When("click the ask me question option")
	public void click_the_ask_me_question_option() {
		wait.until(ExpectedConditions.visibilityOf(alertAndLoggingRepository.askMeQus));
		alertAndLoggingRepository.askMeQus.click();
	}

	@When("handles the generated alert")
	public void handles_the_generated_alert() {
		wait.until(ExpectedConditions.visibilityOf(alertAndLoggingRepository.qus));
		alertAndLoggingRepository.qus.sendKeys("What are the flavours available");
		
		alertAndLoggingRepository.submit1.click();
	}

}
