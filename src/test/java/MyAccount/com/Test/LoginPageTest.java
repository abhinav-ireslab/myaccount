package MyAccount.com.Test;


import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import MyAccount.com.pages.CreateNodePage;
import MyAccount.com.pages.DashboardPage;

import MyAccount.com.pages.LoginPage;
import MyAcount.com.Base.TestBaseNew;



public class LoginPageTest extends TestBaseNew{
	LoginPage lp;//login page variable
	DashboardPage Dashboard;
	CreateNodePage CreateNode;

	
	public LoginPageTest() throws IOException {
		super();
	}
	@BeforeClass
	public void setUp() throws IOException{
		//inititalization();
		
	lp=new LoginPage();//login page constructor for creating object
	}
	/*@Test(priority=1)
	public void loginPageTitleTest(){
		String title = MyAccount.com.pages.LoginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "");
	}*/
	
	 /*@Test()
	public boolean validatee2elogotest(){
		 Reporter.log("\n Verify to create node on CentOS server with existing user"+"\n", true);
		boolean flag = lp.validatee2elogo();
		Assert.assertTrue(flag);
		return flag;
	}
	
	/*@Test(priority=2)
	public void loginTest(){
		homePage = MyAccount.com.pages.LoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}*/
	
	@Test(priority=1)
    public void login() throws IOException{
		 CreateNode=lp.login(prop.getProperty("username"),prop.getProperty("password"));
	
		
         
    }
	
	/*@AfterMethod
	public void tearDown(){
		driver.quit();
	}*/
	
	

	
	
		
		
	

}
