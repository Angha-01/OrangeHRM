package com.pomclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class LoginPagePom extends BaseClass {
	
	public LoginPagePom() {
		PageFactory.initElements(driver,this); 		//getWebDriver()
	}
	@FindBy(xpath="//p[text()='Username : Admin']")
	private WebElement usernameText;
	
	@FindBy(xpath="//p[text()='Password : admin123']")
	private WebElement passwordText;
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement usernameinput;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordinput;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitbutton;
	
	@FindBy(xpath="//div[@class='orangehrm-login-forgot']//child::p")
	private WebElement forgotpassword;
	
	@FindBy(xpath = "//p[text()='Invalid credentials']")
	private WebElement Invalid_credentials;
	
	public String getusername() {
		String username=usernameText.getText();
		System.out.println(username);
		return username.substring(username.indexOf('A'));
	}
	public String getpassword() {
		String password=passwordText.getText();
		System.out.println(password);
		return password.substring(password.lastIndexOf('a'));
	}
	public String getinvalidmsg() {
		String invalidmsg=Invalid_credentials.getText();
		return invalidmsg;
	}
	
	public void login(String username,String password) throws InterruptedException {
		usernameinput.sendKeys(username);
		passwordinput.sendKeys(password);
		System.out.println("Enter the username &password");
		submitbutton.click();
		Thread.sleep(5000);
		
	}
}
