package com.repo;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentsRepository {

	@FindBy(xpath = "(//div[@class='nav-item-text'])[2]")
	public static WebElement paymentUserbtn;

	@FindBy(css = "button.btn.btn-icon.ml-2")
	public static WebElement contactlistbtn;

	@FindBy(xpath = "//a[contains(text(),'SANJAY OS')]")
	public static WebElement selectuser;

	@FindBy(xpath = "//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary']")
	public static WebElement NextButton;

	@FindBy(css = "input.form-control.text-right")
	public static WebElement amountfield;

	@FindBy(css = "textarea[rows='3']")
	public static WebElement amountdescrfield;

	@FindBy(xpath = "//button[contains(@class,'btn d-flex')]")
	public static WebElement nxtbtn;

	@FindBy(xpath = "(//button[@type='button']//span)[1]")
	public static WebElement confrimpaybtn;

	@FindBy(xpath = "(//div[@class='nav-item-text'])[3]")
	public static WebElement paytosysbtn;

	@FindBy(xpath = "input.form-control.text-right")
	public static WebElement paysysamtfield;

	@FindBy(css = "button.btn.d-flex")
	public static WebElement sysnxtbtn;

	@FindBy(xpath = "(//button[contains(@class,'btn d-flex')])[1]")
	public static WebElement syscnfrmbtn;

	@FindBy(xpath = "//div[contains(@class,'w-100 mw-100')]")
	public static WebElement schedulingbtn;

	@FindBy(xpath = "//a[contains(text(),'Scheduled')]")
	public static WebElement schedulebtn;

	@FindBy(xpath = "//input[contains(@class,'form-control flex-grow-1')]")
	public static WebElement datehandle;// robot class

	@FindBy(xpath = "//div[text()='Payment requests']")
	public static WebElement Paymentreqbtn;

	@FindBy(xpath = "//div[text()='Send a new request']")
	public static WebElement sndnewreqbtn;

}
