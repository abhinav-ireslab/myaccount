package MyAccount.com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import MyAcount.com.Base.TestBaseNew;

public class DashboardPage extends TestBaseNew
{
	@FindBy(xpath = "//html[1]/body[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/button[4]")
	WebElement terminate;

	@FindBy(xpath = "//button[contains(text(),'Terminate')]")
	WebElement Terminatepopup;

	//@FindBy(xpath = "//i[@class='fa fa-power-off']")
	@FindBy(xpath = "//html[1]/body[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/button[2]/i[1]")
	WebElement PowerOff;

	//Checkbox
	@FindBy(xpath = "//div[@id='poweroff_modal']//input[@value='on']")
	//@FindBy(xpath = "//input[@type='checkbox' and @name='poweroffnode']")
	WebElement PowerOffPopup;

	@FindBy(xpath = "//button[contains(text(),'Poweroff')]")
	WebElement POBPopup;
	
	@FindBy(xpath = "//html[1]/body[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/button[3]/i[1]")
	WebElement reboot;

	@FindBy(xpath = "//div[@class='btn btn-default refresh-span-node fa fa-repeat']")
	WebElement RefreshNode;

	@FindBy(xpath = "(//div[@class='customCard planCard undefined'])[1]")
	WebElement FirstNodeSelection;
	
	@FindBy(xpath = "button_TerminateOnPopup=(\"(//button[@type='button' and contains(.,'Terminate')])[1]\")")
	WebElement TerminateOnPopup;
	
	//Checkbox
	@FindBy(xpath = "//div[@id='reboot_modal']//input[@value='on']")
	//@FindBy(xpath = "//input[@type='checkbox' and @name='rebootnode']")
	WebElement rebootpopup;
	
	@FindBy(xpath = "//button[contains(text(),'Reboot')]")
	WebElement rebootpopupbutton;

	@FindBy(xpath = "//span[@class='title'][contains(text(),'Nodes')]")
	WebElement dashboard_node_section;
	
	@FindBy(xpath = "//p[contains(text(),'Virtual Compute Nodes Summary')]")
	WebElement validatetitle;
	
	@FindBy(xpath = "//a[@href='/'][contains(text(),'Dashboard')]")
	WebElement Dashboards;

	public DashboardPage() throws IOException

	{
		PageFactory.initElements(driver, this);
	}

	// Actions:

	@Test
	public void PowerOff() throws InterruptedException
	{

		driver.navigate().refresh();
		Thread.sleep(5000);
		PowerOff.click();
		
		Thread.sleep(5000);
		PowerOffPopup.click();
		POBPopup.click();

		Thread.sleep(5000);
		RefreshNode.click();
		System.out.println("VM Power off successfully");
	}

	@Test
	public void PowerOn() throws InterruptedException
	{
	
		Thread.sleep(5000);
		reboot.click();

		Thread.sleep(5000);
		rebootpopup.click();
		rebootpopupbutton.click();
		System.out.println("VM Power on successfully");
	}
	
	@Test
	public void Terminate() throws InterruptedException
	{

		Thread.sleep(50000);
		driver.navigate().refresh();
		Thread.sleep(50000);
		terminate.click();
		Thread.sleep(5000);
		Terminatepopup.click();
		Thread.sleep(5000);
		driver.navigate().refresh();
		System.out.println("VM Terminated successfully");
	}
	
	@Test
	public void RedirectDashboard() throws InterruptedException {
		Thread.sleep(20000);
		Dashboards.click();
		System.out.println("Redirect to dashboard successfully");
	}
	
	@Test
	public void Close() throws InterruptedException {
		Thread.sleep(20000);
		driver.close();
	}
}
