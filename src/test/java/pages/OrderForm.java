package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import drivers.PageDriver;

public class OrderForm {

	public OrderForm() throws InterruptedException {

		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		Thread.sleep(3000);

	}

	@FindBy(xpath = "//fieldset/input[@id= 'name']")
	WebElement name;
	@FindBy(xpath = "//fieldset/input[@id= 'phone']")
	WebElement phone;
	@FindBy(xpath = "//fieldset/input[@id= 'phone2']")
	WebElement phone2;
	@FindBy(xpath = "//select[@id='js--country']")
	WebElement country;
	@FindBy(xpath = "//select[@id='js--city']")
	WebElement city;
	@FindBy(xpath = "//select[@id='js--area']")
	WebElement area;
	@FindBy(xpath = "//fieldset/textarea[@id = 'address']")
	WebElement address;
	@FindBys({
	 @FindBy(xpath = ("//body/div[@id='shipping-payment']/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[3]/label[1]")),
	 @FindBy (xpath  =("//label[@for = 'bkash']"))
	})WebElement bkash;
	@FindBy(xpath = "//label[contains(text(),'এই শর্তগুলো মেনে অর্ডার প্রদান করছি।')]")
	WebElement condition;
	@FindBy(xpath = "//button[@value = 'Confirm Order']")
	WebElement confirmOrder;

	public void orderFormTest() {
//Name
		try {
			if (name.isDisplayed()) {
				name.clear();
				name.sendKeys("Nahidul Islma");
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
//Phone
		try {
			if (phone.isDisplayed()) {
				phone.sendKeys("01911111111");
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
//Phone2
		try {
			if (phone2.isDisplayed()) {
				phone2.sendKeys("01745654321");
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
//Country
		try {
			if (country.isDisplayed()) {
				Select select   = new Select(country);
				select.selectByIndex(0);
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
//City
		try {
			if (city.isDisplayed()) {
				Select select  = new Select(city);
				select.selectByIndex(5);
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
//Area
		try {
			if (area.isDisplayed()) {
				Select select = new Select(area);
				select.selectByIndex(3);
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

//Address
		try {
			if (address.isDisplayed()) {
				address.sendKeys("House # 23,  Road # 01, Block # D");
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
//Bkash
		try {
			if (bkash.isDisplayed()) {
				bkash.click();
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
//Conditions
		try {
			if (condition.isDisplayed()) {
				condition.click();
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
//Confirm Order
//		try {
//			if (confirmOrder.isDisplayed()) {
//				confirmOrder.click();
//				Thread.sleep(2000);
//			}
//		} catch (Exception e) {
//			System.out.println(e);
//		}
		
	}
}
