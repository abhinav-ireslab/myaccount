package MyAccount.com.pages;

import java.io.IOException;


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

	@FindBy(xpath = "//a[@href='/configuration?selected_host=&template_id=1442&template_name=Ubuntu-14.04']//div[@class='customCard osCard Ubuntu']")
	WebElement centos75;
	
	@FindBy(xpath = "//*[@class='customCard planCard undefined']")
	WebElement SelectPlanCentOS75;
 
	@FindBy(xpath = "//input[@id='node_name']")
	WebElement nodename ;
	@FindBy(xpath = "//*[contains(text,'Virtual Compute Nodes Summary')]")
	WebElement nodesummary;
	
	@FindBy(xpath = "//input[@type='submit']")
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
		 mynode.click();
		 Thread.sleep(5000);
		 //driver.navigate().refresh();
		 
		 	 
	}
	public boolean validatenodestatus() {
		return DynamicNodeStatus_Running.isDisplayed();
	}
	
	}

