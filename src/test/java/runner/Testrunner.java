  package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	
@RunWith(Cucumber.class)
	
	@CucumberOptions(
			plugin= {"pretty", "html:target/DsalgoSequencial.html"} ,
			tags= "@tag",
			features= {"src/test/resources/feature"},
			glue= "stepdefinition")
	
	public class Testrunner extends AbstractTestNGCucumberTests{
		
		@Override
		@DataProvider(parallel=false)
		public Object[][] scenarios(){
			return super.scenarios();

}
}
