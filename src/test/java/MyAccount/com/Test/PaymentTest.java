package MyAccount.com.Test;

import java.io.File;
import java.io.IOException;

import org.apache.maven.surefire.shade.org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import MyAccount.com.pages.CreateNodePage;
import MyAccount.com.pages.DashboardPage;
import MyAccount.com.pages.LoginPage;
import MyAccount.com.pages.PaymentPage;
import MyAcount.com.Base.TestBaseNew;

public class PaymentTest extends TestBaseNew
{

	LoginPage lp;// login page variable
	DashboardPage Dashboard;
	CreateNodePage CreateNode;
	PaymentPage Payment;
	
	
	public PaymentTest() throws IOException
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
	
	@Test(priority=6)
	public void RecurringPayment() throws InterruptedException, IOException
	{
		Thread.sleep(10000);
		Payment = new PaymentPage();
		Payment.RecurringPayment();
		System.out.println("Successully done Recurring Payment");


	}
	@Test(priority=4)
	public void PayNow() throws InterruptedException, IOException
	{
		try {
		Thread.sleep(10000);
		Payment = new PaymentPage();
		Payment.PayNow();
		System.out.println("Successully done Pay Now");
		}
		catch(Exception e)
		{

			File scrFile = (((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE));
			FileUtils.copyFile(scrFile,
					new File("C:\\Users\\E2E\\Pictures\\Screen\\Images" + System.currentTimeMillis() + ".png"));

		}
	}
	

	@Test(priority=1)
	public void AccountStatement() throws InterruptedException, IOException
	{
		Thread.sleep(5000);
		Payment = new PaymentPage();
		Payment.AccountStatement();
		System.out.println("Successully view Account Statement section");
		
	}
	
	@Test(priority=2)
	public void SignedInvoices() throws InterruptedException, IOException {
		
		Thread.sleep(5000);
		Payment = new PaymentPage();
		Payment.SignedInvoices();
		System.out.println("Successully view Signed Invoices section");
	}
	
	@Test(priority=3, enabled=false)
	public void BankAccountDetails() throws InterruptedException, IOException {
		Thread.sleep(5000);
		Payment = new PaymentPage();
		Payment.BankAccountDetails();
		System.out.println("Successully view Bank Account Details");
		
	}

}
