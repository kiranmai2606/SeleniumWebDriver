package HandlingMethodsAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("welcome");
		Actions act=new Actions(driver);
		//CTrl+A--->selects the text
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL);
		//ctrl+C-->selects the copy the text in to clip board 
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL);
		//Shift to second tab 
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		//CTRL+V
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL);
		

	}

}
