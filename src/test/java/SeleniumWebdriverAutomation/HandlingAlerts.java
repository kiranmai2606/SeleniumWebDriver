package SeleniumWebdriverAutomation;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.manage().window().maximize();
		/*driver.findElement(By.xpath("//input[@id='alertexamples']")).click();
		Thread.sleep(5000);
		
		//To handle alert with Ok option only 
		 Alert alertmsg=  driver.switchTo().alert();
		 System.out.println(alertmsg.getText());
		 alertmsg.accept();
		 

		 //To handle  confirmation alert  b/w Ok & cancel 
		 driver.findElement(By.xpath(("//input[@id='confirmexample']"))).click();
		 Thread.sleep(5000);	
		 driver.switchTo().alert().accept();
		 driver.switchTo().alert().dismiss();*/
		 
		 //prompt Alert 
		 
		driver.findElement(By.xpath("//input[@id='promptexample']")).click();
		Alert myalert=driver.switchTo().alert();
		Thread.sleep(5000);
		myalert.sendKeys("welcome");
		driver.switchTo().alert().accept();
		
		 
		
		 
		 
		
		
		
	}

}
