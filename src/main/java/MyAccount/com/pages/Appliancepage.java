package MyAccount.com.pages;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import MyAcount.com.Base.TestBaseNew;

public class Appliancepage extends TestBaseNew
{
	@FindBy(xpath = "//a[@href='/appliances/dashboard/'][contains(text(),'Appliances')]")
	WebElement Appl;
	// @FindBy(xpath = "//button[@title='Poweroff']")
	// WebElement PowerOff;

	@FindBy(xpath = "//html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/h2[1]")
	WebElement ApplDashboard;
	@FindBy(xpath = "//button[@class='add-button button button-glow button-circle button-primary']")
	WebElement Applsign;

	@FindBy(xpath = "//h5[contains(text(),'FinanceCloud')]")
	WebElement FinanceCloud;
	@FindBy(xpath = "//html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]/h5[1]")
	WebElement Tally;

	@FindBy(xpath = "//input[@id='friendlyName']")
	WebElement friendlyname;

	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	@FindBy(xpath = "//input[@id='confirm-password']")
	WebElement confirmpassword;
	
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement email;
	
	@FindBy(xpath = "//button[@class='btn btn-primary appliance-button']")
	WebElement createbtn;

	@FindBy(xpath = "//a[@href='javascript:void(0);'][contains(text(),'Payment Methods')]")
	WebElement Payment;

	@FindBy(xpath = "//*[@id=\"appliance_root\"]/div/div[4]/div[1]/div/div/div[2]/table/tbody/tr[1]/td[6]/div/button")
	WebElement Terminate;
	
	@FindBy(xpath="/html/body/div[12]/div/div/div/div/button[1]")
	WebElement Yes;

	public Appliancepage() throws IOException

	{
		PageFactory.initElements(driver, this);
	}

	public void CreateAppliance() throws InterruptedException
	{

		driver.navigate().refresh();
		/*Thread.sleep(10000);
		Appl.click();*/
		Thread.sleep(5000);
		Appl.click();
		Thread.sleep(5000);
		Applsign.click();
		Thread.sleep(5000);
		FinanceCloud.click();
		Thread.sleep(5000);
		Tally.click();
		Thread.sleep(5000);
		friendlyname.sendKeys("TestApp");
		password.sendKeys("Jan@1234");
		confirmpassword.sendKeys("Jan@1234");
		email.sendKeys("abhinav.garg+postpaid@e2enetworks.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("Window.scrollBy(0,1000)");
		js.executeScript("arguments[0].scrollIntoView();", createbtn);
		createbtn.click();
		Thread.sleep(10000);
		System.out.println("Appliances Created Successfully");

	}

	public void TerminateAppliances() throws InterruptedException
	{
		if (driver.findElements(By.xpath("//*[@id=\"appliance_root\"]/div/div[4]/div[1]/div/div/div[2]/table/tbody/tr[1]/td[6]/div/button")).size() !=0)
		{
			Thread.sleep(5000);
			Terminate.click();
			
			Thread.sleep(2000);
			Yes.click();
			
			System.out.println("Appliance deleted successfully.");
		}

		else
		{
			System.out.println("No Appliances Available.");
		}
	
	}

}
