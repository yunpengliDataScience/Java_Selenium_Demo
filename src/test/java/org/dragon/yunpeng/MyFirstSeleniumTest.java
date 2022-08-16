package org.dragon.yunpeng;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyFirstSeleniumTest extends AbstractChromeWebDriverTest {

	@Test
	public void test() {
		// get the url
		driver.get("https://umbc.edu/");

		sleep(5);
		// assert the title
		assertEquals("UMBC: University Of Maryland, Baltimore County", driver.getTitle());// First Web Application

	}

}
