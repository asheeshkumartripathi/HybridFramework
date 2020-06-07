package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qshore.pages.HomePage;
import com.qshore.pages.LoginPage;

import BasePackage.BaseClass;

public class LoginPageTest extends BaseClass {
	LoginPage loginpagetestcase;
	HomePage homepageobject;

	public LoginPageTest() {
		super();
	}
	@BeforeMethod
	public void setup() {
		initilization();
		loginpagetestcase= new LoginPage();
	}
	
	@Test(priority=1)
	public void validatelogo() {
		String logo=loginpagetestcase.validatelogo();
		Assert.assertEquals(logo, "	Qshore Motors");
	}
	
	@Test(priority=2)
	public void login() {
		homepageobject=loginpagetestcase.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
