package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.WebUtilities;

public class VtigerHomePage extends WebUtilities {
	
	@FindBy(xpath="//a[text()='More']")
	private WebElement mouseOver;
	
	@FindBy(xpath="//a[text()='Sales Order']")
	private WebElement selectSales;

	
	public VtigerHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}


	public WebElement getMouseOver() {
		return mouseOver;
	}


	//public WebElement getSalesLink() {
	//	return selectSales;
	//}
	public void HomePagMethod(WebDriver driver )
	{
		//getMouseOver();
		
		mouseHover(driver,mouseOver);
		selectSales.click();
		
		

	}


	public WebElement getselectSales() {
		
		return selectSales;
	}
}
	