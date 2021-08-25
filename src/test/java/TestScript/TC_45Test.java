package TestScript;


import org.testng.annotations.Test;

import Generics.BaseClassTest;
import POM_Pages.SalesOrderPage;
import POM_Pages.VtigerHomePage;

public class TC_45Test extends BaseClassTest{
	
	
	@Test
	
	public void loginPage()
	{
		
	
//	WebDriver driver=new ChromeDriver();
//	VtigerLoginPage login=new VtigerLoginPage(driver);
	VtigerHomePage home=new VtigerHomePage(driver);
	SalesOrderPage sales=new SalesOrderPage();
//	PropertyFile prop=new PropertyFile();
	//driver.get(prop.getData("url"));
	//login.loginmethod(prop.getData("username"), prop.getData("password"));
	home.getMouseOver().click();
	home.getselectSales().click();
	
	sales.getSelectOption();
	sales.getOption();


	
	
    
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
