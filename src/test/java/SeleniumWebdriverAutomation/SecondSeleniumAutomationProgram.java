package SeleniumWebdriverAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondSeleniumAutomationProgram {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		 driver.get("https://demo.opencart.com/");
		 driver.manage().window().maximize();
		 driver.findElements(By.name("search"));//Locate web elements by using name attribute.[
		 boolean islogodisplayed =driver.findElement(By.id("logo")).isDisplayed();//Locate webelements by id 
		 System.out.println(islogodisplayed);
		 //driver.findElement(By.linkText("Tablets")).click();//Locate element by linktext
		 //driver.findElement(By.partialLinkText("Table")).click();//Locate element by partial link text (not preferable most of the times)
		 List<WebElement> headerLinks=driver.findElements(By.className("list-inline-item"));//Locate element by class name
		 System.out.println("Total no .of Header links:"+headerLinks.size());
		 List<WebElement> Links=driver.findElements(By.tagName("a"));//Locate element by tag name 
		 System.out.println("Total no .of links:"+Links.size());
		 List<WebElement> Images= driver.findElements(By.tagName("img"));
		 System.out.println("Total no.of Images:"+Images.size());
	}
	

}
