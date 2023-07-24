package com.repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentsRepository {

	@FindBy(xpath = "//input[@placeholder='User']")
	public static WebElement username;

	@FindBy(xpath = "//input[@type='password']")
	public static WebElement password;

	@FindBy(xpath = "//span[text()='Submit']")
	public static WebElement submit;

	@FindBy(id = "menu_banking")
	public static WebElement bankingbtn;

	@FindBy(xpath = "(//div[@class='nav-item-text'])[2]")
	public static WebElement paymentUserbtn;

	@FindBy(css = "button.btn.btn-icon.ml-2")
	public static WebElement contactlistbtn;

	@FindBy(xpath = "//a[contains(text(),'Demo three')]")
	public static WebElement selectuser;

	@FindBy(xpath = "//a[contains(text(),'Green shop')]")
	public static WebElement selectuser1;

	@FindBy(xpath = "//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary']")
	public static WebElement NextButton;

	@FindBy(css = "input.form-control.text-right")
	public static WebElement amountfield;

	@FindBy(css = "textarea[rows='3']")
	public static WebElement amountdescrfield;

	@FindBy(xpath = "//button[contains(@class,'btn d-flex')]")
	public static WebElement nxtbtn;

	@FindBy(xpath = "//span[text()='Confirm']")
	public static WebElement confrimpaybtn;

	@FindBy(xpath = "(//div[@class='nav-item-text'])[3]")
	public static WebElement paytosysbtn;

	@FindBy(xpath = "//input[contains(@class,'form-control text-right')]")
	public static WebElement paysysamtfield;

	@FindBy(css = "button.btn.d-flex")
	public static WebElement sysnxtbtn;

	@FindBy(xpath = "(//button[contains(@class,'btn d-flex')])[1]")
	public static WebElement syscnfrmbtn;

	@FindBy(xpath = "//div[text()='The payment was successfully processed']")
	public static WebElement systosysmsg;

	@FindBy(xpath = "//div[contains(@class,'w-100 mw-100')]")
	public static WebElement schedulingbtn;

	@FindBy(xpath = "//a[contains(text(),'Scheduled')]")
	public static WebElement schedulebtn;

	@FindBy(xpath = "//input[contains(@class,'form-control flex-grow-1')]")
	public static WebElement datehandle;

	@FindBy(xpath = "//div[text()='Scheduled payments']")
	public static WebElement SchedulePaymenyt;

	@FindBy(xpath = "//a[text()='Green shop']")
	public static WebElement VerifySchedule;

	@FindBy(xpath = "//div[text()='Payment requests']")
	public static WebElement Paymentreqbtn;

	@FindBy(xpath = "//div[text()='Send a new request']")
	public static WebElement sndnewreqbtn;

	@FindBy(xpath = "//div[@class='dropdown-menu show']//a[1]")
	public static WebElement paynow;

	@FindBy(xpath = "//a[contains(text(),'Monthly installments')]")
	public static WebElement moninsllbtn;

	@FindBy(xpath = "//input[@type='number']")
	public static WebElement moninstllnum;

	@FindBy(xpath = "custom-control-label")
	public static WebElement moninstllradiobtn;

	@FindBy(xpath = "(//button[contains(@class,'btn d-flex')])[2]")
	public static WebElement cnfrmpopupbtn;

	@FindBy(xpath = "//span[text()='Confirm']")
	public static WebElement finlcnfrmbtn;

	@FindBy(xpath = "(//button[@type='button'])[5]")
	public static WebElement finlcnfrmpopupbtn;

	@FindBy(xpath = "//a[contains(text(),'Recurring payments')]")
	public static WebElement recurringpaybtn;

	@FindBy(xpath = "//label[text()=' Fixed number of occurrences ']")
	public static WebElement fxdnoofoccradbtn;

	@FindBy(xpath = "//a[text()=' Recurring payments ']")
	public static WebElement recinstllbtn;

	@FindBy(xpath = "//input[@formcontrolname='amount']")
	public static WebElement prcessevrycount;

	@FindBy(xpath = "(//button[contains(@class,'form-control text-left')])[2]")
	public static WebElement daymonweek;

	@FindBy(xpath = "//a[contains(text(),'Days')]")
	public static WebElement recurringday;

	@FindBy(xpath = "(//input[@type='number'])[1]")
	public static WebElement recurroccno;

}
