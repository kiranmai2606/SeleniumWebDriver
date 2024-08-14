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

public class DyanamicwebTablepagination {

	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/admin/index.php");
		
	
		WebElement UserName=driver.findElement(By.xpath("//input[@id='input-username']"));
		UserName.clear();
		UserName.sendKeys("demo");
		WebElement Password=driver.findElement(By.xpath("//input[@id='input-password']"));
		Password.clear();
		Password.sendKeys("demo");
		WebElement Login=driver.findElement(By.xpath("//button[@type='submit']"));
		driver.findElement(By.xpath("//a[@class='parent']")).click();//clikc on customers main menu 
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();//customers sub menu
		WebElement Pagination =driver.findElement(( By.xpath("//div[@class='col-sm-6 text-end']")));
		String value=Pagination.getText();
		
		
		
		
		
			
		
		
		
		
		
		

	}

}
