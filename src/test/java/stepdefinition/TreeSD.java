package stepdefinition;





import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageclasses.Homepage;
import pageclasses.Tree;

public class TreeSD {
	WebDriver driver = Hooks.driver;
	Tree objT ;
	
	Homepage hT = new Homepage(driver);
	@Given("The user is in Home page after logged in")
	public void the_user_is_in_home_page_after_logged_in() {
		objT = new Tree(driver);
		System.out.println("TSD..before..when..gotoTlogin");
		objT.Tpagelogin();
	  
	  String hometitle=  hT.verifyHomePageTitle();
	  System.out.println(hometitle);
	//assertEquals("Tree", hometitle);
	}
	
	@When("The user clicks the Getting Started button in Tree Pane or select Tree item from the drop down menu")
	public void the_user_clicks_the_getting_started_button_in_tree_pane_or_select_tree_item_from_the_drop_down_menu() {
		System.out.println("cliking getstrted from loggedin Tree");
		
	}

	@Then("The user should be get directed to {string} Page")
	public void the_user_should_be_directed_to_tree_page(String string) {
		System.out.println("user to be in impl of pythn. page - " + driver.getCurrentUrl());
		String Pagetobeloaded = string;
		
		  //  driver.geturl();
		    String Currentpagetitle = driver.getTitle();
		  //  Assert.assertEquals("Implementation of Queue in Python", pagetitle);
			assertEquals(Pagetobeloaded, Currentpagetitle);
	}
	@Given("The user is in the Tree page after logged in")
	public void the_user_is_in_the_tree_page_after_logged_in() {
	    objT = new Tree(driver);
	    objT.Tpagelogin();
	    System.out.println("user in tree pg after login . "+driver.getCurrentUrl());
	    
	    
	}
	
