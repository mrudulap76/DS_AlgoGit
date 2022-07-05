package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
   @CucumberOptions(
          plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
          glue="stepdefinition",
		  features = {"src/test/resources/features/Queues.feature","src/test/resources/features/Tree.feature"})
@Test		   
		  
public class Allure extends AbstractTestNGCucumberTests{
@Override
@DataProvider(parallel = false)
public Object[][] scenarios(){
	return super.scenarios();
}
}

	

