package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
   @CucumberOptions(
		   plugin = {"pretty", "html:target/junit.html"},
		   tags = "@tag",
		   features = {"src/test/resources/features"},
		   glue="stepdefinition")
public class JUnit{
	
}