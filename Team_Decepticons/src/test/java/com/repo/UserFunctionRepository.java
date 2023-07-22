package com.repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserFunctionRepository {

	@FindBy(xpath = "//div[text()='Edit']")
	public static WebElement Editbtn;

	@FindBy(xpath = "//label[text()=' Male ']")
	public static WebElement Maleradiobtn;

	@FindBy(id = "landLinePhoneNumber")
	public static WebElement llphnofield;

	@FindBy(id = "address_name_7762070814175388479")
	public static WebElement Addnamefield;

	@FindBy(id = "address_zip_7762070814175388479")
	public static WebElement Addzipfield;

	@FindBy(xpath = "(//span[text()='City']/following::input)[1]")
	public static WebElement Addcityfield;

	@FindBy(xpath = "//action-button[contains(@class,'btn-main d-inline-block')]//button[1]")
	public static WebElement Savebtn;

	@FindBy(xpath = "//span[text()='Add address']")
	public static WebElement Addaddressbtn;

	@FindBy(xpath = "(//input[@class='form-control w-100 ng-pristine ng-invalid ng-touched'])")
	public static WebElement addressname2;

	@FindBy(xpath = "(//input[@class='form-control w-100 ng-untouched ng-pristine ng-invalid'])")
	public static WebElement addressline2;

	@FindBy(xpath = "(//input[@class='form-control w-100 ng-untouched ng-pristine ng-valid'])[5]")
	public static WebElement addresszip2;

	@FindBy(xpath = "(//input[@class='form-control w-100 ng-untouched ng-pristine ng-valid'])[6]")
	public static WebElement addresscity2;

	@FindBy(xpath = "(//input[@class='form-control w-100 ng-untouched ng-pristine ng-valid'])[7]")
	public static WebElement addressstate2;

	@FindBy(xpath = "//span[text()='Add mobile phone']")
	public static WebElement Addmobilebtn;

	@FindBy(css = "#phone_name_18")
	public static WebElement mbphnoname;

	@FindBy(css = "input[type='tel']")
	public static WebElement mbphnumber;

	@FindBy(xpath = "//div[text()='Password']")
	public static WebElement Passwordbtn;

	@FindBy(css = "button.btn.d-flex")
	public static WebElement Changebtn;

	@FindBy(css = "#id_69")
	public static WebElement Oldpassfield;

	@FindBy(css = "#id_70")
	public static WebElement Newpassfield;

	@FindBy(css = "#id_71")
	public static WebElement Cnfrmpassfield;

	@FindBy(xpath = "(//button[contains(@class,'btn d-flex')]//span)[2]")
	public static WebElement submitpass;

	@FindBy(css = "a[routerlink='/personal/notifications']")
	public static WebElement Notifybtn;

	@FindBy(xpath = "//div[text()='Notification settings']")
	public static WebElement Notifysettingsbtn;

	@FindBy(xpath = "(//label[@class='custom-control-label'])[2]")
	public static WebElement ReceiveMailradio;

	@FindBy(xpath = "(//button[@type='button'])[36]")
	public static WebElement FeedMessgreceivebtn;

	@FindBy(xpath = "(//button[@type='button'])[26]")
	public static WebElement RefChgnotifybtn;

	@FindBy(xpath = "(//div[@class='nav-item-text'])[3]")
	public static WebElement Contactbtn;

	@FindBy(css = "format-field-value.d-block.text-truncate")
	public static WebElement Personconatct;

	@FindBy(xpath = "//div[text()='Remove from contacts']")
	public static WebElement Removecnctbtn;

	@FindBy(xpath = "//div[text()='Add to contacts']")
	public static WebElement Addcnctbtn;

}
