package com.hrms.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class BaseClass {

	public static WebDriver driver;
	
	public static void openAPP() {
    
		driver = new FirefoxDriver();
		
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Reporter.log("Application Opened");
	}
  public static void closeApp() {
	  driver.close();
	  Reporter.log("Application Closed");
  }
	
	
}
