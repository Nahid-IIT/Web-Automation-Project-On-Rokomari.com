package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.OrderForm;

public class OrderFormTest extends BaseDriver {

	String url2 = "https://www.rokomari.com/shipping?isgift=0";
	@BeforeClass
	public void openUrl() throws InterruptedException {
		PageDriver.getCurrentDriver().manage().window().maximize();
		PageDriver.getCurrentDriver().get(url2);
		Thread.sleep(3000);
		
	}
	
	@Test
	public void orderForm() throws InterruptedException {
		OrderForm order = new OrderForm();
		order.orderFormTest();
	}
}
