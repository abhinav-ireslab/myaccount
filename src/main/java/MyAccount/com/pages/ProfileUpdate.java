package MyAccount.com.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import MyAcount.com.Base.TestBaseNew;

public class ProfileUpdate extends TestBaseNew
{

	public ProfileUpdate() throws IOException
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\\\"sidenav-menu\\\"]/ul/li[4]/a")
	WebElement billing;
	@FindBy(xpath = "//*[@id=\\\"sidenav-menu\\\"]/ul/li[5]/a")
	WebElement securitypayment;

	@FindBy(xpath = "//*[@id=\"sidenav-menu\"]/ul/li[4]/ul/li[4]/a")
	WebElement Profile;

	@FindBy(xpath = "//*[@id=\"id_first_name\"]")
	// @FindBy(id = "id_first_name")
	WebElement clear_text;

	@FindBy(xpath = "//*[@id=\"id_first_name\"]")
	WebElement enter_text;

	/*@FindBy(xpath = "//*[@id=\"id_zip\"]")
	// @FindBy(xpath ="//*[@id=\\\"id_zip\\\"]")
	WebElement text_clear_zip;

	@FindBy(xpath = "//*[@id=\"id_zip\"]")
	WebElement enter_zip;*/

	@FindBy(xpath = "//*[@id=\"personalDetailsButton\"]")
	WebElement ele;

	public void update()
	{

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", ele);
		ele.submit();

	}

	public void proupdate() throws InterruptedException
	{
		driver.navigate().refresh();
		//billing.click();
		//Thread.sleep(5000);
		//securitypayment.click();
		Thread.sleep(5000);
		Profile.click();
		Thread.sleep(5000);
		clear_text.clear();
		;
		Thread.sleep(5000);
		enter_text.sendKeys("Abhinav Garg");
		Thread.sleep(3000);
		/*text_clear_zip.clear();
		Thread.sleep(3000);
		enter_zip.sendKeys("110023");
		Thread.sleep(3000);*/
		ele.submit();

	}
}