package testngexamples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeClass_TestNG {
@BeforeClass
	public void login() {
		
		System.out.println("Login completed");
	}
	
@AfterClass	
	public void logout() {
		
		System.out.println("Logout completed");
	}
	@Test(priority=1)
	public void addemp() {
		
		System.out.println("Add Employee");
	}
	@Test(priority=2)
	public void deleteemp() {
		
		System.out.println("Delete Employee");
	}
}
