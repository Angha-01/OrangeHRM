package com.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.pomclasses.LoginPagePom;
public class LoginPageTest extends BaseClass {
	
	@BeforeClass
	public void setup() {
		getWebDriver();
	}
	@AfterClass
	public void teardown() {
		driver.close();
	}
	
	@Test
	public void pageUrl() {
		
		String pageurl=driver.getCurrentUrl();			//getWebDriver()
		if(pageurl.equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));
		{
			System.out.println("We are in correct page: Test pass");
		}
		
	}
	@Test
	public void loginTest() throws InterruptedException {
		LoginPagePom loginpagepom=new LoginPagePom();
		loginpagepom.login(loginpagepom.getusername(),loginpagepom.getpassword());
		System.out.println("Login sucessful");
	}
	@Test
	public void loginInvalidTest() throws InterruptedException {
		LoginPagePom loginpagepom=new LoginPagePom();
		loginpagepom.login(loginpagepom.getusername(),"123admin");
		System.out.println(loginpagepom.getinvalidmsg());
		
	}
	
}