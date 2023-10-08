package com.hrms.Pages;

import org.testng.Reporter;

import com.hrms.Utility.BaseClass;

public class VerifyPage extends BaseClass {

	public static void verifyTittle(String tittle) {

		if (driver.getTitle().equals(tittle)) {

			Reporter.log("Tittle is Matched");

		} else {

			Reporter.log("Tittle is not Matched");
			Reporter.log(driver.getTitle());

		}

	}

}
