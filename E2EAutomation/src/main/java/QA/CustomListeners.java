package QA;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners extends DriverFactory implements ITestListener
{
	@Override
	public void onTestStart(ITestResult result)
	{
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test Case is getting fail");
		try {
			FailedTc();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
