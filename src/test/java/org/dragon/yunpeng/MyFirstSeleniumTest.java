package org.dragon.yunpeng;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyFirstSeleniumTest extends AbstractChromeWebDriverTest {

	@Test
	public void testUMBC() {
		// get the url
		driver.get("https://umbc.edu/");

		sleep(5);
		// assert the title
		assertEquals("UMBC: University Of Maryland, Baltimore County", driver.getTitle());// First Web Application

	}

	@Test
	public void testGoogle() {
		// Get the url
		driver.get("https://www.google.com/");

		// Find the search input box
		WebElement searchInput = driver.findElement(By.cssSelector(".gLFyf.gsfi"));

		System.out.println("-------------------------------------------------------");
		System.out.println(searchInput.getAttribute("title"));
		System.out.println("-------------------------------------------------------");

		// Enter search text
		searchInput.sendKeys("Tiger");

		// Submit form
		searchInput.submit();

		sleep(5);

	}

}
