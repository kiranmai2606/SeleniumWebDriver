package SeleniumWebdriverAutomation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ConditionalWebDriverMethods {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		WebElement Register=driver.findElement(By.xpath("//a[@class='ico-register']"));
		Register.click();
		isDisplayed() conditional method
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("Display status og logo:"+logo.isDisplayed());
		isEnabled()
		WebElement Firstname=driver.findElement(By.xpath("//input[@id='FirstName']"));
		System.out.println("Is Firstname enabled:"+Firstname.isEnabled());
		isSelected()
		WebElement Male =driver.findElement(By.className("forcheckbox"));
		Male.click();
		System.out.println("Is male Radio button enabled  to select :"+Male.isSelected());
		WebElement Female =driver.findElement(By.xpath("//label[@for='gender-female']"));
		System.out.println("Is male Radio button enabled  to select :"+Male.isSelected());
		System.out.println("Is Female Radio button enabled  to select :"+Female.isSelected());
		Female.click();
		System.out.println(Male.isSelected());
		System.out.println(Female.isSelected());
		Female.click();
		System.out.println("Is male radio button selectedafter click  :"+Male.isSelected());
		System.out.println("Is Female radio button selectedafter click  :"+Female.isSelected());
		WebElement NewsLetter =driver.findElement(By.xpath("//label[@for='Newsletter']"));
		System.out.println("News Letter Is checked by default"+NewsLetter.isSelected());

		
		////span[@class='male']
		////label[@for='gender-female']
	}

}
