package com.pomclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {
	@FindBy(xpath="//input[@class='oxd-input oxd-input--active']")
	private WebElement searchInput;
	
	@FindBy(xpath = "//button[@class='oxd-icon-button oxd-main-menu-button']")
	private WebElement mainmenubutton;				//< icon
	
	@FindBy(xpath="//span[text()='Admin']")
	private WebElement Admin;
	
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement PIM;
	
	@FindBy(xpath="//span[text()='Leave']")
	private WebElement Leave;
	
	@FindBy(xpath="//span[text()='Time']")
	private WebElement Time;
	
	@FindBy(xpath="//span[text()='Recruitment']")
	private WebElement Recruitment;
	
	@FindBy(xpath="//span[text()='My Info']")
	private WebElement My_info;
	
	@FindBy(xpath="//span[text()='Performance']")
	private WebElement Performance;
	
	@FindBy(xpath="//span[text()='Dashboard']")
	private WebElement Dashboard;
	
	@FindBy(xpath="//span[text()='Directory']")
	private WebElement Directory;
	
	@FindBy(xpath="//span[text()='Maintenance']")
	private WebElement Maintenance;
	
	@FindBy(xpath="//span[text()='Claim']")
	private WebElement Claim;
	
	@FindBy(xpath="//span[text()='Buzz']")
	private WebElement Buzz;
	
	@FindBy(xpath = "//p[text()='manda user']")
	private WebElement manda_user_dropdown;
	
	@FindBy(xpath = "//ul[@class='oxd-dropdown-menu']/li")
	private WebElement manda_user_list;
	
	@FindBy(xpath = "//button[@class='oxd-icon-button']")
	private WebElement HelpLink;					//? icon for help
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-stopwatch']")		
	private WebElement stopwatch;					//Time at Work stopwatch icon link 
	
	//My Actions......................
	@FindBy(xpath = "//p[text()='(1) Pending Self Review']")
	private WebElement pending_self_review;
	
	@FindBy(xpath = "//p[text()='(1) Candidate to Interview']")
	private WebElement candidate_to_interview;
	//Quick Launch.................
	@FindBy(xpath = "//button[@title='Assign Leave']")	
	private WebElement assign_leave;
	
	@FindBy(xpath = "//button[@title='Leave List']")
	private WebElement leave_list;
	
	@FindBy(xpath = "//button[@title='Timesheets']")
	private WebElement Timesheets;
	
	@FindBy(xpath = "//button[@title='Apply Leave']")
	private WebElement Apply_Leave;
	
	@FindBy(xpath = "//button[@title='My Leave']")
	private WebElement My_Leave;
	
	@FindBy(xpath = "//button[@title='My Timesheet']")
	private WebElement My_Timesheet;
	//Buzz Latest Posts
	@FindBy(xpath = "//p[text()='2024-29-05 02:32 PM']")
	private WebElement  Kailas_user1;
	
	@FindBy(xpath = "//p[text()='2020-08-10 09:08 AM']")
	private WebElement  Kailas_user2;
	
	@FindBy(xpath = "//p[text()='Sania  Shaheen']")
	private WebElement  Sania_Shaheen;
	
	@FindBy(xpath = "//p[text()='Rebecca  Harmony']")
	private WebElement  Rebecca_Harmony;
	
	@FindBy(xpath = "//p[text()='Russel  Hamilton']")
	private WebElement  Russel_Hamilton;
	//Employees on Leave Today
	@FindBy(xpath = "//div[@class='orangehrm-dashboard-widget-header']/i")
	private WebElement setting_icon;
	
	//Employee Distribution by Sub Unit
	@FindBy(xpath = "//span[text()='Human Resources']")
	private WebElement Human_Resources;
	
	@FindBy(xpath = "(//span[text()='Unassigned'])[1]")
	private WebElement Unassigned;
	
	//Employee Distribution by Location
	@FindBy(xpath = "//span[text()='Texas R&D']")
	private WebElement Texas_RD;
	
	@FindBy(xpath = "(//span[text()='Unassigned'])[2]")
	private WebElement Unassigned2;
	//Footer section
	@FindBy(xpath = "//a[text()='OrangeHRM, Inc']")
	private WebElement OrangeHRM_Link;
	
	
	
	
	
	
	
}
