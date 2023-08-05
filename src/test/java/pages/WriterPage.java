package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import drivers.PageDriver;
import utilities.CommonMethods;

public class WriterPage extends CommonMethods {

	public WriterPage() throws InterruptedException {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		Thread.sleep(3000);
	}

	@FindBy(xpath = "//a[@id='js--authors']")
	WebElement writterOption;
	@FindBy(xpath = " //a[contains(text(),'তামিম শাহরিয়ার সুবিন')]")
	WebElement writterName;
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
	WebElement logo;
	@FindBy(xpath = "//p[contains(text(),'Filter')]")
	WebElement filter;
	@FindBy(xpath = "//p[contains(text(),'Publishers')] ")
	WebElement publisherfilter;
	@FindBy(xpath = "//label[contains(text(),'কম্পিউটার প্রোগ্রামিং')]")
	WebElement computerBook;
	@FindBy(xpath = "//label[contains(text(),'রকমারি কালেকশন')]")
	WebElement publisher;
	@FindBy(xpath = "//body/div[7]/div[1]/div[1]/div[1]/section[2]/div[2]/div[1]/div[2]/div[1]/a[1]")
	WebElement hoverBook;
	@FindBy(xpath = "//body/div[7]/div[1]/div[1]/div[1]/section[2]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]")
	WebElement bookDetails;
	@FindBy(xpath = "//body/div[8]/section[1]/section[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/a[2]/span[1]/img[1]")
	WebElement addCart;
	@FindBy(xpath = "//a[@id='js-continue-to-shipping']")
	WebElement placeOrder;

	public void writterTest() {

// Hover on Writer Option
		try {
			if (writterOption.isDisplayed()) {
				Actions action = new Actions(PageDriver.getCurrentDriver());
				action.moveToElement(writterOption).perform();
				sleep(3000);

			}
		} catch (Exception e) {
			System.out.println(e);
		}

// Writer Name

		try {
			if (writterName.isDisplayed()) {
				writterName.click();
				sleep(3000);

			}
		} catch (Exception e) {
			System.out.println(e);
		}

// Scroll to filter

		try {
			if (filter.isDisplayed()) {
				JavascriptExecutor js = (JavascriptExecutor) PageDriver.getCurrentDriver();
				js.executeScript("arguments[0].scrollIntoView();", filter);
				sleep(3000);

			}

		} catch (Exception e) {
			System.out.println(e);
		}

// Filter: Computer Book

		try {

			if (!computerBook.isSelected()) {
				computerBook.click();
				sleep(3000);

			}

		} catch (Exception e) {
			System.out.println(e);
		}
// Scroll to publisher

		try {
			if (filter.isDisplayed()) {
				JavascriptExecutor js = (JavascriptExecutor) PageDriver.getCurrentDriver();
				js.executeScript("arguments[0].scrollIntoView();", filter);
				sleep(3000);

			}

		} catch (Exception e) {
			System.out.println(e);
		}
// Filter Publisher

		try {
			if (!publisher.isSelected()) {
				publisher.click();
				sleep(3000);

			}

		} catch (Exception e) {
			System.out.println(e);
		}
		// Scroll to filter

		try {
			if (filter.isDisplayed()) {
				JavascriptExecutor js = (JavascriptExecutor) PageDriver.getCurrentDriver();
				js.executeScript("arguments[0].scrollIntoView();", filter);
				sleep(3000);

			}

		} catch (Exception e) {
			System.out.println(e);
		}
//Hover on Book		
		try {
			if (hoverBook.isDisplayed()) {
				Actions action = new Actions(PageDriver.getCurrentDriver());
				action.moveToElement(hoverBook).perform();
				sleep(3000);
			}
			
			if (bookDetails.isDisplayed()) {
				bookDetails.click();
				sleep(3000);

			}

		} catch (Exception e) {
			System.out.println(e);
		}

//// view Details
//		try {
//			if (bookDetails.isDisplayed()) {
//				bookDetails.click();
//				sleep(3000);
//
//			}
//
//		} catch (Exception e) {
//			System.out.println(e);
//		}
// Go to cart 
		try {
			if (addCart.isDisplayed()) {
				addCart.click();
				sleep(3000);

			}

		} catch (Exception e) {
			System.out.println(e);
		}
//Place order 		
		try {
			if (placeOrder.isDisplayed()) {
				placeOrder.click();
				sleep(3000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
