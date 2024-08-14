/*Test case1
 * 1.Launch chrome browser
 * 2.open url https://demo.opencart.com
 * 3.Validate page title should be "your store"
 * 4.close browser */

package SeleniumWebdriverAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class FirstSeleniumAutomationProgram {

	public static void main(String[] args) 
	{
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver(); //Launch chrome browser
	      driver.get("https://demo.opencart.com/");//open url https://demo.opencart.com
	      String page_title =driver.getTitle();
	      if(page_title.equals("Your Store"))
	      {
	    	  System.out.println("Test case is passed");
	      }
	      else 
	      {
	    	  System.out.println("Test case is failed ");
	      }
	    	  
	      driver.close();
	      driver.quit();//to close the browser

	}

}
