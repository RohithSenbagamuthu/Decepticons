package com.repo;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class alertAndLoggingRepository {
	// login
	@FindBy(xpath = "//a[@id='login-link']")
	public static WebElement login;

	@FindBy(xpath = "//input[@type='text']")
	public static WebElement username;

	@FindBy(xpath = "//input[@type='password']")
	public static WebElement password;

	@FindBy(xpath = "(//button[@type='button'])[2]")
	public static WebElement submit;

	@FindBy(xpath="(//div[@class='menu-text'])[3]")
	public static WebElement mp;

	@FindBy(xpath = "//div[text()='Advertisements']")
	public static WebElement add;

	@FindBy(xpath = "//span[text()='Show advertisements']")
	public static WebElement showAdd;

	@FindBy(xpath = "(//div[@class='avatar-container full-size'])[1]")
	public static WebElement product;

	@FindBy(xpath = "(//button[@type='button']//div)[3]")
	public static WebElement askMeQus;
	
	@FindBy(xpath="//textarea[@class='form-control ng-pristine ng-invalid ng-touched']")
	public static WebElement qus;
	
	@FindBy(xpath="(//button[@type=\"button\"])[6]")
	public static WebElement submit1;

}
