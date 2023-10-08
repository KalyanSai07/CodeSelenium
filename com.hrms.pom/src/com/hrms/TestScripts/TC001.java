package com.hrms.TestScripts;

import org.testng.annotations.Test;

import com.hrms.Utility.BaseClass;
import com.hrms.Pages.LoginPage;
import com.hrms.Pages.LogoutPage;
import com.hrms.Pages.VerifyPage;
public class TC001 {
@Test
	public static void tc001() {
		
   BaseClass.openAPP();
   VerifyPage.verifyTittle("HRMS");
   LoginPage.login("nareshit","nareshit");
	VerifyPage.verifyTittle("Orange");
	LogoutPage.logout();
	BaseClass.closeApp();
	
	}
	
}
