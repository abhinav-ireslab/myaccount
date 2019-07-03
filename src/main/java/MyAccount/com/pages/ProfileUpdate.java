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

	@FindBy(xpath = "//*[@id=\"sidenav-menu\"]/ul/li[2]/a")
	WebElement payment_metthod;
	@FindBy(xpath = "//*[@id=\"sidenav-menu\"]/ul/li[3]/a")
	WebElement Infra;

	@FindBy(xpath = "//*[@id=\"sidenav-menu\"]/ul/li[5]/ul/li[1]/a")
	WebElement Profile;

	@FindBy(xpath = "//*[@id=\"id_first_name\"]")
	// @FindBy(id = "id_first_name")
	WebElement clear_text;

	@FindBy(xpath = "//*[@id=\"id_first_name\"]")
	WebElement enter_text;

	@FindBy(xpath = "//*[@id=\"id_zip\"]")
	// @FindBy(xpath ="//*[@id=\\\"id_zip\\\"]")
	WebElement text_clear_zip;

	@FindBy(xpath = "//*[@id=\"id_zip\"]")
	WebElement enter_zip;

	@FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/form/div[2]/div/div[2]/button")
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
		payment_metthod.click();
		Thread.sleep(5000);
		Infra.click();
		Thread.sleep(5000);
		Profile.click();
		Thread.sleep(5000);
		clear_text.clear();
		;
		Thread.sleep(5000);
		enter_text.sendKeys("Abhinav Garg");
		Thread.sleep(3000);
		text_clear_zip.clear();
		Thread.sleep(3000);
		enter_zip.sendKeys("110023");
		Thread.sleep(3000);
		ele.submit();

	}
}