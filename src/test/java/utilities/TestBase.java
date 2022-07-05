package utilities;

import java.io.IOException;
import java.util.Properties;
import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("E:/QA_Training/JAVA/Dsalgo/src/test/resources/ConfigProperties.properties");
		//	FileInputStream fis = new FileInputStream(System.getProperty(("user.dir")+"//src//test//resources//ConfigProperties.properties"));
			prop.load(fis);
		}
		catch (IOException ex) {
			ex.getMessage();
		}
	}
		public static void driversetup()
		{
			String browsername = prop.getProperty("browser");
			if (browsername.equals("chrome")) 
				{
				WebDriverManager.chromedriver().setup();
		//	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
				driver = new ChromeDriver();
				}
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
			
		   // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));et
	       // driver.get(prop.getProperty("url"));
	        //driver.findElement(By.xpath("//button[@class='btn']")).click();
	        
	        driver.get(prop.getProperty("homeurl"));
	        driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
	        
	        
		}
}
		
	

