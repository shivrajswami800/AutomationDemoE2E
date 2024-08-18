package TestRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/java/Features/LoginPage.feature"},
		glue = {"StepDefinations"},
		plugin = {"pretty","html:target/htmlreport.html"}
		)

public class MyTestRunner extends  AbstractTestNGCucumberTests 
{

}
