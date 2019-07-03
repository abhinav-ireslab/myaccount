package MyAccount.com.pages;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import MyAcount.com.Base.TestBaseNew;

public class PaymentPage extends TestBaseNew
{

	@FindBy(xpath = "//a[@href='/paymentdetails/'][contains(text(),'Recurring Payment')]")
	WebElement RecurringPayment;

	@FindBy(xpath = "//button[@id='pay_now_razorpay']")
	WebElement AddCard;

	@FindBy(xpath = "//*[@id=\"footer\"]/span[6]")
	WebElement PayByCard;

	@FindBy(xpath = "//*[@id=\"card_number\"]")
	WebElement CardNumber;

	@FindBy(xpath = "//*[@id=\"card_expiry\"]")
	WebElement Expiry;

	@FindBy(xpath = "//*[@id=\"card_name\"]")
	WebElement CardholderName;

	@FindBy(xpath = "//*[@id=\"card_cvv\"]")
	WebElement CVV;

	@FindBy(xpath = "//*[@id=\"footer\"]/span[2]")
	WebElement Pay;

	@FindBy(xpath = "//a[@href='/pay-now/'][contains(text(),'Pay Now')]")
	WebElement PayNow;
	
	@FindBy(xpath = "//a[@href='/invoices/'][contains(text(),'Signed Invoices')]")
	WebElement SignInvoices;
	
	@FindBy(xpath = "//a[@href='/virtual-account/'][contains(text(),'Bank Account Detail')]")
	WebElement BankAccountDetails;

	@FindBy(xpath = "//input[@id='pay_now_amount']")
	WebElement Amount;

	@FindBy(xpath = "//input[@id='this_payment']")
	WebElement PaymentCalculator;

	@FindBy(xpath = "//td[contains(text(),'Payment Amount')]")
	WebElement PaymentAmount;

	@FindBy(xpath = "//label[contains(text(),'Credits to be purchased:')]")
	WebElement Credit;

	@FindBy(xpath = "//button[@id='pay_now']")
	WebElement Paybutton;

	@FindBy(xpath = "//button[@id='pay_now_button']")
	WebElement Payment;

	@FindBy(xpath = "//*[@id=\"overlay\"]")
	WebElement Overlay;

	@FindBy(xpath = "//a[@href='/account-statement/'][contains(text(),'Account Statement')]")
	WebElement AccountStatement;

	@FindBy(xpath = "//*[@id=\"payment-options\"]/div[5]")
	WebElement QR;

	@FindBy(xpath = ".//iframe[@src='https://api.razorpay.com/v1/checkout/public']")
	WebElement popup;

	@FindBy(xpath = "//*[@id='modal-close']")
	WebElement Close;



	public PaymentPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}

	@Test
	public void RecurringPayment() throws InterruptedException
	{
		Thread.sleep(10000);
		if (driver.findElements(By.xpath("//a[@href='/paymentdetails/'][contains(text(),'Recurring Payment')]")).size() != 0)
		{
			Thread.sleep(5000);
			RecurringPayment.click();
			Thread.sleep(5000);

			AddCard.click();
			Thread.sleep(5000);
			// Alert alert = driver.switchTo().alert();
			driver.switchTo().frame(popup);
			PayByCard.click();

			Thread.sleep(5000);
			CardNumber.sendKeys("5104060000000008");
			System.out.println("CardNumber: " + CardNumber.getAttribute("value"));

			Thread.sleep(5000);
			Expiry.click();
			Expiry.sendKeys("0528");

			Thread.sleep(5000);
			CardholderName.sendKeys("Akash");

			Thread.sleep(5000);
			CVV.sendKeys("255");

			Thread.sleep(5000);
			Pay.click();
			Thread.sleep(5000);
			
			/*Alert alert = driver.switchTo().alert();
			alert.accept();*/
						
			/*Overlay.click();
			Thread.sleep(5000);
			
			Close.click();
			Thread.sleep(5000);*/
			
		} else
		{
			System.out.println("Recurring Payment Not Available.");
		}

	}

	public void PayNow() throws InterruptedException
	{
		Thread.sleep(10000);
		PayNow.click();
		Thread.sleep(5000);

		// if (Amount != null)
		if (driver.findElements(By.xpath("//input[@id='this_payment']")).size() != 0)
		{

			Thread.sleep(5000);
			PaymentCalculator.clear();
			PaymentCalculator.sendKeys(prop.getProperty("Amount"));
			Thread.sleep(5000);
			Credit.click();
			System.out.println("Credit to be purchased: " + PaymentCalculator.getAttribute("value"));
			Thread.sleep(5000);
			Paybutton.click();
			Thread.sleep(5000);
			driver.switchTo().frame(popup);
			// OR
			// driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='razorpay-checkout-frame']")));
			// Alert alert =driver.switchTo().alert();
			// alert.popup
			Thread.sleep(5000);
			QR.click();
			Thread.sleep(5000);
			Close.click();
			driver.navigate().refresh();
			
		} else
		{

			Amount.clear();
			Amount.sendKeys(prop.getProperty("Amount"));

			Thread.sleep(2000);
			PaymentAmount.click();
			System.out.println("Payment Amount: " + Amount.getAttribute("value"));

			Thread.sleep(5000);
			Payment.click();
			Thread.sleep(5000);
			driver.switchTo().frame(popup);
			// OR
			// driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class='razorpay-checkout-frame']")));
			// Alert alert =driver.switchTo().alert();
			// alert.popup
			Thread.sleep(5000);
			QR.click();
			Thread.sleep(5000);
			Close.click();
			driver.navigate().refresh();

		}

	}

	public void AccountStatement() throws InterruptedException
	{
		Thread.sleep(5000);
		AccountStatement.click();
		Thread.sleep(5000);
	}

	public void SignedInvoices() throws InterruptedException
	{
		if(driver.findElements(By.xpath("//a[@href='/invoices/'][contains(text(),'Signed Invoices')]")).size() != 0)
		{
			Thread.sleep(5000);
			SignInvoices.click();
		}
		
		
		else {
			System.out.println("Signed Invoices Not Available.");
		}
		
		}
	public void BankAccountDetails() throws InterruptedException {
		
		Thread.sleep(5000);
		BankAccountDetails.click();
	}

}
