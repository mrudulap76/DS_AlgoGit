package pageclasses;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.Excelalgo;
import stepdefinition.Hooks;

public class LogIn { //extends TestBase{
	

@FindBy(xpath="//a[text()='Sign in']")
private WebElement Signin;//Sign in link
@FindBy(xpath="//a[text()='Register']")
private WebElement Register1;//Register link

@FindBy(id="id_username")
private WebElement username;//Username 

@FindBy(id="id_password")
private WebElement password;//Password

@FindBy(xpath="//input[@value='Login']")
private WebElement btnlogin;//login button

@FindBy(xpath="//a[text()='Register!']")
private WebElement Register2;// Register! link


  WebDriver driver = Hooks.driver;
  
	
	public  LogIn(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);

	}

public void ClickSigninlnk(){

	Signin.click();
	
}
/*
public Homepage ClickLoginButton(String un, String ppswd) {
	
    Excelalgo exceldata = new Excelalgo(sheetName,testID);
    String uname = exceldata.GetUserName();
    String pwd = exceldata.GetUserPassword();
username.sendKeys(un);	
password.sendKeys(pwd);
btnlogin.click();

	return new Homepage();
	
}*/
//public Homepage getDatafromexcel_clickloginbtn(String shname, Integer testId) throws InterruptedException {
	public void getDatafromexcel_clickloginbtn(String shname, Integer testId) {
	
    Excelalgo exceldata = new Excelalgo(shname,testId);
    String uname = exceldata.GetUserName();
    String pwd = exceldata.GetUserPassword();
	//String uname = "Subhash";
	//String pwd = "Dsalgo@123";
username.sendKeys(uname);	
password.sendKeys(pwd);
//Thread.sleep(2000);
btnlogin.click();

	//return new Homepage(driver);
	
}
public String verifyLoginPageTitle()
{
	return driver.getTitle();
}
}
