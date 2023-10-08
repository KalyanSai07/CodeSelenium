package testngexamples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_AddEmp {

@BeforeClass
public void login() {
	
	System.out.println("Login completed");
}
@AfterClass
	public void logout() {
		System.out.println("Logout completed");
		
	}
@Test
public void addemp() {
	
	System.out.println("Added new employee");
}
@Test
public void deleteemp() {
	
	System.out.println("Deleted employee");
}
}
