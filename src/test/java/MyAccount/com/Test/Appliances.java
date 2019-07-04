package MyAccount.com.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import MyAccount.com.pages.Appliancepage;
import MyAccount.com.pages.CreateNodePage;
import MyAccount.com.pages.DashboardPage;
import MyAccount.com.pages.LoginPage;
import MyAcount.com.Base.TestBaseNew;

public class Appliances extends TestBaseNew
{

	LoginPage lp;// login page variable
	DashboardPage Dashboard;
	CreateNodePage CreateNode;
	Appliancepage Appliance;

	public Appliances() throws IOException
	{
		super();
	}

	@BeforeClass
	public void setUp() throws IOException, InterruptedException
	{
		// inititalization();
		lp = new LoginPage();
		CreateNode = lp.login(prop.getProperty("username"), prop.getProperty("password"));
		// CreateNode = new CreateNodePage();// login page constructor for creating
		// object
		// CreateNode.createnode();
	}

	@Test(priority=1)
	public void Create_Appliance() throws InterruptedException, IOException
	{
		Thread.sleep(10000);
		Appliancepage Appliance = new Appliancepage();
		Appliance.CreateAppliance();

	}
	
	@Test(priority=2)
	public void Terminate_Appliance() throws IOException, InterruptedException
	{
		
		Thread.sleep(20000);
		Appliancepage Appliance = new Appliancepage();
		Appliance.TerminateAppliances();
	}
	
	@Test(priority=3)
	public void Close() throws InterruptedException {
		Thread.sleep(20000);
		driver.close();
	}
	

}