	@When("The user clicks on Try Here button")
	public void the_user_clicks_on_try_here_button() {
	    objT.TreeTryhereClk();
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() throws InterruptedException {
	   objT.Treeruncode();
	}
	@When("The user clicks Overview of Trees button")
	public void the_user_clicks_overview_of_trees_button() {
	    
	    objT.OverviewtreesClk();
	}

	@Then("The user should be directed to Overview of Trees Page")
	public void the_user_should_be_directed_to_overview_of_trees_page() {
	    
	    
	}

	@Given("The user is in the Overview of Trees page after logged in")
	public void the_user_is_in_the_overview_of_trees_page_after_logged_in() {
		 objT = new Tree(driver);
		    objT.Tpagelogin();
		    objT.OverviewtreesClk();
	    
	}

	@When("The user clicks Terminologies button")
	public void the_user_clicks_terminologies_button() {
	    
	    
	}

	@Then("The user should be directed to Terminologies Page")
	public void the_user_should_be_directed_to_terminologies_page() {
	    
	    
	}

	@Given("The user is in the Terminologies page after logged in")
	public void the_user_is_in_the_terminologies_page_after_logged_in() {
	    
	    
	}

	@When("The user clicks Types of Trees button")
	public void the_user_clicks_types_of_trees_button() {
	    
	    
	}

	@Then("The user should be directed to Types of Trees Page")
	public void the_user_should_be_directed_to_types_of_trees_page() {
	    
	    
	}

	@Given("The user is in the Types of Trees page after logged in")
	public void the_user_is_in_the_types_of_trees_page_after_logged_in() {
	    
	    
	}

	@When("The user clicks Tree Traversals button")
	public void the_user_clicks_tree_traversals_button() {
	    
	    
	}

	@Then("The user should be directed to Tree Traversals Page")
	public void the_user_should_be_directed_to_tree_traversals_page() {
	    
	    
	}

	@Given("The user is in the Tree Traversals page after logged in")
	public void the_user_is_in_the_tree_traversals_page_after_logged_in() {
	    
	    
	}

	@When("The user clicks Traversals-Illustration button")
	public void the_user_clicks_traversals_illustration_button() {
	    
	    
	}

	@Then("The user should be directed to Traversals-Illustration Page")
	public void the_user_should_be_directed_to_traversals_illustration_page() {
	    
	    
	}

	@Given("The user is in the Traversals-Illustration page after logged in")
	public void the_user_is_in_the_traversals_illustration_page_after_logged_in() {
	    
	    
	}

	@When("The user clicks Binary Trees button")
	public void the_user_clicks_binary_trees_button() {
	    
	    
	}

	@Then("The user should be directed to Binary Trees Page")
	public void the_user_should_be_directed_to_binary_trees_page() {
	    
	    
	}

	@Given("The user is in the Binary Trees page after logged in")
	public void the_user_is_in_the_binary_trees_page_after_logged_in() {
	    
	    
	}

	@When("The user clicks Types of Binary Trees button")
	public void the_user_clicks_types_of_binary_trees_button() {
	    
	    
	}

	@Then("The user should be directed to Types of Binary Trees Page")
	public void the_user_should_be_directed_to_types_of_binary_trees_page() {
	    
	    
	}

	@Given("The user is in the Types of Binary Trees page after logged in")
	public void the_user_is_in_the_types_of_binary_trees_page_after_logged_in() {
	    
	    
	}

	@When("The user clicks Implementation in Python button")
	public void the_user_clicks_implementation_in_python_button() {
	    
	    
	}

	@Then("The user should be directed to Implementation in Python Page")
	public void the_user_should_be_directed_to_implementation_in_python_page() {
	    
	    
	}

	@Given("The user is in the Implementation in Python page after logged in")
	public void the_user_is_in_the_implementation_in_python_page_after_logged_in() {
	    
	    
	}

	@When("The user clicks Binary Tree Traversals button")
	public void the_user_clicks_binary_tree_traversals_button() {
	    
	    
	}

	@Then("The user should be directed to Binary Tree Traversals Page")
	public void the_user_should_be_directed_to_binary_tree_traversals_page() {
	    
	    
	}

	@Given("The user is in the Binary Tree Traversals page after logged in")
	public void the_user_is_in_the_binary_tree_traversals_page_after_logged_in() {
	    
	    
	}

	@When("The user clicks Implementation of Binary Trees button")
	public void the_user_clicks_implementation_of_binary_trees_button() {
	    
	    
	}

	@Then("The user should be directed to Implementation of Binary Trees Page")
	public void the_user_should_be_directed_to_implementation_of_binary_trees_page() {
	    
	    
	}

	@Given("The user is in the Implementation of Binary Trees after logged in")
	public void the_user_is_in_the_implementation_of_binary_trees_after_logged_in() {
	    
	    
	}

	@When("The user clicks Applications of Binary trees button")
	public void the_user_clicks_applications_of_binary_trees_button() {
	    
	    
	}

	@Then("The user should be directed to Applications of Binary trees Page")
	public void the_user_should_be_directed_to_applications_of_binary_trees_page() {
	    
	    
	}

	@Given("The user is in the Applications of Binary trees page after logged in")
	public void the_user_is_in_the_applications_of_binary_trees_page_after_logged_in() {
	    
	    
	}

	@When("The user clicks Binary Search Trees button")
	public void the_user_clicks_binary_search_trees_button() {
	   System.out.println("user..abou..to click..binaryseach link from .. : " + driver.getCurrentUrl().toString());
	  // driver.manage().
	   
		objT.BinarySearchTreesClk();
		System.out.println("user..aftrr to click..binaryseach link from .. : " + driver.getCurrentUrl().toString());
	    
	}

	@Then("The user should be directed to Binary Search Trees Page")
	public void the_user_should_be_directed_to_binary_search_trees_page() {
	    
	    
	}

	@Given("The user is in the Binary Search Trees page after logged in")
	public void the_user_is_in_the_binary_search_trees_page_after_logged_in() {
		objT = new Tree(driver);
	    objT.Tpagelogin();
	    objT.BinarySearchTreesClk();
	    
	}

	@When("The user clicks Implementation Of BST button")
	public void the_user_clicks_implementation_of_bst_button() {
	    
	    objT.implementationofBSTClk();
	}

	@Then("The user should be directed to Implementation Of BST Page")
	public void the_user_should_be_directed_to_implementation_of_bst_page() {
		 
	}

	@Given("The user is in the Implementation Of BST page after logged in")
	public void the_user_is_in_the_implementation_of_bst_page_after_logged_in() {
		objT = new Tree(driver);
	    objT.Tpagelogin();
	    objT.implementationofBSTClk();
	    
	}

}
