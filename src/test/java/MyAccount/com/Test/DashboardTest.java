package MyAccount.com.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.maven.surefire.shade.org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import MyAccount.com.pages.CreateNodePage;
import MyAccount.com.pages.DashboardPage;
import MyAccount.com.pages.LoginPage;
import MyAcount.com.Base.TestBaseNew;

public class DashboardTest extends TestBaseNew
{

	LoginPage lp;// login page variable
	DashboardPage Dashboard;
	CreateNodePage CreateNode;

	public DashboardTest() throws IOException
	{
		super();
	}

	@BeforeClass
	public void setUp() throws IOException, InterruptedException
	{
		// inititalization();
		lp = new LoginPage();
		CreateNode = lp.login(prop.getProperty("username"), prop.getProperty("password"));
		CreateNode = new CreateNodePage();
	}

	@Test(priority = 1)
	public void CreateNode() throws InterruptedException, IOException
	{
		CreateNode = new CreateNodePage();// login page constructor for creating object
		CreateNode.createnode();
		Thread.sleep(1000);
	}

	@Test(priority = 2)
	public void PowerOff() throws InterruptedException, IOException
	{
		try
		{
			Thread.sleep(1000);
			Dashboard = new DashboardPage();
			Dashboard.PowerOff();

		} catch (Exception e)
		{

			File scrFile = (((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE));
			FileUtils.copyFile(scrFile,
					new File("C:\\Users\\E2E\\Pictures\\Screen\\Images" + System.currentTimeMillis() + ".png"));

		}
	}

	@Test(priority = 3)
	public void PowerOn() throws InterruptedException, IOException
	{
		try
		{
			Thread.sleep(1000);
			Dashboard = new DashboardPage();
			Dashboard.PowerOn();
		} catch (Exception e)
		{

			File scrFile = (((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE));
			FileUtils.copyFile(scrFile,
					new File("C:\\Users\\E2E\\Pictures\\Screen\\Images" + System.currentTimeMillis() + ".png"));

		}

	}

	@SuppressWarnings("deprecation")
	@Test(priority = 4)
	public void Terminate() throws InterruptedException, IOException
	{
		try
		{
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, 1);
			wait.pollingEvery(1, TimeUnit.MINUTES);
			Dashboard = new DashboardPage();
			Dashboard.Terminate();
		} catch (Exception e)
		{

			File scrFile = (((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE));
			FileUtils.copyFile(scrFile,
					new File("C:\\Users\\E2E\\Pictures\\Screen\\Images" + System.currentTimeMillis() + ".png"));

		}

	}

	@Test(priority = 5,enabled=false)
	public void RedirectDashboard() throws InterruptedException, IOException
	{
		try
		{
			Dashboard = new DashboardPage();
			Dashboard.RedirectDashboard();
		} catch (Exception e)
		{

			File scrFile = (((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE));
			FileUtils.copyFile(scrFile,
					new File("C:\\Users\\E2E\\Pictures\\Screen\\Images" + System.currentTimeMillis() + ".png"));

		}

	}

}
