package MyAcount.com.Base;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import MyAccount.com.Util.TestUtil;

import java.util.*;


public class TestBaseNew {
	
		public static WebDriver driver;
		public static Properties prop;

		
		public TestBaseNew() throws IOException{
		try {	
		    prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\E2E\\eclipse-workspace\\AutomationE2E\\src\\main\\java\\MyAccount\\com\\Config\\config.properties");
			prop.load(ip);
			String browserName = prop.getProperty("browser");
			System.out.println("Browser Name: "+browserName);
		}
		catch(FileNotFoundException e) {
		e.printStackTrace(); 		
	     }
		catch(IOException e) {
		e.printStackTrace();
	     }

		
	}
		@BeforeTest
		public static void inititalization() {
			//System.out.println("Intialization");
			String browserName = prop.getProperty("browser");
			
			String os = System.getProperty("os.name").toLowerCase();
			if (os.contains("win")){
    //Operating system is based on Windows
				System.setProperty("webdriver.gecko.driver","C:\\Users\\E2E\\eclipse-workspace\\AutomationE2E\\Drivers\\geckodriver.exe");
				driver = (WebDriver) new FirefoxDriver();
			}
			//else if (os.contains("osx")){
    //Operating system is Apple OSX based
			//}      
			else if (os.contains("nix") || os.contains("aix") || os.contains("nux")){
    //Operating system is based on Linux/Unix/*AIX
				System.setProperty("webdriver.gecko.driver","C://Users//E2E//eclipse-workspace//AutomationE2E//Drivers//geckodriver.exe");
				driver = (WebDriver) new FirefoxDriver();
			
			//System.out.println("Browser Name: "+browserName);
			/*if(browserName.equals("Firefox")) {
				//System.out.println("Browser Name: "+browserName);
				System.setProperty("webdriver.gecko.driver","C:\\Users\\E2E\\eclipse-workspace\\AutomationE2E\\Drivers\\geckodriver.exe");
			driver = (WebDriver) new FirefoxDriver();
			//System.out.println("Launch Firefox");
			}else if (browserName.equals("chrome")){
				System.setProperty("webdriver.chrome.driver","C:\\Users\\E2E\\eclipse-workspace\\AutomationE2E\\Drivers\\chromedrive.exe");
				driver = (WebDriver) new ChromeDriver();
*/			}
		
		//driver.manage().window().maximize();
		Dimension d = new Dimension(1550,800); 
		//Resize the current window to the given dimension
		driver.manage().window().setSize(d); 
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS); 
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		
		}
		
		
	}



