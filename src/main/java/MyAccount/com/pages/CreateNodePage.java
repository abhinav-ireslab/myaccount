package MyAccount.com.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import MyAccount.com.pages.LoginPage;
import MyAcount.com.Base.TestBaseNew;


public class CreateNodePage extends TestBaseNew{ 

	@FindBy(xpath="//span[@class='title'][contains(text(),'Nodes')]")
	WebElement dashboard_node_section;
	//@FindBy(xpath = "//button[@class='btnNext']")
	@FindBy(xpath ="//button[contains(text(),'Create Node')]")
	WebElement createnodebutton;

	@FindBy(xpath = "//td[contains(text(),'C2.8GB-CentOS-7.5')]")
	WebElement centos75;
	
	@FindBy(xpath = "//button[contains(text(),'Create VM')]")
	WebElement SelectPlanCentOS75;
 
	@FindBy(xpath = "//*[@id=\"nodeName\"]")
	WebElement nodename ;
	@FindBy(xpath = "//*[contains(text,'Virtual Compute Nodes Summary')]")
	WebElement nodesummary;
	
	@FindBy(xpath = "//html/body/app-dashboard/div/main/div/register-node/div/div/form/div/div[10]/div/button")
	WebElement mynode;
   @FindBy(xpath = "//div[contains(text(),'Running')]")
      WebElement DynamicNodeStatus_Running;
	public CreateNodePage() throws IOException

	{
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public String validatetitle() {
		return driver.getTitle();
	}

	public boolean validatenodesummary() {
		return nodesummary.isDisplayed();
	}

	public  void createnode() throws InterruptedException {
		dashboard_node_section.click();
		//return new nodesummary();
		 Thread.sleep(5000);
		createnodebutton.click();
		 Thread.sleep(5000);
		centos75.click();
		 Thread.sleep(50000);
		SelectPlanCentOS75.click();
		 Thread.sleep(5000);
		 nodename.sendKeys("Test");
		 Thread.sleep(5000);
		try
		{
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("window.scrollBy(0,2000)");
		
		}
		catch(Exception e)
		{
			System.out.println("Not Scrolled");
		}
		 
		 mynode.click();
		 Thread.sleep(5000);
		 //driver.navigate().refresh();
		 
		 	 
	}
	private JavascriptExecutor javascriptExecutor(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean validatenodestatus() {
		return DynamicNodeStatus_Running.isDisplayed();
	}
	
	}

