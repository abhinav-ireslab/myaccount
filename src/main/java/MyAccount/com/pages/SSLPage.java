package MyAccount.com.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import MyAcount.com.Base.TestBaseNew;

public class SSLPage extends TestBaseNew {

	public SSLPage() throws IOException {
		PageFactory.initElements(driver, this);
}


	@FindBy(xpath="//*[@id=\"sidenav-menu\"]/ul/li[4]/a")
	WebElement billing;
	@FindBy(xpath = "//*[@id=\"sidenav-menu\"]/ul/li[5]/a")
	WebElement securitypayment;

	@FindBy(xpath="//html/body/div[1]/div/ul/li[6]/ul/li[2]/a")
	//@FindBy(id = "id_first_name")
	WebElement click_ssl;
 
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div/div[1]/div/div/a/button")
	WebElement click_buynow;
	
	@FindBy(xpath="//*[@id=\"id_admin_first_name\"]")
	//@FindBy(xpath ="//*[@id=\\\"id_zip\\\"]")
	WebElement enter_first_name;
	
	@FindBy(xpath ="//*[@id=\"id_admin_last_name\"]")
	WebElement enter_last_name;
	
	@FindBy(xpath="//*[@id=\"id_admin_org_name\"]")
	WebElement Org_name;

	@FindBy(xpath="//*[@id=\"id_admin_phone\"]")
	WebElement enter_Phone;
	
	@FindBy(xpath="//*[@id=\"id_admin_email\"]")
	WebElement enter_email;
	
	@FindBy(xpath="//*[@id=\"id_admin_address\"]")
	WebElement enter_address;

	@FindBy(xpath="//*[@id=\"id_admin_city\"]")
	WebElement enter_city;
	
	@FindBy(xpath="//*[@id=\"id_admin_region\"]")
	WebElement enter_region;
	
	@FindBy(xpath="//*[@id=\"id_admin_pin_code\"]")
	WebElement enter_pincode;
	
	@FindBy(xpath="//*[@id=\"proceed\"]")
	WebElement ele;
	
	@FindBy(xpath="//*[@id=\"form2\"]/label/span")
	WebElement same_admin_contact;
	
	@FindBy(xpath="//*[@id=\"proceed\"]")
	WebElement ele1;
	
	@FindBy(xpath="//*[@id=\"id_admin_country\"]")
	WebElement select_Country;
	
public void nextbutton() {
	
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;

    jse.executeScript("arguments[0].scrollIntoView(true);",ele);
    ele.click();

	}

public void nextbutton1() {
	
	
	JavascriptExecutor jse1 = (JavascriptExecutor)driver;

    jse1.executeScript("arguments[0].scrollIntoView(true);",ele);
    ele.click();

	}
public void sslfillform() throws InterruptedException {
	driver.navigate().refresh();
	billing.click();
	Thread.sleep(3000);
	securitypayment.click();
	 Thread.sleep(3000);

	click_ssl.click();
	 Thread.sleep(3000);

	click_buynow.click();
	 Thread.sleep(3000);

	enter_first_name.sendKeys("Abhinav");
	 Thread.sleep(3000);

	enter_last_name.sendKeys("Garg");
	 Thread.sleep(2000);

	Org_name.sendKeys("e2e");
	 Thread.sleep(2000);

	enter_Phone.sendKeys("9897095008");
	 Thread.sleep(2000);
	 enter_email.sendKeys("abhinav.garg@ytopmail.com");
	 Thread.sleep(3000);
     enter_address.sendKeys("Noida");
	 Thread.sleep(2000);
	  Select drpCountry = new Select(driver.findElement(By.name("admin_country")));
	  drpCountry.selectByVisibleText("India");
    enter_city.sendKeys("Noide");
	 Thread.sleep(2000);
    enter_region.sendKeys("North");
	 Thread.sleep(2000);
    enter_pincode.sendKeys("201301");
	 Thread.sleep(2000);
	JavascriptExecutor jse = (JavascriptExecutor)driver;
    jse.executeScript("arguments[0].scrollIntoView(true);",ele);
	 //ele.click();
      ele.click();
	 Thread.sleep(2000);
	 same_admin_contact.click();
	 Thread.sleep(3000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;

	    jse1.executeScript("arguments[0].scrollIntoView(true);",ele);
	    ele.click();
	 //ele1.click();

{

}}
}
