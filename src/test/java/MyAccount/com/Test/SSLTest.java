package MyAccount.com.Test;

import java.io.IOException;

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
			SSL = new SSLPage();
			SSL.sslfillform();
			SSL.nextbutton();
			SSL.nextbutton1();
			
		}
		 @AfterMethod
		  public void afterTest() {
		      driver.quit();
		      driver = null; 
		  }



	{
		

}
		}
