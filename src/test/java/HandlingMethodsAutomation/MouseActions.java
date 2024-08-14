package HandlingMethodsAutomation;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MouseActions {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		WebElement Desktopmenu=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement mac =driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		Actions act=new Actions(driver);
		//mouse hover action 
		//Approach 1:act.moveToElement(Desktopmenu).moveToElement(mac).click().build().perform();//calling Build is option , can directly use perform 
		act.moveToElement(Desktopmenu).moveToElement(mac).perform();
		
		
		

	}

}
//