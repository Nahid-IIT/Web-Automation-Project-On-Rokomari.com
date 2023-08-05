package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.LoginPage;

public class LoginTest extends BaseDriver {

	@BeforeClass
	public void openUrl() throws InterruptedException {
		 
		PageDriver.getCurrentDriver().manage().window().maximize();
		PageDriver.getCurrentDriver().get(url);
		Thread.sleep(3000);
	}
	
	
	@Test
	public void loginTest() {
		
		LoginPage login = new LoginPage();
		login.loginPage();
	
	}
	
}
