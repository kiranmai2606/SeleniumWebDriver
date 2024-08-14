package POMDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage 
{
	WebDriver driver;
	//constructor
	Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	//Locators
	
	By txt_username_loc	=By.xpath("//input[@placeholder='Username']");
	By txt_Password_loc=By.xpath("//input[@placeholder='Password']");
	By Login_loc=By.xpath("//button[normalize-space()='Login']");
	//Actions 
	
}
