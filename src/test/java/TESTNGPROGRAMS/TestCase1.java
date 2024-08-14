package TESTNGPROGRAMS;

import org.testng.annotations.Test;

public class TestCase1 
{
	@Test(priority=1)
	void openapp()
	{
		System.out.println("openingapplication");
	
	}
	@Test(priority=2)
	void Login()
	{

		System.out.println("Login to application");
	
	}
	@Test(priority=3)
	void Logout()
	{
		System.out.println("Logout application");
	}
}
