package com.repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Repo {
	@FindBy (xpath="//input[@type='text']")//CLICK
	public static WebElement userName;
	
	@FindBy (xpath="//input[@placeholder='Password']")//CLICK
	public static WebElement password;

	@FindBy (xpath="//a[@id='menu_banking']")//CLICK
	public static WebElement BankingMenu;
	
	@FindBy (xpath="//div[@class='main-container container-md d-flex flex-column flex-grow-1']//a")//CLICK
	public static WebElement memberAccount;
	
	@FindBy (xpath="//div[@class='row no-gutters']/div[4]")//GETTEXT
	public static WebElement AccountBalance;
	
	@FindBy (xpath="//*[@id='notifications-link']")//CLICK
	public static WebElement Notification;
	//
	@FindBy (xpath="(//tr)[3]")//CLICK
	public static WebElement SingleAccount;

	@FindBy (xpath="//*[contains(text(),'Print')]")//CLICK
	public static WebElement printPayment;

	@FindBy (xpath="//button[@class='back-button btn btn-transparent']")//CLICK
	public static WebElement MoveBankingMenu;
	//
	@FindBy (xpath="//*[contains(text(),'Show filters')]")//CLICK
	public static WebElement filter;

	@FindBy (xpath="//button[@class='btn btn-icon ml-2']")//CLICK
	public static WebElement filterUser;

	@FindBy (xpath="(//a[contains(text(),' Active Walking ')])[3]")//CLICK
	public static WebElement listUser;
	
	@FindBy (xpath="//button[@class='btn btn-icon ml-2']")
	public static WebElement inputUser;

	@FindBy (xpath="//button[@id='id_44']")//CLICK
	public static WebElement dateFilter;

	@FindBy (xpath="//a[contains(text(),' Last month')]")//CLICK
	public static WebElement listDateFilter;

	@FindBy (xpath="//input[@id='id_25']")//SENDKEYS(Member payment)
	public static WebElement describtionFilter;
	
	@FindBy (xpath="(//div[@class='w-100 mw-100 text-truncate pr-3'])[2]")
	public static WebElement typeFilter;

	@FindBy (xpath="//*[contains(text(),' Member payments ')]")
	public static WebElement typeFilterSelection;
	@FindBy (xpath="//input[@id='id_27']")//SENDKEYS(12)
	public static WebElement fromAmt;
	
	@FindBy (xpath="(//input[@class='form-control text-right ng-pristine ng-valid ng-touched'])[1]")//SENDKEYS(12)
	public static WebElement toAmt;
	
	@FindBy (xpath="//div[@class='w-100 mw-100 text-truncate pr-3']")
	public static WebElement period;



	

//	@FindBy (xpath="(//input[@id='id_79'])
//	public static WebElement AmountForPay;///////:{sendKeys:12}//

	@FindBy (xpath="//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary']")//CLICK
	public static WebElement NextButton;//////////////////////

	@FindBy (xpath="//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary']")
	public static WebElement ConfirmButton;////////////////////
	
	//print payment details
	

}
