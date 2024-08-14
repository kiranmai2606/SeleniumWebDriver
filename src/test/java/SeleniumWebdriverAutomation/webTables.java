package SeleniumWebdriverAutomation;
import java.util.List;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webTables {

	public static void main(String[] args) 
	{
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://testautomationpractice.blogspot.com");
		Driver.manage().window().maximize();
		//Find total no.of rows in a table 
		Driver.findElement(By.xpath("//table[@name='BookTable']//tr"));
		System.out.println("Numberof rows"+rows);

	}

}
