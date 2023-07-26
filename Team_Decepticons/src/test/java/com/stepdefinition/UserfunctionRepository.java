
package com.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserfunctionRepository {
	// Update your profile

	 

	@FindBy(xpath = "//input[@placeholder='User']") // enter username

	public static WebElement username;

	@FindBy(xpath = "//input[@placeholder='Password']") // enter password

	public static WebElement userpassword;

	@FindBy(xpath = "//button[contains(@class,'btn d-flex')]") // click on Submit

	public static WebElement Submit;

	@FindBy(xpath = "//a[@id=\"profile-link\"]") // click profile//xpath

	 

	public static WebElement profile;

	@FindBy(xpath = "//div[text()='Edit']") // click on Edit

	public static WebElement edit;

	@FindBy(xpath = "//input[@id='address_region_7762070814175354687']") // click on address Region

	public static WebElement addressRegion;

	@FindBy(xpath = "(//input[contains(@class,'form-control w-100')])[2]") // click on email

	public static WebElement email;

	@FindBy(xpath = "//input[@id='address_city_7762070814175354687']") // click on city

	public static WebElement city;

	@FindBy(xpath = "//span[text()='Save']") // Click Save

	 

	public static WebElement save;

	 

	// Add Multiple address

	 

	@FindBy(xpath = "//div[text()='Edit']") // click on Edit

	public static WebElement edit1;

	@FindBy(xpath = "//span[text()='Add address']") // click on Add address

	public static WebElement Addaddress;

	@FindBy(id = "address_name_1") // click on Add address name

	public static WebElement AddaddressName;

	@FindBy(xpath = "//input[@fdprocessedid='41p7tk']") // click on Add address line1

	public static WebElement Addaddressline1;

	 

	@FindBy(xpath = "//input[@id='address_city_1']") // Add city

	public static WebElement city1;

	@FindBy(xpath = "#address_zip_1") // Add Zipcode

	public static WebElement Zipcode;

	 

	// Add Mutiple Phones

	 

	@FindBy(xpath = "//div[text()='Edit']") // click on Edit

	public static WebElement edit2;

	@FindBy(xpath = "//span[text()='Add mobile phone']") // click on Add Mobile Phones

	public static WebElement AddMobilePhones;

	@FindBy(xpath = "//input[@id='phone_name_2']") // click on Mobile Phone name

	public static WebElement MobilePhonename;

	@FindBy(id = "phone_number_2") // click on Mobile Phone number

	public static WebElement MobilePhonenumber;

	 

	@FindBy(xpath = "//span[text()='Add mobile phone']") // click on Add Mobile Phones

	public static WebElement AddMobilePhones1;

	@FindBy(xpath = "//input[@fdprocessedid='umsqbr']") // click on Add Mobile name1

	public static WebElement AddMobilename1;

	@FindBy(xpath = "") // click on Add Mobile number

	public static WebElement AddMobilenumber;

	@FindBy(xpath = "//span[text()='Save']") // Click Save
	public static WebElement save1;
	 

	//4



	@FindBy(xpath = "//a[@id=\"profile-link\"]") // click profile

	public static WebElement profile1;

	@FindBy(xpath = "//div[text()='Password']") // click password

	public static WebElement password1;

	@FindBy(xpath = "//span[text()='Change']") // click change button

	public static WebElement changebutton;

	@FindBy(xpath = "(//input[@type='password'])[1]") // enter old password

	public static WebElement oldpassword;

	@FindBy(xpath = "(//input[@type='password'])[2]") // enter new password

	public static WebElement newpassword;

	@FindBy(xpath = "(//input[@type='password'])[3]") // enter new pasword again for confirmation

	public static WebElement againnewpassword;

	@FindBy(xpath = "//span[text()='Submit']") // click submit button

	public static WebElement submit2;
//5th one

	@FindBy(xpath = "//a[@id=\"profile-link\"]") // click profile

	public static WebElement profile3;

	@FindBy(xpath = "//div[text()='Notifications']") // click notification

	public static WebElement notification;

	@FindBy(xpath = "//*[@class=\"custom-control-label\"]") // click the unread checkbox

	public static WebElement checkbox;
//	6th one

	@FindBy(xpath = "//a[@id=\"profile-link\"]") // click profile

	public static WebElement profile4;

	@FindBy(xpath = "//div[text()='Contacts']") // click the contacts

	public static WebElement contacts;

	@FindBy(xpath = "//*[@class=\"ci ci-grid-list\"]") // Choose the list view

	public static WebElement listview;
}