//@DataProvider --> Data Driven Testing 
//using xml file -->Parallel Testing 

package TESTNGPROGRAMS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest {
  WebDriver driver;
  @BeforeClass
   void setup()
  {
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	    
  }
  @Test(dataProvider="dp")//As we are  reading the data inputs  we need to mention in @Test 
  void testLogin(String email,String Password) throws InterruptedException
  {
	  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	  driver.manage().window().maximize();	
	  driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
	  driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(Password);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@value='Login']")).click();
	  
	  boolean status = driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
	  if(status==true)
	  {
		  driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
		  Assert.assertTrue(true);
	  }
	  else
	  {
		  Assert.fail();
	  }
	  
  }
  @AfterClass
  void teardown()
  {
	driver.quit();
  }
   @DataProvider(name="dp",indices= {0,1})//name attribute should be mandatory for the data provider 
   //indices will be used to exceute a particular set of data based on index 
   Object[][]  LoginData()
   {
	  Object  Data[][]={ 
			  			{"abc@gmail.com","test123"}, 
			  			{"xyz@gmail.com","test102"},
			  			{"john@gmail.com","test@123"},
			  			{"pavanol123@gmail.com","test@123"},
			  			
	  				   };
	  return Data;
   }
  
}
