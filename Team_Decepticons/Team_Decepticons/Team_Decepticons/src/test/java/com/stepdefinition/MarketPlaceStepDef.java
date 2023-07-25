package com.stepdefinition;

import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.repo.alertAndLoggingRepository;
import com.repo.marketPlaceRepository;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MarketPlaceStepDef {
   public static  WebDriver driver;
	
	
	@Given("Navigate to the login page")
	public void navigate_to_the_login_page() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://demo.cyclos.org/ui/home");
		
		
		driver.manage().window().maximize();
		
		PageFactory.initElements(driver,marketPlaceRepository.class);
		Thread.sleep(5000);
		marketPlaceRepository.login.click();
		
		
		
	}

	@When("Enters the username and password")
	public void enters_the_username_and_password() throws InterruptedException {
		Thread.sleep(3000);
		marketPlaceRepository.username.sendKeys("rubann");
		marketPlaceRepository.password.sendKeys("ruban@1234");
		
	}

	@When("Clicks the Login button")
	public void clicks_the_login_button() {
		marketPlaceRepository.submit.click();
	}

	@Given("navigate to the Marketplace page")
	public void navigate_to_the_marketplace_page() {
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(marketPlaceRepository.marketPlace));
		marketPlaceRepository.marketPlace.click();
	    
	}

	@When("Click the MyAdvertisement option")
	public void click_the_my_advertisement_option() {
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(marketPlaceRepository.myadd));
		marketPlaceRepository.myadd.click();
	    
	}

	@When("click the add new option on the top right")
	public void click_the_add_new_option_on_the_top_right() {
		WebDriverWait wait=new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOf(marketPlaceRepository.addNew));
		marketPlaceRepository.addNew.click();
	    
	}

	@When("Enters the name in the name field")
	public void enters_the_name_in_the_name_field() {
		WebDriverWait wait=new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOf(marketPlaceRepository.name));
		marketPlaceRepository.name.sendKeys("Food");
	   
	}

	@When("Select the any one of the activity in category field")
	public void select_the_any_one_of_the_activity_in_category_field() {
		marketPlaceRepository.category.click();
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(marketPlaceRepository.categoryList));
	    marketPlaceRepository.categoryList.click();
	
	}

	@When("Select fromDate in the publication period")
	public void select_from_date_in_the_publication_period() {
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(marketPlaceRepository.fromDate));
		marketPlaceRepository.fromDate.sendKeys("07/06/2023");
	   
	}

	@When("Select ToDate in the Publication period")
	public void select_to_date_in_the_publication_period() {
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(marketPlaceRepository.toDate));
		marketPlaceRepository.toDate.sendKeys("07/09/2023");
	}

	@When("types the text in the description field")
	public void types_the_text_in_the_description_field() {
		marketPlaceRepository.desc.sendKeys("This is sample Advertisement");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");

		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(marketPlaceRepository.saveBtn));
		marketPlaceRepository.saveBtn.click();
		ExtentCucumberAdapter.addTestStepLog(Status.PASS+"Login Clicked");
	}
}
