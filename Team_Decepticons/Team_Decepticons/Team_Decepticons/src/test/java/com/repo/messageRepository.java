package com.repo;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class messageRepository {
	@FindBy (xpath="//a[@id='login-link']")
	public static WebElement login;
	
	@FindBy (xpath="//input[@type='text']")
	public static WebElement username;
	
	@FindBy (xpath="//input[@type='password']")
	public static WebElement password;
	
	@FindBy (xpath="(//button[@type='button'])[2]")
	public static WebElement submit;
	
	@FindBy (xpath="//a[@id='messages-link']/icon-with-counter[1]/icon[1]")
	public static WebElement message;
	
	@FindBy (xpath="(//button[@class='btn']//div)[1]")
	public static WebElement newMessage;
	
	@FindBy(xpath="//button[@class='form-control text-left custom-select w-100']")
	public static WebElement sendTo;
	
	@FindBy(xpath="\"//a[text()=' User ']")
	public static WebElement user;
	
	@FindBy(xpath="(//button[@type='button'])[4]")
	public static WebElement toUser;//send keys as a
	
	@FindBy(xpath="//a[text()=' Active Walking ']")
	public static WebElement activeWalking;
	
	@FindBy(xpath="//div[@id=\"dropdown-menu-id_54\"]//a")
	public static WebElement toUserList;
	
	@FindBy(xpath="(//div[@class='d-flex label-value-value']//input)[2]")
	public static WebElement subject;
	
	@FindBy(xpath="//div[@class='editor']")
	public static WebElement content;

	@FindBy(xpath="(//button[@type=\"button\"])[23]")
	public static WebElement sendButton;
	
	//for Administration
	@FindBy(xpath="//a[@class='nav-item active']//div[1]")
	public static WebElement message2;
	
	@FindBy(linkText="Administration")
	public static WebElement administrator;
	
	@FindBy(xpath="(//div[@class='w-100']//button)[2]")
	public static WebElement contentList;//select any one of the content
	
	@FindBy(xpath="//a[text()=' Loan request ']")
	public static WebElement loanRequest;
	
	@FindBy(xpath="//div[@class='d-flex label-value-value']//input")
	public static WebElement adminSub;
	
	
	//inbox
	@FindBy(xpath="//input[@value='inbox']")
	public static WebElement inbox;
	
	@FindBy(xpath="//div[text()=' No results match the search criteria ']")
	public static WebElement inboxVerify;
	//sent button
	@FindBy(xpath="//label[text()=' Sent ']")
	public static WebElement sentButton;
	
	@FindBy(xpath="(//span[text()='Active Walking'])[1]")
	public static WebElement sendVerify;
	
	//trash button
	@FindBy(xpath="//label[text()=' Trash ']")
	public static WebElement trash;
	
	@FindBy(xpath="(//span[text()='Active Walking'])[1]")
	public static WebElement trashVerify;
	
	@FindBy (xpath="//button[@class='form-control text-left custom-select w-100']")
	public static WebElement from;
	
	@FindBy (xpath="//a[contains(text(),'User')]")
	public static WebElement fromOption;
	
	@FindBy(xpath="//a[text()='All']")
	public static WebElement All;
	
	@FindBy (xpath="(//button[@type='button'])[4]")
	public static WebElement user1;
	
	@FindBy(xpath="//a[text()=' Active Walking ']")
	public static WebElement active;
	
	@FindBy (linkText=" Administration ")
	public static WebElement  administration;
	
	@FindBy(xpath="(//span[text()='Keywords']/following::input)[1]")
	public static WebElement keywords;
	
	@FindBy(xpath="//input[@placeholder='Type to search']")
	public static WebElement userName;
	
	
	
}
