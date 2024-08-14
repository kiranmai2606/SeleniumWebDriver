package TESTNGPROGRAMS;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class MyListner implements ITestListener {
 
	 public  void onTestStart(ITestResult result) 
	 {
		   System.out.println("Test Execution is started");
	 }
	 public  void onTestSuccess(ITestResult result) 
	 {
		 System.out.println("Test Passed");  
     }
	  public  void onTestFailure(ITestResult result) 
	  {
		  System.out.println("Test Failed"); 
	  }
	  public  void onTestSkipped(ITestResult result) 
	  {
		  System.out.println("Test Skipped");   
	  }
	  public  void onStart(ITestContext context) 
	  {
		 System.out.println("Test starts"); 
	  }

	   public void onFinish(ITestContext context) {
		   System.out.println("Test Finished"); 
		  }
}
