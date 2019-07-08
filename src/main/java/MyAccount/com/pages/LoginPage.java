
package MyAccount.com.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import MyAcount.com.Base.TestBaseNew;

public class LoginPage extends TestBaseNew {

	// OR of Login Page>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	@FindBy(xpath="//input[@id='id_login']")
	WebElement username;

	@FindBy(xpath = "//input[@id='id_password']")
	WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement Signin;

	@FindBy(xpath = ("//img[@class='logoimg']"))
	WebElement logo;

	// initialising Pagefactory object
	public LoginPage() throws IOException

	{

		PageFactory.initElements(driver, this);
	}

	// Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean validatee2elogo() {
		return logo.isDisplayed();
	}

	public CreateNodePage login(String un, String pass) throws IOException {
		username.sendKeys(un);
		System.out.println(username);
		password.sendKeys(pass);
		System.out.println(password);
		Signin.click();
		return new CreateNodePage();
	}
}
