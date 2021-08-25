package TestScript;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Generics.PropertyFile;
import POM_Pages.SalesOrderPage;
import POM_Pages.VtigerHomePage;
import POM_Pages.VtigerLoginPage;

public class CreateSalesTest extends PropertyFile {
	
	@Test
	public  void test() throws FileNotFoundException, IOException, InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	VtigerLoginPage login=new VtigerLoginPage(driver);
	VtigerHomePage home=new VtigerHomePage(driver);
	SalesOrderPage sales=new SalesOrderPage();
	PropertyFile prop=new PropertyFile();
	driver.get(prop.getData("url"));
	login.loginmethod(prop.getData("username"), prop.getData("password"));
	home.getMouseOver().click();
	home.getselectSales().click();
	
	
	}
}
