package pageclasses;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.Hooks;


public class Queue { //extends TestBase  {
	//@FindBy(xpath="//button[@class='btn']") WebElement getstartedbtn; //getstarted btn
	//@FindBy(xpath="//a[text()='Sign in']")WebElement signin; //signinlnk
	@FindBy(xpath="//nav/a") WebElement numpininja;
	@FindBy(xpath="//a[@href='implementation-lists']")WebElement  queueInPython; //implementation of Queue in Python
	@FindBy(xpath="//a[@href='/tryEditor']")WebElement QPythontryherebtn; //Tryhere btn in Queue in Python
	//@FindBy(xpath="//div[@class='input']")WebElement QEditor; // Text fiels to enter the code of python
	@FindBy(xpath="//div[@class='CodeMirror-scroll']")WebElement txtEditor;  //or...//form[@id='answer_form']/div/div/div/textarea  
//	@FindBy(xpath="//div[@class='CodeMirror-lines']")WebElement QEditor2;  
	@FindBy(css=".CodeMirrortextarea") WebElement QEditor3;
	@FindBy(xpath="//pre[@id='output']")WebElement QEditoroutput; 
		
	@FindBy(xpath="//button[@type='button']")WebElement QRunbtn; // Run button in Queue Python
	@FindBy(xpath="//a[text()='Implementation using collections.deque']")WebElement QUsingCollections; //Implementing using Queue in collections dequeue
	@FindBy(xpath="//a[@href='/queue/implementation-collections/'and text()='Implementation using collections.deque']")WebElement Q1UsingCollections; //Implementing using Queue in collections dequeue
//	@FindBy(xpath="//a[@href='/tryEditor']")WebElement QcollectionTryherebtn; //tryhere btn in collections deque
	//@FindBy(xpath="//button[@type='button']")WebElement QcollectionRunbtn;// Run button in Queue collection deque
//	driver.navigate().back();
	
	@FindBy(xpath="//a[text()='Implementation using array']")WebElement QWithArray;
//	@FindBy(xpath="//a[@href='/tryEditor']")WebElement QArraytryHere;//Tryhere btn in Queue Implementing with Array
//	@FindBy(xpath="//button[@type='button']")WebElement QArrayRun;// Run button in Queue with Array
//	driver.navigate().back();
	
	
	
	@FindBy(xpath="//a[text()='Queue Operations']")WebElement queueOperations;// link for the queue Operations
//	@FindBy(xpath="//a[@href='/tryEditor']")WebElement QOpstryhere;//Tryhere btn in Queue Implementing with oprations
	//@FindBy(xpath="//button[@type='button']")WebElement QOpsrun;// Run button in Queue with Opreations
	//driver.navigate().back();
	
	@FindBy(xpath="//a[text()='Practice Questions']")WebElement QpracticeQn;

	  WebDriver driver = Hooks.driver;
	  
		
		public  Queue(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver,this);

		}
	public void Qpagelogin()
	{
		Homepage hfromQ = new Homepage(driver);
		hfromQ.Clicksigninlnk();
		LogIn LfromQ = new LogIn(driver);
		LfromQ.getDatafromexcel_clickloginbtn("sheet1",1);
		  
	     hfromQ.QGetstartedbtn();
	}
	
		public void ImplementQPythongLink() 
	{
		queueInPython.click();
	}
		public void ImplementQCollectionsLink() 
		{
			//JavascriptExecutor js_exec = (JavascriptExecutor) driver;
			//js_exec.executeAsyncScript("arguments[0].)click();",QUsingCollections);
			QUsingCollections.click();
		}
		public void ImplementQArray() 
		{
			QWithArray.click();
		}
		public void ImplementQOperations() 
		{
			queueOperations.click();
		}
		public void PracticeQns() 
		{
			QpracticeQn.click();
		}

		
	public void Qpythontryhere() 
	{
		QPythontryherebtn.click();
	}
	//public void Qruncode( String codetext)
	public void Qruncode() throws InterruptedException
	{
		//String  samplecode = codetext;
		System.out.println("before run button");
		String samplecode = "print('testing tryedit Hello world')";
		// System.out.println(samplecode);
		// QEditor.click();
		//QEditor.se 
	 WebElement codesection =txtEditor.findElements(By.className("CodeMirror-line")).get(0);
	 codesection.click();
	driver.findElement(By.cssSelector(".CodeMirror textarea")).sendKeys(samplecode);
	// QEditor2.sendKeys(samplecode);
	//	 codesection.clic
	//	QEditor.sendKeys(samplecode);
		//QEditor.sendKeys(null);
		System.out.println("before run button,sent data..");
		//System.out.println("data in the editor..");
		//System.out.println(QEditor.getText());
				Thread.sleep(2000);
		QRunbtn.click();
		 System.out.print("after run button");
		 System.out.println(QEditoroutput.getText());
		 
		 String currenturlRunbtn = driver.getCurrentUrl();
		   System.out.println(currenturlRunbtn);

	}
	
	
	
}
