package org.dragon.yunpeng;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManualChromeWebDriverTest {

	protected WebDriver driver;

	@Before
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver",
				"src/test/resources/WebDrivers/Chrome/chromedriver_win32/chromedriver.exe");

		// Create a instance of your web driver - chrome
		driver = new ChromeDriver();
	}

	@After
	public void afterTest() {
		driver.quit();
	}

	public void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testUMBC() {
		// get the url
		driver.get("https://umbc.edu/");

		sleep(5);
		// assert the title
		assertEquals("UMBC: University Of Maryland, Baltimore County", driver.getTitle());// First Web Application

	}
}
