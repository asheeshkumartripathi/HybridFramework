package com.qshore.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	//Page Factory- OR
	
	
	@FindBy(xpath="//h5[contains(text(),'Dashboard')]") WebElement Dashboardlogo;
	@FindBy(xpath="//a[@class='sidebar-toggle']") WebElement menubutton;
	@FindBy(xpath="//span[@id=\"lblUserName\"]") WebElement AdminButton;
	@FindBy(xpath="//a[@href=\"../DashBoard.aspx\"]") WebElement DashboardTab;
	@FindBy(xpath="") WebElement Purchase;
	@FindBy(xpath="") WebElement SaleVehicle;
	@FindBy(xpath="") WebElement AddVendor;
	@FindBy(xpath="") WebElement VendorList;
	@FindBy(xpath="") WebElement Accounts;
	@FindBy(xpath="") WebElement ClientRequest;
	@FindBy(xpath="") WebElement Stocks;
	@FindBy(xpath="") WebElement AllSales;
	@FindBy(xpath="") WebElement Allshops;
	@FindBy(xpath="") WebElement Shoplist;
	
	
	

}
