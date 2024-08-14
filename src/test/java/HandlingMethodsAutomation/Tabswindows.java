package HandlingMethodsAutomation;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tabswindows {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		WebElement wishlist =driver.findElement(By.xpath("//span[normalize-space()='Wish List (0)']"));
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).click(wishlist).keyUp(Keys.CONTROL).perform();
 
		
		 
		
		
	}

}
