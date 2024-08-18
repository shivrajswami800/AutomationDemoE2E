package StepDefinations;

import org.testng.annotations.Listeners;

import Pages.LoginPage;
import QA.CustomListeners;
import QA.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//@Listeners(CustomListeners.class)
public class LoginPageStepsDefination extends DriverFactory
{
	LoginPage login = new LoginPage();

	@Given("user is on login page")
	public void user_is_on_login_page() 
	{
		DriverFactory.launchBrowser();
		System.out.println("Browser successfully Launched");
		DriverFactory.launchUrl();
		System.out.println("URL successfully Launched");
		login.clickLogin();
		System.out.println("Successfully clicked on Login button");
	}

	@When("user enters {string} and {string}")
	public void user_enters_username_and_password(String username , String Password) 
	{
	    login.enterUsername(username);
	    login.enterPassword(Password);
	    System.out.println("UID/PWD successfully Entered");
	}

	@When("user click on Login button")
	public void user_click_on_login_button() throws InterruptedException 
	{	
	    login.clickLoginButton();
	    System.out.println("successfully Clicked on Login button");
	    login.womenMenu();
	    Thread.sleep(4000);
	}

	@Then("verify that user is on home page")
	public void verify_that_user_is_on_home_page() 
	{
		//DriverFactory.closeBrowser();
		//Assert.assertTrue(login.womenMenuTest(),"The Opetion is enabled on Home Page");
		//System.out.println("Verified the Women Menu");
		System.out.println(login.womenMenuTest());
		System.out.println("clecked on Woemen Menu");
	}
	@Then("click on top menu")
	public void click_on_top_menu() 
	{
	   login.selectTopMenu();
	   System.out.println("Clicked on Top option");
	}
	@Then("select a white top from list")
	public void select_a_white_top_from_list() 
	{
	    login.selectWhiteTop();
	    System.out.println("White top Selected");
	}
	@Then("add into the cart")
	public void add_into_the_cart() 
	{
	    login.addToCart();
	    System.out.println("Clecked on Add to cart");
	}
	@Then("select the pink color")
	public void select_the_pink_color() 
	{
	    login.selectColor();
	    System.out.println("Color Selected");
	}
	@Then("select the small size")
	public void select_the_small_size() 
	{
	   login.selectSize();
	   System.out.println("Size of the top is selected");
	}
	@Then("Click on Cart")
	public void click_on_cart() 
	{
	    login.clickOnCart();
	    System.out.println("clecked on Cart");
	}
}
		
		
		
		
		
