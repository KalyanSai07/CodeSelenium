package com.hrms.Pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.Utility.BaseClass;

public class LogoutPage extends BaseClass {

	static By Link_logout = By.linkText("Logout");
	
	public static void logout() {
		
		driver.findElement(Link_logout).click();
		Reporter.log("Logout Completed");
	}
	
}
