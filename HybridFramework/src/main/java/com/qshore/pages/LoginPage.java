package com.qshore.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class LoginPage extends BaseClass {


	//Page Factory- OR

	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder1$txtUserId']") WebElement userid;
	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder1$txtPassword']") WebElement password;
	@FindBy(xpath="//input[@id=\"ContentPlaceHolder1_btnLogin\"]") WebElement loginbutton;
	@FindBy(xpath="//img[@src=\"Images/logo.png\"]") WebElement logo;


	//Initialization 

	public LoginPage() {
		// PageFactory.initElements(driver, LoginPage.class);
		PageFactory.initElements(driver, this);
	}

	public String validatelogo() {
		return driver.getTitle();			
	}
	public HomePage login(String un, String pwd) {
		userid.sendKeys(un);
		password.sendKeys(pwd);
		loginbutton.click();
		return new HomePage();
	}

}
