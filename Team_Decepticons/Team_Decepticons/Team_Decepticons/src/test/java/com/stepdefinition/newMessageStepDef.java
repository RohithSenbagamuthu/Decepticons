package com.stepdefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.repo.messageRepository;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class newMessageStepDef extends messageRepository {
	public static WebDriver driver;

	@Given("navigate to the login page")
	public void navigate_to_the_login_page() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		PageFactory.initElements(driver, messageRepository.class);

		driver.get("https://demo.cyclos.org/ui/home");
		Thread.sleep(5000);
		messageRepository.login.click();
	}

	@When("enters the username and password")
	public void enters_the_username_and_password() {
		messageRepository.username.sendKeys("demo");
		messageRepository.password.sendKeys("1234");
	}

	@When("Clicks the login button")

	public void clicks_the_login_button() {
		messageRepository.submit.click();

	}

	@When("click the message icon")
	public void click_the_message_icon() throws InterruptedException {
		Thread.sleep(2000);
		messageRepository.message.click();

	}

	@When("click new message in rightside")
	public void click_new_message_in_rightside() throws InterruptedException {
		Thread.sleep(5000);
		messageRepository.newMessage.click();

	}

	@Given("user navigate to the new message field")
	public void user_navigate_to_the_new_message_field() {

	}

	@When("Select sendTo option as user")
	public void select_send_to_option_as_user() throws InterruptedException {
		Thread.sleep(2000);
		messageRepository.sendTo.click();
		Thread.sleep(5000);
		List<WebElement> ls = driver.findElements(By.xpath("//div[@role='listbox']//a"));
		Thread.sleep(5000);
		for (WebElement itr : ls) {
			if (itr.getText().equals("User")) {
				itr.click();
				break;
			}

		}
	}

	@When("Enter To user name")
	public void enter_to_user_name() throws InterruptedException {
		messageRepository.toUser.click();
		Thread.sleep(5000);
		messageRepository.activeWalking.click();

	}

	@When("enter subject in the subject field")
	public void enter_subject_in_the_subject_field() {
		messageRepository.subject.sendKeys("Greetings");
	}

	@When("Write description in the description box")
	public void write_description_in_the_description_box() {
		messageRepository.content.sendKeys("Hi,Good morning");

	}

	@Then("Click the send button")
	public void click_the_send_button() {
		messageRepository.sendButton.click();

	}

	@When("Select sendTo option as administration")
	public void select_send_to_option_as_administration() throws InterruptedException {
		Thread.sleep(2000);
		messageRepository.sendTo.click();
		Thread.sleep(5000);
		List<WebElement> ls = driver.findElements(By.xpath("//div[@role='listbox']//a"));
		Thread.sleep(5000);
		for (WebElement itr : ls) {
			if (itr.getText().equals("Administration")) {
				itr.click();
				break;
			}

		}
	}

	@When("slect the category field")
	public void slect_the_category_field() throws InterruptedException {
		messageRepository.contentList.click();
		List<WebElement> ls = driver.findElements(By.xpath("//div[@class='dropdown-menu show']//a"));
		Thread.sleep(5000);
		for (WebElement itr : ls) {
			if (itr.getText().equals("Support")) {
				itr.click();
				break;
			}

		}
	}

	@When("user should enter subject in the subject field")
	public void user_should_enter_subject_in_the_subject_field() {
		messageRepository.adminSub.sendKeys("I need support");
	}

	@When("User Writes description in the description box")
	public void user_writes_description_in_the_description_box() {
		messageRepository.content.sendKeys("My Transcation is not success");
	}

	@Then("Clicks the send button")
	public void clicks_the_send_button() {
		messageRepository.sendButton.click();
	}

}
