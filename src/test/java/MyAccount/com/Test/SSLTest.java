package MyAccount.com.Test;

import java.io.File;
import java.io.IOException;

import org.apache.maven.surefire.shade.org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import MyAccount.com.pages.CreateNodePage;
import MyAccount.com.pages.LoginPage;
import MyAccount.com.pages.SSLPage;
import MyAcount.com.Base.TestBaseNew;

public class SSLTest extends TestBaseNew{
	
	LoginPage lp;// login page variable
	//DashboardPage Dashboard;
	CreateNodePage CreateNode;
	//Appliancepage Appliance;
	//ProfileUpdate Prof;
	SSLPage SSL;
	public SSLTest() throws IOException {
		super();
	}
	
	@BeforeClass
     public void setUp() throws IOException, InterruptedException {
			//inititalization();
			lp=new LoginPage();
			CreateNode=lp.login(prop.getProperty("username"),prop.getProperty("password"));
			//CreateNode = new CreateNodePage();// login page constructor for creating object
			//CreateNode.createnode();
		}
		@Test
		public void sslfillformtest() throws InterruptedException, IOException {
			
			try {
				
			
			//Thread.sleep(20000);
			SSL = new SSLPage();
			SSL.sslfillform();
			SSL.nextbutton();
			SSL.nextbutton1();
			
		}
		
		catch(Exception e)
		{

			File scrFile = (((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE));
			FileUtils.copyFile(scrFile,
					new File("C:\\Users\\E2E\\Pictures\\Screen\\Images" + System.currentTimeMillis() + ".png"));

		}
		
}
		}
