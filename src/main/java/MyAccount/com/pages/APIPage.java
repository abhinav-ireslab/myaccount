package MyAccount.com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import MyAcount.com.Base.TestBaseNew;

public class APIPage extends TestBaseNew
{

	// click on API
	@FindBy(xpath = "//a[@href='/apiiam/'][contains(text(),'API')]")
	WebElement api;
	// click on Create New Node
	@FindBy(xpath = "//button[contains(text(),'Create New')]")
	WebElement createtoken;
	// Open Popup and enter tokenname
	@FindBy(xpath = "/html/body/div[12]/div/div[2]/div/div/div[2]/form/div[3]/div[1]/input")
	WebElement openpopup;
	// check write capabilities
	@FindBy(xpath = "//input[@name='write']")
	WebElement checkcapabilities;
	// click on Generate Button
	@FindBy(xpath = "//button[@id='alertSave']")
	WebElement generatebutton;
	@FindBy(xpath = "//div[@class='fade in modal']//button[@type='button'][contains(text(),'Close')]")
	WebElement close;
	@FindBy(xpath = "//div[@class='api-details']//div[1]//div[4]//a[1]")
	WebElement view;

	@FindBy(xpath = "/html/body/div[12]/div/div[2]/div/div/div[1]/button/span[1]")
	WebElement cut;
	@FindBy(xpath = "//a[contains(text(),'Delete')]")
	WebElement deletetoken;

	public APIPage() throws IOException

	{
		PageFactory.initElements(driver, this);
	}

	@Test(priority=1)
	public void Generate_token() throws InterruptedException
	{
		api.click();
		Thread.sleep(5000);
		createtoken.click();
		Thread.sleep(5000);
		openpopup.sendKeys("Abhishek");
		Thread.sleep(5000);
		checkcapabilities.click();
		Thread.sleep(5000);
		generatebutton.click();
		Thread.sleep(5000);
		close.click();
		Thread.sleep(5000);
		view.click();
		Thread.sleep(5000);
		cut.click();

	}
	
	@Test(priority=2)
	public void Delete_token() throws InterruptedException
	{
		
		deletetoken.click();
		driver.navigate().refresh();
		
	}
	
}
