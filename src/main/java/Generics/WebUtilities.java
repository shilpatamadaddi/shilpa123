package Generics;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebUtilities {

public void Dropdown(WebElement ele, String text)
{
	Select s=new Select(ele);
	s.selectByVisibleText(text);

}
public void Dropdown2(WebElement ele, int index)
{
	Select s=new Select(ele);
	s.selectByIndex(index);

}
public void Dropdown3(WebElement ele, String text)
{
	Select s=new Select(ele);
			s.selectByVisibleText(text);
}
public void mouseHover(WebDriver driver, WebElement ele)
{
	Actions a=new Actions(driver);
	a.moveToElement(ele).perform();
	
}
public void DoubleClick(WebDriver driver,WebElement ele)
{
	Actions a=new Actions(driver);
	a.doubleClick(ele).perform();
}
public void frameSwitch(WebDriver driver)
{
	driver.switchTo().frame(0);
}
public void frameSwitchBack(WebDriver driver)
{
	driver.switchTo().defaultContent();
}
public void scrollBar(WebDriver driver,int x,int y)
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeAsyncScript("window,scrollBy(x,y)");
}
public void alertPopup(WebDriver driver)
{
	driver.switchTo().alert().accept();
}
public void switchTabs(WebDriver driver)
{
	Set<String> child=driver.getWindowHandles();
	for(String b:child)
	{
		driver.switchTo().window(b);
	}

	
		
	
	
}
}

