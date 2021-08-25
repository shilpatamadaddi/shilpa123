package POM_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generics.WebUtilities;

public class SalesOrderPage extends WebUtilities {
	@FindBy(xpath="//select[@name='search_field']")
	private WebElement selectOption;
	
	
	@FindBy(xpath="(//option[text()='Quote Name'])[1]")
	private WebElement option;
	
	
	

public WebElement getSelectOption() {
		return selectOption;
	}

public WebElement getOption() {
	return option;
}
public void salesOrdermethod(WebElement ele, String text)
{
	
	Dropdown2(selectOption,3);
	selectOption.click();
	option.click();
}


}