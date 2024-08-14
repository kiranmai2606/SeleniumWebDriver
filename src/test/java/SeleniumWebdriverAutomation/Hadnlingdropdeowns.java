package SeleniumWebdriverAutomation;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Hadnlingdropdeowns {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");	
		driver.manage().window().maximize();
		//Select drop down option
		WebElement drpcountryele=driver.findElement(By.xpath("//select[@id='country']"));
		Select drpcountry =new Select(drpcountryele);
		drpcountry.selectByVisibleText("France");
		drpcountry.selectByValue("canada");
		drpcountry.selectByIndex(2);
		//capture the options from drop down :
		List<WebElement>options=drpcountry.getOptions();
		System.out.println("Number of options in a drop down:"+options.size());
		//printing options 
		for (int i=0; i<options.size();i++);
		{
			System.out.println(options.get(i).getText());
			
		}
				
		//enhanced for loop:
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
		
		

	}

}
