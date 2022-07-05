package stepdefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageclasses.Homepage;
import pageclasses.LogIn;

public class LogInSD  { //extends TestBase{
WebDriver driver = Hooks.driver;

LogIn objlogin = new LogIn(driver);
@Given("User is in the Sign in page")
public void user_is_in_the_sign_in_page() {
	//TestBase.driversetup();
	Homepage h = new Homepage(driver);
	h.Clicksigninlnk();
    }

@When("User gets values from excel Sheet Name {string} , Testcase {int}")
public void user_gets_values_from_excel_sheet_name_testcase(String string, Integer int1) throws InterruptedException {
   
String shname = string;
Integer testId =  int1;

//LogIn objlogin = new LogIn(driver);
//objlogin.getDatafromexcel_clicklogin(shname, testId);
System.out.println("about to get data from excel");
objlogin.getDatafromexcel_clickloginbtn(shname, testId);
    
}

@Then("User be redirected to Home Page with the message You are logged in and with the user name on the top")
public void user_be_redirected_to_home_page_with_the_message_you_are_logged_in_and_with_the_user_name_on_the_top() {
	Homepage home = new Homepage(driver);
	System.out.println("calling verify loggin message");
	//home.verifyLoggedinMessage();
	home.QGetstartedbtn();
	
    }

}
