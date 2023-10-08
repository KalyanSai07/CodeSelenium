package com.hrms.Pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.Utility.BaseClass;

public class LoginPage extends BaseClass{

	static By txt_loginname = By.name("txtUserName");
	static By txt_password  = By.name("txtPassword");
	static By btn_login     = By.name("Submit");
	
	public static void login(String username, String password) {
		driver.findElement(txt_loginname).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
		Reporter.log("Login completed");
		
	}
	
}
