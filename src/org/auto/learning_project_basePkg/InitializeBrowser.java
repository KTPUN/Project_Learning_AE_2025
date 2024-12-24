package org.auto.learning_project_basePkg;

import java.time.Duration;

import org.auto.learning_project.utilities.ReadPropFiles;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class InitializeBrowser 
{
	public WebDriver driver;

	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		
		if(ReadPropFiles.readconfig("BrowserName").equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if(ReadPropFiles.readconfig("BrowserName").equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		
		else if(ReadPropFiles.readconfig("BrowserName").equalsIgnoreCase("safari"))
		{
			driver = new SafariDriver();
		}
		
		else if(ReadPropFiles.readconfig("BrowserName").equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		else if(ReadPropFiles.readconfig("BrowserName").equalsIgnoreCase("IE"))
		{
			driver = new InternetExplorerDriver();
		} 
		else
		{
			driver = new ChromeDriver();
		}
		
		driver.get(ReadPropFiles.readconfig("ApplicationURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//driver.manage().deleteAllCookies();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
	   //driver.manage().deleteAllCookies();
		//driver.close();
		driver.quit();
	}
	
}
