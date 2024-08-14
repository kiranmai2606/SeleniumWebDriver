package SeleniumWebdriverAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FourthWebDriverMethods {

	public static void main(String[] args) 
	{
	 WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		System.out.println(driver.getTitle());
		//driver.getCurrentUrl();
		//driver.getPageSource();
		driver.getWindowHandle();
		driver.getWindowHandles();
		

	}

}
