package Generics;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import POM_Pages.VtigerLoginPage;

public class BaseClassTest implements AutoConstant {
	public WebDriver driver;
	public PropertyFile pdate=new PropertyFile();
	public WebUtilities utilies=new WebUtilities();
	
	//@Parameters("Browser")
	
	@BeforeClass
	public void launch_Browser() throws FileNotFoundException, IOException
	{
		//System.out.println("test");	
		String Browser1=System.getProperty("Browser");
		if(Browser1.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(Browser1.equalsIgnoreCase("FireFox"))
		{
			driver=new FirefoxDriver();
			
		}
		else
		{
			System.out.println("Browser launch failed");
		}
		driver.get(pdate.getData("url"));
	}
	
	@BeforeMethod
	public void loginPage()
	{
	   VtigerLoginPage login=new VtigerLoginPage(driver);
	    login.loginmethod(ChromeValue, ChromeKey);
	}
	
	@AfterMethod
	public void CloseApp()
	{
		driver.close();
	}
				
				
				
		
		
		
	
	
	
	
	

}
