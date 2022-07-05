package pageclasses;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.Hooks;

public class Homepage { // extends TestBase{
	@FindBy(xpath="//a[@href=\"/login\"]")
     WebElement signinlnk; 
	@FindBy(xpath="//a[@href=\"/logout\"]")
    WebElement logoutlnk; 
	@FindBy(xpath="//div[contains(text(),'You are logged in')]")
    WebElement lblLoggedin; 
	@FindBy(xpath="//a[@href='queue']")WebElement queueGS; //Queue getstarted btn after loggedin
	@FindBy(xpath="//a[@href='tree']") WebElement treegetstartedbtn;// Tree get started button after loggedin
	//currently not taking of remaining elements of homepage.,but only singinlink.
	
	 WebDriver driver = Hooks.driver;
		
		public  Homepage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver,this);

		}
	
	//public LogIn Clicksigninlnk()
	public void Clicksigninlnk()
	{
		signinlnk.click();
	//return new LogIn(driver);
	}
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
		//return ldriver.getTitle();
	}
	public boolean verifyLoggedinMessage()
	{
		System.out.println("checking lable on homepage");
		System.out.println(lblLoggedin.toString());
		return lblLoggedin.isDisplayed();
	}
	
	public void QGetstartedbtn()
	{
		queueGS.click();
	
	}
	public void TGetstartedbtn()
	{
		treegetstartedbtn.click();
	
	}

	

}
