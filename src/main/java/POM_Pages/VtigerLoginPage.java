package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VtigerLoginPage {
	
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement userName;

	@FindBy(xpath="//input[@name='user_password']")
	private WebElement passWord;
	
	@FindBy(xpath="//input[@id='submitButton']")
	private WebElement LoginButton;
 
	public VtigerLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return userName;
	}

	public WebElement getPassword() {
		return passWord;
	}
	
	public void loginmethod(String username, String password)
	{
		userName.sendKeys(username);
		passWord.sendKeys(password);
		LoginButton.click();
		
	}
	

}
