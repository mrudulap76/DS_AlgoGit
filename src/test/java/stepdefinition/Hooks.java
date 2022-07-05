package stepdefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {

public static WebDriver driver;
Properties prop;	
	@Before
	public void driversetup() throws IOException {
	//public WebDriver driversetup() throws IOException {
	
		prop = new Properties();
		FileInputStream fs = new FileInputStream("E:/QA_Training/JAVA/Dsalgo/src/test/resources/ConfigProperties.properties");
	//	FileInputStream fs= new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//ConfigProperties.properties");//Dynamically getting the project path
		prop.load(fs);
		String browsername = prop.getProperty("browser");
		if (browsername.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
	//	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
        driver.manage().window().maximize();
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		}
		else if(browsername.equals("firefox")) {
			driver = new FirefoxDriver();
			WebDriverManager.firefoxdriver().setup();
		}
		else if (browsername.equals("edge")) {
			driver = new EdgeDriver();
			WebDriverManager.edgedriver().setup();
		}
		else {
			System.out.println("No browser found");
		}
		
	//	String Url=prop.getProperty("url");
		//driver.get(Url);
		driver.get(prop.getProperty("homeurl"));
	}
	
	
@After
	public void teardown(Scenario scenario) {
		try {
		String scenarioname =  scenario.getName();
		String name = scenarioname.replaceAll(scenarioname, "screenshot");
		if (scenario.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot)driver;
			byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", name);
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		driver.manage().deleteAllCookies();
		driver.close();
		
	}
	


}
