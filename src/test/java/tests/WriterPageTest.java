package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.WriterPage;

public class WriterPageTest extends BaseDriver {

	@BeforeClass
	public void openUrl() throws InterruptedException {
		PageDriver.getCurrentDriver().manage().window().maximize();
		PageDriver.getCurrentDriver().get(url);
		Thread.sleep(3000);
	}

	@Test
	public void Test() throws InterruptedException {
		WriterPage writer = new WriterPage();
		writer.writterTest();

	}
}
