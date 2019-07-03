package MyAccount.com.Test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import MyAccount.com.pages.CreateNodePage;
import MyAccount.com.pages.LoginPage;
import MyAccount.com.pages.ProfileUpdate;
import MyAcount.com.Base.TestBaseNew;

public class ProfileUpdateTest extends TestBaseNew{
	
	LoginPage lp;// login page variable
	//DashboardPage Dashboard;
	CreateNodePage CreateNode;
	//Appliancepage Appliance;
	ProfileUpdate Prof;
	public ProfileUpdateTest() throws IOException {
		super();
	}
	
	@BeforeClass(timeOut=50000)
		public void setUp() throws IOException, InterruptedException {
			//inititalization();
			lp=new LoginPage();
			CreateNode=lp.login(prop.getProperty("username"),prop.getProperty("password"));
			//CreateNode = new CreateNodePage();// login page constructor for creating object
			//CreateNode.createnode();
		}
		@Test
		public void updatepro() throws Exception {
			Prof = new ProfileUpdate();
			Prof.proupdate();
			Prof.update();
			

		}
		  @AfterMethod
		  public void afterTest() {
		      driver.quit();
		      driver = null; 
		  }



}
