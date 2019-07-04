package MyAccount.com.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import MyAccount.com.pages.APIPage;
import MyAccount.com.pages.CreateNodePage;
import MyAccount.com.pages.DashboardPage;
import MyAccount.com.pages.LoginPage;
import MyAcount.com.Base.TestBaseNew;

public class API extends TestBaseNew
{

	LoginPage lp;// login page variable
	DashboardPage Dashboard;
	CreateNodePage CreateNode;
	APIPage API;

	public API() throws IOException
	{
		super();
	}

	@BeforeClass
	public void setUp() throws IOException, InterruptedException
	{
//inititalization();
		lp = new LoginPage();
		CreateNode = lp.login(prop.getProperty("username"), prop.getProperty("password"));
//CreateNode = new CreateNodePage();// login page constructor for creating object
//CreateNode.createnode();

	}

	@Test(priority = 1)
	public void Generate_Token() throws IOException, InterruptedException
	{
		Thread.sleep(10000);
		APIPage API = new APIPage();
		API.Generate_token();
	}

	@Test(priority = 2)
	public void Delete_Token() throws IOException, InterruptedException
	{
		Thread.sleep(9000);
		APIPage API = new APIPage();
		API.Delete_token();
	}
	
	@Test(priority=3)
	public void Close() throws InterruptedException {
		Thread.sleep(20000);
		driver.close();
	}

}
