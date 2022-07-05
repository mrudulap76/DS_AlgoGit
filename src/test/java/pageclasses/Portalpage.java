/**
 * 
 */
package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.Hooks;
import utilities.TestBase;

/**
 * @author pmrud
 *
 */
public class Portalpage extends TestBase {
	@FindBy(xpath="//button[@class='btn']")
	 WebElement btnGetstarted;//Getstarted btn
	
	WebDriver ldriver = Hooks.driver;
	
	public Portalpage(WebDriver Rdriver) {
		this.ldriver = Rdriver;
		PageFactory.initElements(Rdriver,this);
		
	}
	
	public void Getstartedclick() {
		//public Homepage Getstartedclick() {
	//	driver.get("https://dsportalapp.herokuapp.com");
		System.out.println("Enter getstarted pageclass on portal");
		btnGetstarted.click();
		//return new Homepage(driver);
	}
	 
}
