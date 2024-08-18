package QA;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory 
{

	public static WebDriver driver;

	public static void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:/Software/ChreomDriver/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
	
	}
	
	public static void launchUrl()
	{				
		driver.get("https://magento.softwaretestingboard.com/");
	}
	
	public static void closeBrowser()
	{				
		driver.quit();
	}
	
	public void FailedTc() throws IOException
	{
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile , new File("C:/Users/HP_PC/eclipse-workspace/E2EAutomation/ScreensShot/testfail.jpg"));
		
	}
	

}
