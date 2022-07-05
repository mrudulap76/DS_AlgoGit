package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.Hooks;

public class Tree {


	@FindBy(xpath="//a[@href='overview-of-trees']") WebElement Overviewtrees; //overvietrees link
	@FindBy(xpath="//a[@href='/tryEditor']") WebElement TreeTryhereBtn;// try here btn for the overviewtrees
	@FindBy(xpath="//div[@class='CodeMirror-scroll']")WebElement txtEditor; // to enter the python code in textarea
	@FindBy(xpath="//button[@type='button']") WebElement TRunBtn;// run btn for the python code
	//driver.navigate().back(); // click to back window
		@FindBy(xpath="//a[text()='Terminologies']") WebElement terminologieslnk;// link for the Terminologies
		@FindBy(xpath="//a[@href='/tree/types-of-trees/']") WebElement typesoftrees;
		@FindBy(xpath="//a[@href='/tree/tree-traversals/']") WebElement treetraversals;
		@FindBy(xpath="//a[@href='/tree/traversals-illustration/']") WebElement TreeTraIllustration;
		@FindBy(xpath="//a[@href='/tree/binary-trees/']") WebElement binarytrees;
		@FindBy(xpath="//a[@href='/tree/types-of-binary-trees/']") WebElement typesbinarytrees;
		@FindBy(xpath="//a[@href='/tree/implementation-in-python/']") WebElement implementationinpython;
		@FindBy(xpath="//a[@href='/tree/binary-tree-traversals/']") WebElement Binarytreetraversals;
		@FindBy(xpath="//a[@href='/tree/implementation-of-binary-trees/']") WebElement implementationBinarytrees;
		@FindBy(xpath="//a[@href='/tree/applications-of-binary-trees/']") WebElement AppliBinaryTrees;
		@FindBy(xpath="//a[@href='/tree/binary-search-trees/']") WebElement BinarySearchTrees;
		@FindBy(xpath="//a[@href='/tree/implementation-of-bst/']") WebElement implementationofBST;
		@FindBy(xpath="//a[@href='/tree/practice']") WebElement PracticeQ;
	
	WebDriver driver = Hooks.driver;
	public  Tree(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	public void Tpagelogin()
	{
		Homepage hfromT = new Homepage(driver);
		hfromT.Clicksigninlnk();
		LogIn LfromT = new LogIn(driver);
		LfromT.getDatafromexcel_clickloginbtn("sheet1",1);
		hfromT.TGetstartedbtn();
	}
	public void OverviewtreesClk() {
		Overviewtrees.click();
	}
	public void TreeTryhereClk() {
		TreeTryhereBtn.click();
	}
	public void TRunBtnClk() {
		TRunBtn.click();
	}
	public void terminologieslnkClk() {
		terminologieslnk.click();
	}
	public void typesoftreesClk() {
		typesoftrees.click();
	}
	public void treetraversalsClk() {
		treetraversals.click();
	}
	public void TreeTraIllustrationClk() {
		TreeTraIllustration.click();
	}
	public void binarytreesClk() {
		binarytrees.click();
	}
	public void typesbinarytreesClk() {
		typesbinarytrees.click();
	}
	public void implementationinpythonClk() {
		implementationinpython.click();
	}
	public void BinarytreetraversalsClk() {
		Binarytreetraversals.click();
	}
	public void implementationBinarytreesClk() {
		implementationBinarytrees.click();
	}
	public void AppliBinaryTreesClk() {
		AppliBinaryTrees.click();
	}
	public void BinarySearchTreesClk() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		   WebElement element = driver.findElement(By.linkText("Binary Search Trees"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		element.click();
		//BinarySearchTrees.click();
	}
	public void implementationofBSTClk() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		   WebElement element = driver.findElement(By.linkText("Implementation Of BST"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		element.click();
		//implementationofBST.click();
	}
	public void PracticeQCLk() {
		PracticeQ.click();
	}
	
	public void Treeruncode() throws InterruptedException
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
				TRunBtn.click();
		 System.out.print("after run button");
	//	 System.out.println(QEditoroutput.getText());
		 
		 String currenturlRunbtn = driver.getCurrentUrl();
		   System.out.println(currenturlRunbtn);

	}
	
	
}
