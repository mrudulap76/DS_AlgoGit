package stepdefinition;

import org.openqa.selenium.WebDriver;
//import org.openxmlformats.schemas.presentationml.x2006.main.CTApplicationNonVisualDrawingProps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageclasses.Homepage;
import pageclasses.LogIn;

public class HomepageSD { //extends TestBase{
	
	WebDriver driver = Hooks.driver;
	Homepage objHome1 ;
	LogIn lp ;
//	Portalpage portpg = new Portalpage(driver);
	
	
	@Given("User opens Home Page")
	public void user_opens_home_page() {
	 //objHome1.Clicksigninlnk();
		//TestBase.driversetup();
		//driver.get(CTApplicationNonVisualDrawingProps.);
		//driver.get(prop.getProperty("homeurl"));
		//portpg.Gemetstartedclick();
		objHome1 = new Homepage(driver);
	}

	@When("The user clicks Sign in")
	public void the_user_clicks_sign_in() {
	    objHome1.Clicksigninlnk();
	}

	@Then("The user should be redirected to Sign in page")
	public void the_user_should_be_redirected_to_sign_in_page() {
	    lp = new LogIn(driver);
	  
	}
}
