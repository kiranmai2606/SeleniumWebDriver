package TESTNGPROGRAMS;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestExtentReportsDemo implements ITestListener
{
	public ExtentSparkReporter sparkReporter;//UI of the Report
	public ExtentReports extent;//populate common info on the report
	public ExtentTest test;//creating test case entries in the report and update the status of test methods
	
	 public  void onStart(ITestContext context) 
	 {
		  sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myreport.html");
		  
		  sparkReporter.config().setDocumentTitle("Automation Report");
		  sparkReporter.config().setReportName("Test Results");
		  sparkReporter.config().setTheme(Theme.STANDARD);
		  
		    extent= new ExtentReports();
		    extent.attachReporter(sparkReporter);
		    
		    extent.setSystemInfo("ComputerName", "localhost");
		    extent.setSystemInfo("Environment", "QA");
		    extent.setSystemInfo("TesterName", "Kiranmai");
		    extent.setSystemInfo("OS", "Windows10");
		    extent.setSystemInfo("Browser Name", "Chrome");
		    
	 }

   
public  void onTestSuccess(ITestResult result) 
{
	test=extent.createTest(result.getName());
	test.log(Status.PASS,"Test case PASSED is : "+result.getName());
	 
}
 public  void onTestFailure(ITestResult result) 
 {
	  test=extent.createTest(result.getName());
	  test.log(Status.FAIL,"Test case FAILED is : "+ result.getName());
	  test.log(Status.FAIL,"Testcase Failed cause is :"+ result.getThrowable());
}
 
 public  void onTestSkipped(ITestResult result) 
 {
	 test=extent.createTest(result.getName());
	  test.log(Status.SKIP,"Test case SKIPPED is : "+result.getName());
 }

 public void onFinish(ITestContext context) {
	   extent.flush();
	  }
}

