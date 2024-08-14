package HandlingMethodsAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionVsActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		WebElement button = driver.findElement(By.xpath("//div[@id='context-menu-layer']"));
		Actions act = new Actions(driver);
		act.contextClick(button).build();
		Action myaction = act.contextClick(button).build();
		myaction.perform();
		
		driver.findElement(By.xpath("//span[normalize-space()='\"Copy\"']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();

	}

}
