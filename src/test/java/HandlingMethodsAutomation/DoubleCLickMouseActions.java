package HandlingMethodsAutomation;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleCLickMouseActions {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		WebElement Box1=driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement Box2=driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement copy=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		Box1.clear();
		Box1.sendKeys("Welcome");
		Actions act =new Actions(driver);
		act.doubleClick(copy).perform();
		
	//validation 
	  String text=Box2.getAttribute("value");
	  System.out.println("captured value is:"+text);
	  if(text.equals("Welcome"))
	  {
		  System.out.println("Text copied..");
	  }
	  else 
	  {
		  System.out.println("Text Not cpied properly");
	  }
	  
		
	}

}

