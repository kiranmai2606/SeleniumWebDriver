package SeleniumWebdriverAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdSeleniumAutomationProgram {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com");//https://demo.nopcommerce.com/
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");//css selector tag#id
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("mobile");//css selector tag.class.
		//driver.findElement(By.cssSelector("button.button-1")).click();
		//driver.findElement(By.cssSelector("input['placeholder=Search store']")).sendKeys("T-shirts");//css select tag[attribute="value"]
		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("mobile");// x path with single attribute.
		
		

	}
	
}
