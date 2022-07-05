package stepdefinition;


import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageclasses.Homepage;
import pageclasses.Queue;

import static org.testng.Assert.assertEquals;

public class QueuesSD {
	WebDriver driver = Hooks.driver;
	Queue objq ;
	
	Homepage h = new Homepage(driver);
	
	@Given("user is in the Home page after logged in")
	public void user_is_in_the_home_page_after_logged_in() {
		
		objq = new Queue(driver);
		System.out.println("QSD..before..when..gotoQlogin");
		objq.Qpagelogin();
	  
	  String hometitle=  h.verifyHomePageTitle();
	  System.out.println(hometitle);
	assertEquals("Queue", hometitle);
	    
	}
	@When("user clicks the Getting Started button in Queue Pane or select Queue item from the drop down menu")
	public void user_clicks_the_getting_started_button_in_queue_pane_or_select_queue_item_from_the_drop_down_menu() {
		System.out.println("cliking getstrted from loggedin Q");
		//h.QGetstartedbtn();
	}

	@Then("user should be directed to {string} Page")
	public void user_should_be_directed_to_page(String string) {
		//System.out.println(string);
		String Qpagename = string;
		System.out.println("user to be redi to q page");
		//System.out.println(driver.getTitle());
		assertEquals(Qpagename, driver.getTitle());
		//Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Queue"));
		System.out.println("user is redirected..Test success.");
		//assertEquals(alert,)
	    
	}

	@Given("user is on the Queue page after logged in")
	public void user_is_on_the_queue_page_after_logged_in() {
		/*objq = new Queue(driver);
		System.out.println("user clicks get started button");
		h.Clicksigninlnk();
		
	   LogIn lp = new LogIn(driver);
	  lp.getDatafromexcel_clickloginbtn("sheet1",1);
	  
		h.QGetstartedbtn();
		System.out.println("user is in q page, check title");
		System.out.println(driver.getTitle());
		assertEquals(driver.getTitle(),"Queue");
		objq = new Queue(driver);*/
		objq = new Queue(driver);
		System.out.println("QSD..before..when..gotoQlogin..and..getstrted..in..q.page");
		objq.Qpagelogin();
		//h.QGetstartedbtn();
	}

	@When("user clicks Implementation of Queue in Python button")
	public void user_clicks_implementation_of_queue_in_python_button() {
		/*objq = new Queue(driver);
		System.out.println("user clicks impl of pythn");
		h.Clicksigninlnk();
		
	   LogIn lp = new LogIn(driver);
	  lp.getDatafromexcel_clickloginbtn("sheet1",1);
	  
		h.QGetstartedbtn();*/
		
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", queueInPython);
		*/
		
		objq.ImplementQPythongLink();
		 //title = Implementation of Queue in Python;
		 //url = https://dsportalapp.herokuapp.com/queue/implementation-lists/
	    String qpythontryhereurl=driver.getCurrentUrl();
	    System.out.print(qpythontryhereurl);
	}
	
	@Then("The user should be directed to {string} Page")
	public void the_user_should_be_directed_to_page(String string) {
	  //user need to be in "Implementation of Queue in Python Page"
		//System.out.println("user to be in impl of pythn. page - " + driver.getCurrentUrl());
		String Pagetobeloaded = string;
		
		  //  driver.geturl();
		    String Currentpagetitle = driver.getTitle();
		  //  Assert.assertEquals("Implementation of Queue in Python", pagetitle);
			assertEquals(Pagetobeloaded, Currentpagetitle);
		
	}

	@Given("user is in the Implementation of Queue in Pythonpage after logged in")
	public void user_is_in_the_implementation_of_queue_in_pythonpage_after_logged_in() {
		objq = new Queue(driver);
		System.out.println("QSD..before..when..gotoQlogin..and..getstrted..in..q.page");
		objq.Qpagelogin();
		//h.QGetstartedbtn();
		objq.ImplementQPythongLink();
		 //title = Implementation of Queue in Python;
		 //url = https://dsportalapp.herokuapp.com/queue/implementation-lists/
	    String qpythontryhereurl=driver.getCurrentUrl();
	    System.out.print(qpythontryhereurl);
	    String pagetitle = driver.getTitle();
		  //  Assert.assertEquals("Implementation of Queue in Python", pagetitle);
			assertEquals("Implementation of Queue in Python", pagetitle);  
	}

	@When("user clicks TryHere button")
	public void user_clicks_try_here_button() {
		System.out.print("clicking tryhere btn in impl python page");
		System.out.println("url..at..tryhere. "+ driver.getCurrentUrl().toString());
		
	    objq.Qpythontryhere(); //Any tryhere is ssme : objq.QcollectionTryherebtn
	}

	@Then("user be redirected to a page having an tryEditor with a Run button to test")
	public void user_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() throws InterruptedException {
		 
	    //System.out.print(driver.getCurrentUrl());
	   // System.out.print(driver.getTitle());
	    assertEquals(driver.getTitle(), "Assessment");
	    System.out.println("trying run button in python");
	   
	
	   objq.Qruncode();
	   String currenturlRunbtn = driver.getCurrentUrl();
	   System.out.println(currenturlRunbtn);
	   System.out.println("In editor..");
	    System.out.println("url..b4..back. "+ driver.getCurrentUrl().toString());
	   // driver.navigate().back();
	}

	@When("user clicks Implementation using Collections.deque button")
	public void user_clicks_implementation_using_collections_deque_button() {
	    
	    System.out.println("trying to click collection, after.back..from runcode ");
	    objq.ImplementQCollectionsLink();
	    
	}

	@Then("The user should be directed to Implementation using Collections.deque Page")
	public void the_user_should_be_directed_to_implementation_using_collections_deque_page() {
	    
	}

	@Given("The user is in the Implementation using Collections.deque page after logged in")
	public void the_user_is_in_the_implementation_using_collections_deque_page_after_logged_in() {
		objq = new Queue(driver);
	   objq.Qpagelogin();
	   System.out.println(driver.getCurrentUrl());
	   objq.ImplementQCollectionsLink();
	   
	   
	   assertEquals(driver.getTitle(), "Implementation using collections.deque");
	}

	@When("user clicks Implementation using Array button")
	public void user_clicks_implementation_using_array_button() {
		
	    
	}

	@Then("user should be directed to Implementation using Array Page")
	public void user_should_be_directed_to_implementation_using_array_page() {
	    
	}

	@Given("user is in the Implementation using Array page after logged in")
	public void user_is_in_the_implementation_using_array_page_after_logged_in() {
		objq = new Queue(driver);
		objq.Qpagelogin();
		objq.ImplementQArray();
	}

	@When("user clicks Queue Operations button")
	public void user_clicks_queue_operations_button() {
	    objq.ImplementQOperations();
	}

	@Then("user should be directed to Queue Operations Page")
	public void user_should_be_directed_to_queue_operations_page() {
	    
	}

	@Given("user is in the Queue Operations page after logged in")
	public void user_is_in_the_queue_operations_page_after_logged_in() {
		objq = new Queue(driver);
		objq.Qpagelogin();
		objq.ImplementQOperations();
	}

	@When("user clicks Practice Questions button")
	public void user_clicks_practice_questions_button() {
		objq.ImplementQOperations();
		objq.PracticeQns();
	}

	@Then("user should be redirected to Practice page")
	public void user_should_be_redirected_to_practice_page() {
	    
	}


}
