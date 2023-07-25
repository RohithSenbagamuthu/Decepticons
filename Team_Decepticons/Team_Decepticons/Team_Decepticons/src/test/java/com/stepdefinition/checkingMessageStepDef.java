package com.stepdefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.repo.messageRepository;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class checkingMessageStepDef {
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, 60);

	@Given("navigate to the message page")
	public void navigate_to_the_message_page() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();

		PageFactory.initElements(driver, messageRepository.class);

		driver.get("https://demo.cyclos.org/ui/home");
		// wait.until(ExpectedConditions.visibilityOf(messageRepository.login));
		Thread.sleep(8000);
		messageRepository.login.click();

		Thread.sleep(3000);
		messageRepository.username.sendKeys("demo");
		messageRepository.password.sendKeys("1234");

		messageRepository.submit.click();
		wait.until(ExpectedConditions.visibilityOf(messageRepository.message));
		messageRepository.message.click();

	}

	@When("Select From  option")
	public void select_from_option() throws InterruptedException {
		Thread.sleep(5000);
		messageRepository.from.click();
		Thread.sleep(3000);
		messageRepository.fromOption.click();
	}

	@When("Send Keywords in the keyword field")
	public void send_keywords_in_the_keyword_field() {
		wait.until(ExpectedConditions.visibilityOf(messageRepository.keywords));
		messageRepository.keywords.sendKeys("this is for demo purpose");
	}

	@When("Select the user name")
	public void select_the_user_name() throws InterruptedException {
		Thread.sleep(3000);
		messageRepository.user1.click();
		Thread.sleep(2000);
		messageRepository.active.click();
	}

	@When("select the inbox option")
	public void select_the_inbox_option() throws InterruptedException {
		/*
		 * Thread.sleep(4000);
		 * //wait.until(ExpectedConditions.visibilityOf(messageRepository.inbox));
		 * messageRepository.inbox.click();
		 */

		// wait.until(ExpectedConditions.visibilityOf(messageRepository.inboxVerify));
		System.out.println(messageRepository.inboxVerify.getText());
	}

	@When("select the sent option")
	public void select_the_sent_option() throws InterruptedException {
		// wait.until(ExpectedConditions.visibilityOf(messageRepository.sendButton));
		messageRepository.sendButton.click();

		wait.until(ExpectedConditions.visibilityOf(messageRepository.sendVerify));
		System.out.println(messageRepository.sendVerify.getText());
	}

	@When("Select From")
	public void select_from() throws InterruptedException {
		Thread.sleep(5000);
		messageRepository.from.click();
		Thread.sleep(3000);
		messageRepository.fromOption.click();
	}

	@When("Send Keywords")
	public void send_keywords() {
		wait.until(ExpectedConditions.visibilityOf(messageRepository.keywords));
		messageRepository.keywords.sendKeys("this is for demo purpose");

	}

	@When("Select user name")
	public void select_user_name() throws InterruptedException {
		Thread.sleep(3000);
		messageRepository.user1.click();
		Thread.sleep(2000);
		messageRepository.active.click();
	}
	
	@When("select the trash option")
	public void select_the_trash_option() {
		// wait.until(ExpectedConditions.visibilityOf(messageRepository.trash));
		messageRepository.trash.click();

		wait.until(ExpectedConditions.visibilityOf(messageRepository.trashVerify));
		System.out.println(messageRepository.trashVerify.getText());

	}

	@When("Select From  option in from field")
	public void select_from_option_in_from_field() throws InterruptedException {
		Thread.sleep(5000);
		messageRepository.from.click();
		Thread.sleep(3000);
		messageRepository.fromOption.click();
	}

	@When("Send Keyword in  keyword field")
	public void send_keyword_in_keyword_field() {
		wait.until(ExpectedConditions.visibilityOf(messageRepository.keywords));
		messageRepository.keywords.sendKeys("this is for demo purpose");

	}

	@When("Selects  userName")
	public void selects_user_name() throws InterruptedException {
		Thread.sleep(3000);
		messageRepository.user1.click();
		Thread.sleep(2000);
		messageRepository.active.click();
	}

}