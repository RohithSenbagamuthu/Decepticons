package com.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.repo.marketPlaceRepository;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MarketPlaceFavoStepDef {
	public static WebDriver driver;

	@Given("Navigate to the Market Place Page")
	public void navigate_to_the_market_place_page() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.cyclos.org/ui/home");

		driver.manage().window().maximize();

		PageFactory.initElements(driver, marketPlaceRepository.class);
		Thread.sleep(5000);
		marketPlaceRepository.login.click();

		Thread.sleep(3000);
		marketPlaceRepository.username.sendKeys("rubann");
		marketPlaceRepository.password.sendKeys("ruban@1234");
		marketPlaceRepository.submit.click();
	}

	@When("Click on the Advertisement option")
	public void click_on_the_advertisement_option() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(marketPlaceRepository.marketPlace));
		marketPlaceRepository.marketPlace.click();

		wait.until(ExpectedConditions.visibilityOf(marketPlaceRepository.Advertisement));
		marketPlaceRepository.Advertisement.click();
	}

	@When("Click show more filter")
	public void click_show_more_filter() throws InterruptedException {
		Thread.sleep(5000);
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 50);
		 * wait.until(ExpectedConditions.visibilityOf(marketPlaceRepository.
		 * showMoreFilter));
		 */
		marketPlaceRepository.showMoreFilter.click();

	}

	@When("Send Keyword in the keyword field")
	public void send_keyword_in_the_keyword_field() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(marketPlaceRepository.keyword));
		marketPlaceRepository.keyword.sendKeys("food");

	}

	@When("Click the favorite checkbox")
	public void click_the_favorite_checkbox() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(marketPlaceRepository.favorite));
		marketPlaceRepository.favorite.click();

	}

	@When("enter minimum and maximum price")
	public void enter_minimum_and_maximum_price() {
		marketPlaceRepository.minPrice.sendKeys("1");
		marketPlaceRepository.maxPrice.sendKeys("12");
	}

	@When("Click Show Advertisement Option")
	public void click_show_advertisement_option() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(marketPlaceRepository.showAdd));
		marketPlaceRepository.showAdd.click();
	}

	@When("Favorites are displayed")
	public void favorites_are_displayed() {
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals("Search advertisements - Cyclos")) 
			System.out.println("Favorite food displayed");
		
		else
			System.out.println("Favorite food is not displayed");
	}

}
