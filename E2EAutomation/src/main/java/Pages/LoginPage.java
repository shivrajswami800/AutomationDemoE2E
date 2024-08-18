package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import QA.DriverFactory;

public class LoginPage extends DriverFactory
{
	//Object Repository for Login page
	By uname = By.xpath("//input[@class=\"input-text\" and @title=\"Email\" ]");
	By pwd = By.xpath("//input[@class=\"input-text\" and @title=\"Password\" ]");
	By loginbutton = By.xpath("//button[@class=\"action login primary\" and @id=\"send2\" ]");
	By login = By.linkText("Sign In");
	By tops = By.linkText("Tops");
	By whitetop = By.linkText("Breathe-Easy Tank");
	By addtocart = By.xpath("//button[@type=\"submit\" and @title=\"Add to Cart\"]");
	By selectcolor = By.xpath("//div[@id=\"option-label-color-93-item-57\"]");
	By selectsize = By.xpath("//div[@id=\"option-label-size-143-item-167\"]");
	By cart = By.xpath("//a[@class=\"action showcart\"]");
	
	By Wmenu = By.linkText("Women");
	
	
	public void clickLogin()
	{
		driver.findElement(login).click();
	}
	
	public void enterUsername(String username)
	{
		driver.findElement(uname).sendKeys(username);
	}
	public void enterPassword(String Password)
	{
		driver.findElement(pwd).sendKeys(Password);
	}
	public void clickLoginButton()
	{
		driver.findElement(loginbutton).click();
	}
	public void womenMenu()
	{
		driver.findElement(Wmenu).click();
		 
		
	}
	public boolean womenMenuTest()
	{
		
		boolean flag = driver.findElement(Wmenu).isDisplayed();
		//System.out.println("The Wmenu is enable/not--->"+flag);
		return flag;	
		
	}
	public void selectTopMenu()
	{
		driver.findElement(tops).click();
	}
	public void selectWhiteTop()
	{
		driver.findElement(whitetop).click();
	}
	public void addToCart()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(addtocart));		
		driver.findElement(addtocart).click();
	}
	public void selectColor()
	{
		driver.findElement(selectcolor).click();
	}
	public void selectSize()
	{
		driver.findElement(selectsize).click();
	}
	public void clickOnCart()
	{
		driver.findElement(cart).click();
	}
}
