package TESTNGPROGRAMS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(TESTNGPROGRAMS.MyListner.class)//To integrate Listeners inside the test case 
public class OrangeHRMTest {
 WebDriver driver;
	@Test(priority=1)
   void setup() 
  {
	   WebDriver driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   driver.manage().window().maximize();
  }
 
 @Test(priority=3,dependsOnMethods = {"getappurl"} )
  void getTitle()
  {
	  driver.getTitle();
	  Assert.assertEquals(driver.getTitle(), "OrangeHRM");
  }
 @Test(priority=2)
  void getappurl()
  {
	  Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
  }
}

