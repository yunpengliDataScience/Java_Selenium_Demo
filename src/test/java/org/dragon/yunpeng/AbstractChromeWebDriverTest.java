package org.dragon.yunpeng;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class AbstractChromeWebDriverTest {

	protected WebDriver driver;

	public AbstractChromeWebDriverTest() {
		super();
	}

	@Before
	public void beforeTest() {
		//Download the web driver executable
		WebDriverManager.chromedriver().setup();
		
		//Create a instance of your web driver - chrome
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

}