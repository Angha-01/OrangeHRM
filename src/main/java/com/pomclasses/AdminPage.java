package com.pomclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage {
	
	@FindBy(xpath = "//span[text()='User Management ']")
	private WebElement user_managment;
	
	@FindBy(xpath = "//span[contains(text(),'Job ')]")
	private WebElement job;
	
	@FindBy(xpath = "//span[contains(text(),'Organization ' )]")
	private WebElement organization;
	
	@FindBy(xpath = "//span[contains(text(),'Qualifications ' )]")
	private WebElement qualifications;
	
	@FindBy(xpath = "//a[text()='Nationalities']")
	private WebElement Nationalities;
	
	@FindBy(xpath = "//a[text()='Corporate Branding']")
	private WebElement Corporate_Branding;
	
	@FindBy(xpath = "//span[contains(text(),'Configuration ')]")
	private WebElement Configuration;
	
	@FindBy(xpath = "//button[@class='oxd-icon-button']")
	private WebElement HelpLink;	
	
//Languages Page
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement Name_checkbox;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement Arabic_checkbox;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	private WebElement Chinese_checkbox;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[4]")
	private WebElement English_checkbox;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[5]")
	private WebElement French_checkbox;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[6]")
	private WebElement Russian_checkbox;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[7]")
	private WebElement Spanish_checkbox;
//Delete button of Arabic
	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[1]")
	private WebElement Arabic_delete;
	//Edit button of Arabic
	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[1]")
	private WebElement Arabic_Edit;
	//After edit form textbox,buttons of Arabic
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement Arabic_Edit_testbox;
	
	@FindBy(xpath = "//button[text()=' Cancel ']")
	private WebElement Cancle_button_Arabic;
	
	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement Save_button_Arabic;
	
//Delete button of Chinese
		@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[1]")
		private WebElement Chinese_delete;
		//Edit button of Chinese
		@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[1]")
		private WebElement Chinese_Edit;
		//After edit form textbox,buttons of Chinese
		@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
		private WebElement Chinese_Edit_testbox;
		
		@FindBy(xpath = "//button[text()=' Cancel ']")
		private WebElement Cancle_button_Chinese;
		
		@FindBy(xpath = "//button[text()=' Save ']")
		private WebElement Save_button_Chinese;
		
//Delete button of English
		@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[1]")
				private WebElement English_delete;
				//Edit button of English
				@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[1]")
				private WebElement English_Edit;
				//After edit form textbox,buttons of English
				@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
				private WebElement English_Edit_testbox;
				
				@FindBy(xpath = "//button[text()=' Cancel ']")
				private WebElement Cancle_button_English;
				
				@FindBy(xpath = "//button[text()=' Save ']")
				private WebElement Save_button_English;
	
//Delete button of French
				@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[1]")
				private WebElement French_delete;
				//Edit button of French
				@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[1]")
				private WebElement French_Edit;
				//After edit form textbox,buttons of French
				@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
				private WebElement French_Edit_testbox;
				
				@FindBy(xpath = "//button[text()=' Cancel ']")
				private WebElement Cancle_button_French;
				
				@FindBy(xpath = "//button[text()=' Save ']")
				private WebElement Save_button_French;
	
		//Delete button of Russian
				@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[1]")
				private WebElement Russian_delete;
				//Edit button of Russian
				@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[1]")
				private WebElement Russian_Edit;
				//After edit form textbox,buttons of Russian
				@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
				private WebElement Russian_Edit_testbox;
				
				@FindBy(xpath = "//button[text()=' Cancel ']")
				private WebElement Cancle_button_Russian;
				
				@FindBy(xpath = "//button[text()=' Save ']")
				private WebElement Save_button_Russian;
				
		//Delete button of Spanish
				@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[1]")
				private WebElement Spanish_delete;
				//Edit button of Spanish
				@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[1]")
				private WebElement Spanish_Edit;
				//After edit form textbox,buttons of Spanish
				@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
				private WebElement Spanish_Edit_testbox;
				
				@FindBy(xpath = "//button[text()=' Cancel ']")
				private WebElement Cancle_button_Spanish;
				
				@FindBy(xpath = "//button[text()=' Save ']")
				private WebElement Save_button_Spanish;
	
				@FindBy(xpath = "//button[text()=' Add ']")
				private WebElement ADD_button;
				
		//Memberships page
				@FindBy(xpath = "(//input[@type='checkbox'])[1]")
				private WebElement Membership_checkbox;
				
				@FindBy(xpath = "(//input[@type='checkbox'])[2]")
				private WebElement ACCA_checkbox;
				
				@FindBy(xpath = "(//input[@type='checkbox'])[3]")
				private WebElement British_Computer_Society_BCS_checkbox;
				
				@FindBy(xpath = "(//input[@type='checkbox'])[4]")
				private WebElement Chartered_Institute_of_Marketing_CIM_checkbox;
				
				@FindBy(xpath = "(//input[@type='checkbox'])[5]")
				private WebElement CIMA_checkbox;	
	//Delete button of ACCA
				@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[1]")
				private WebElement ACCA_delete;
				//Edit button of Spanish 
				@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[1]")
				private WebElement ACCA_Edit;
				//After edit form textbox,buttons of Spanish
				@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
				private WebElement ACCA_Edit_testbox;
				
				@FindBy(xpath = "//button[text()=' Cancel ']")
				private WebElement Cancle_button_ACCA;
				
				@FindBy(xpath = "//button[text()=' Save ']")
				private WebElement Save_button_ACCA;
	
				@FindBy(xpath = "//button[text()=' Add ']")
				private WebElement ADD_button_ACCA;
		//Same x-path of British computer society(BCS),CIM & CIMA...............
				//Nationalities page x-path
				@FindBy(xpath = "(//input[@type='checkbox'])[1]")
				private WebElement	Nationality_checkbox;
				
				@FindBy(xpath = "(//input[@type='checkbox'])[2]")
				private WebElement	Afghan_checkbox;
				
				@FindBy(xpath = "(//input[@type='checkbox'])[3]")
				private WebElement	Albanian_checkbox;
				
				@FindBy(xpath = "(//input[@type='checkbox'])[4]")
				private WebElement	Algerian_checkbox;
				
				@FindBy(xpath = "(//input[@type='checkbox'])[5]")
				private WebElement	American_checkbox;
				
				@FindBy(xpath = "(//input[@type='checkbox'])[6]")
				private WebElement	Andorran_checkbox;
				
				@FindBy(xpath = "(//input[@type='checkbox'])[7]")
				private WebElement	Angolan_checkbox;
				
				@FindBy(xpath = "(//input[@type='checkbox'])[8]")
				private WebElement	Antiguans_checkbox;
				
				@FindBy(xpath = "(//input[@type='checkbox'])[9]")
				private WebElement	Argentinean_checkbox;
				
				@FindBy(xpath = "(//input[@type='checkbox'])[10]")
				private WebElement Armenian_checkbox;
				
				@FindBy(xpath = "(//input[@type='checkbox'])[11]")
				private WebElement Australian_checkbox;
				
				@FindBy(xpath = "(//input[@type='checkbox'])[12]")
				private WebElement Austrian_checkbox;
				
				@FindBy(xpath = "(//input[@type='checkbox'])[13]")
				private WebElement Azerbaijani_checkbox;
		//Same x-path of Edit and delete button as above
				@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[1]")
				private WebElement Afghan_delete;
				//Edit button of Afghan 
				@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[1]")
				private WebElement Afghan_Edit;
				//After edit form textbox,buttons of Afghan
				@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
				private WebElement Afghan_Edit_testbox;
				
				@FindBy(xpath = "//button[text()=' Cancel ']")
				private WebElement Cancle_button_Afghan;
				
				@FindBy(xpath = "//button[text()=' Save ']")
				private WebElement Save_button_Afghan;
	
				@FindBy(xpath = "//button[text()=' Add ']")
				private WebElement ADD_button_Afghan;
		//Same x-path to all Natinality field options only change index no.
				
//Corporate Branding Page.......
				@FindBy(xpath = "(//div[@tabindex='0'])[1]")
				private WebElement Primary_Color;
				
				@FindBy(xpath = "(//div[@tabindex='0'])[2]")
				private WebElement Secondary_Color;
				
				@FindBy(xpath = "(//div[@tabindex='0'])[3]")
				private WebElement Primary_Font_Color;
				
				@FindBy(xpath = "(//div[@tabindex='0'])[4]")
				private WebElement Secondary_Font_Color;
				
				@FindBy(xpath = "(//div[@tabindex='0'])[5]")
				private WebElement Primary_Gradient_Color_1;
				
				@FindBy(xpath = "(//div[@tabindex='0'])[6]")
				private WebElement Primary_Gradient_Color_2;
				
				@FindBy(xpath = "(//div[text()='Browse'])[1]")
				private WebElement Browse_Client_logo;
				
				@FindBy(xpath = "(//div[text()='Browse'])[2]")
				private WebElement Browse_Client_Banner;
				
				@FindBy(xpath = "(//div[text()='Browse'])[3]")
				private WebElement Browse_Login_Banner;
				
				@FindBy(xpath = "//div[@class='oxd-switch-wrapper']")
				private WebElement Social_Media_Images_swich_button;
				
				@FindBy(xpath = "//button[text()=' Reset to Default ']")
				private WebElement  Reset_to_Default;
				
				@FindBy(xpath = "//button[text()=' Preview ']")
				private WebElement  Preview_button;
				
				@FindBy(xpath = "//button[text()=' Publish ']")
				private WebElement  Publish_button;
		//Configuration Page xpath..........
				//Email Configuration page
				@FindBy(xpath ="(//input[@class='oxd-input oxd-input--active'])[2]")
				private WebElement Mail_sent_textbox;
				
				@FindBy(xpath ="//input[@value='smtps']")
				private WebElement SECURE_SMTP_radiobutton;
				
				@FindBy(xpath ="//input[@value='smtp']")
				private WebElement SMTP_radiobutton;
				
				@FindBy(xpath ="//input[@value='sendmail']")
				private WebElement sendmail_radiobutton;
				
				
				
				
				
				
			}
