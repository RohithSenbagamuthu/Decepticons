package com.repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class marketPlaceRepository {
	@FindBy(xpath = "//a[@id='login-link']")
	public static WebElement login;

	@FindBy(xpath = "//input[@type='text']")
	public static WebElement username;

	@FindBy(xpath = "//input[@type='password']")
	public static WebElement password;

	@FindBy(xpath = "(//button[@type='button'])[2]")
	public static WebElement submit;
	
	@FindBy(xpath="(//div[@class='menu-text'])[3]")
	public static WebElement marketPlace;
	
	//send a richtext
	@FindBy(linkText="My advertisements")
	public static WebElement myadd;
	
	@FindBy(xpath="//div[text()='Add new']")
	public static WebElement addNew;
	
	@FindBy(xpath="//input[contains(@class,'form-control w-100')]")
	public static WebElement name;
	
	@FindBy(xpath="(//button[@type='button'])[5]")
	public static WebElement category;
	
	@FindBy(xpath="//a[text()=' Activities ']")
	public static WebElement categoryList;
	
	//publication period
	@FindBy(xpath="(//input[contains(@class,'form-control flex-grow-1')])[1]")
	public static WebElement fromDate;
	
	@FindBy(xpath="(//input[contains(@class,'form-control flex-grow-1')])[2]")
	public static WebElement toDate;
	
	//enter rich text
	@FindBy(className="editor")
	public static WebElement desc;
	
	@FindBy(xpath="(//button[@type='button'])[25]")
	public static WebElement saveBtn;
	
	//Address
	@FindBy(xpath="(//button[contains(@class,'form-control text-left')])[2]")
	public static WebElement address;
	
	//to customize favorite filters
	@FindBy(xpath="//div[text()='Advertisements']")
	public static WebElement Advertisement;
	
	@FindBy(css="input.form-control.w-100")
	public static WebElement keyword;
	
	@FindBy(xpath="//button[@type='button']//div[1]")
	public static WebElement showMoreFilter;
	
	@FindBy(xpath="(//label[@class='custom-control-label'])[1]")
	public static WebElement favorite;
	
	@FindBy(xpath="//span[text()='Show advertisements']")
	public static WebElement showAdd;
	
	@FindBy(xpath="(//input[@placeholder='0,00'])[1]")
	public static WebElement minPrice;
	
	@FindBy(xpath="(//input[@placeholder='0,00'])[2]")
	public static WebElement maxPrice;
	
	@FindBy (xpath="//div[@class='card-title']/following-sibling::div[1]")
	public static WebElement result;

	

}
