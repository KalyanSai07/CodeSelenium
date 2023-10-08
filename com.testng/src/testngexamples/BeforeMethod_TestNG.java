package testngexamples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethod_TestNG {

	@BeforeMethod
	public void login() {

		System.out.println("Login completed");
	}

	@AfterMethod
	public void logout() {

		System.out.println("Logout completed");
	}

	@Test(priority = 1)
	public void addemp() {

		System.out.println("Add Employee");
	}

	@Test(priority = 2)
	public void deleteemp() {

		System.out.println("Delete Employee");
	}
}
