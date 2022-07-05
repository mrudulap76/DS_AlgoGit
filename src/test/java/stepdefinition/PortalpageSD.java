package stepdefinition;



//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageclasses.Homepage;
import pageclasses.Portalpage;

import org.openqa.selenium.WebDriver;

@SuppressWarnings("deprecation")
public class PortalpageSD  { //extends TestBase{

	//WebDriver driver = new ChromeDriver();
	//Portalpage objprtpage;
	//driver.get(Url);
	WebDriver driver = Hooks.driver;
 Homepage objHome = new Homepage(driver);
	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link()  {
	//TestBase.driversetup();
  //  driver=new ChromeDriver();
	//pg= new Portalpage(driver);
    System.out.println("Hello from portal page");
   // objprtpage= new Portalpage();
    
	}

	@When("The user clicks the Get Started button")
	public void the_user_clicks_the_get_started_button() {
		System.out.println("Enter getstarted sd from portal");
		 Portalpage objprtpage = new Portalpage(driver);
	objprtpage.Getstartedclick();
		
	    
	}
	//@SuppressWarnings("deprecation")e
	@Then("The user should be redirected to homepage")
	public Homepage the_user_should_be_redirected_to_homepage() {
	String returnedpagetitle =	objHome.verifyHomePageTitle();
	
	Assert.assertEquals("NumpyNinja", returnedpagetitle); 
	return new Homepage(driver);
	//Assert.assertEquals(returnedpagetitle, returnedpagetitle);
	
	
	}
}
