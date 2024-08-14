package HandlingMethodsAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class HandlingBrokenLinks {

	public static void main(String[] args) throws MalformedURLException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		//capture all links from website
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("No.of links:"+links.size());
		int noOfBrokenlinks=0;
		for (WebElement linkelement :links)
		{
			String href=linkelement.getAttribute("href");
			if(href==null || href.isEmpty())
			{
				System.out.println("Href attribute is null/empty .Not possibleto check ");
				continue;
			}
			//hit url to the server
			try
			{
			URL linkurl=new  URL(href);//converted href from string to url 
			HttpURLConnection conn=(HttpURLConnection) linkurl.openConnection();//open url
			conn.connect();//connect & sent request to server
			if(conn.getResponseCode()>=400)
			{
				System.out.println("It is a broken link "+href);
				noOfBrokenlinks++;
			}
			else
			{
				System.out.println("It is NOT a broken link "+href	);
			}
			}
			catch(Exception e)
			{
			}
			}
			System.out.println("No .of Broken links:"+noOfBrokenlinks);
		}
		
		
	}


