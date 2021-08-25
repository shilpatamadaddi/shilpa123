package POM_Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class VtigerAlloption {
	
	WebDriver driver;
	
	public VtigerAlloption(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//select[@name='search_field']")
	private WebElement selectOption;
	
	
	@FindBy(xpath="//select[@id='bas_searchfield']")
	private WebElement inDropdown;
	
	
	

public WebElement getSelectOption() {
		return selectOption;
	}




public WebElement getInDropdown() {
	return inDropdown;
}
public void getAllOption()
{
	Select select=new Select(inDropdown);
	List<WebElement> options = select.getOptions();
	for(WebElement element : options)
	{
		System.out.println(element.getText());
	}
}


	
	

}
