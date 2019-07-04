package MyAccount.com.Test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import MyAccount.com.pages.CreateNodePage;
import MyAccount.com.pages.DashboardPage;
import MyAccount.com.pages.LoginPage;
import MyAcount.com.Base.TestBaseNew;



public class CreateNodePageTest extends TestBaseNew {
	LoginPage lp;// login page variable
	DashboardPage Dashboard;
	CreateNodePage CreateNode;

	public CreateNodePageTest() throws IOException {
		super();
	}

	@BeforeClass
	public void setUp() throws IOException {
		//inititalization();
		lp=new LoginPage();
		CreateNode=lp.login(prop.getProperty("username"),prop.getProperty("password"));
		//CreateNode = new CreateNodePage();// login page constructor for creating object
	}

	
	@Test
	public void createnode() throws InterruptedException {
		CreateNode.createnode();

	}
	
	@Test
	public void Close() throws InterruptedException {
		Thread.sleep(20000);
		driver.close();
	}

}
