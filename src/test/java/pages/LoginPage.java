package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import drivers.PageDriver;
import utilities.CommonMethods;

public class LoginPage extends CommonMethods {

	public LoginPage() {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
	}
	
	@FindBy(xpath = "//body/div[@id='login-registration']/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/button[2]")WebElement  googleBytton ;
	
	public void loginPage() {
		try {
			if(googleBytton.isDisplayed()) {
				googleBytton.click();
				sleep(3000);
			}
	}catch(Exception e) {
		System.out.println(e);
	}
	
}
	
}
