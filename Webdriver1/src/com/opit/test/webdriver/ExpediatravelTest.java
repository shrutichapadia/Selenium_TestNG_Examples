package com.opit.test.webdriver;
import java.lang.*;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExpediatravelTest {
	
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.expedia.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		WebElement flighttab = driver.findElement(By.id("tab-flight-tab"));
		flighttab.click();
	
		System.out.println("hiiiiiiiii");
		WebElement flightfrom = driver.findElement(By.id("flight-origin"));
		flightfrom.sendKeys("SFO");
		WebElement flightto = driver.findElement(By.id("flight-destination"));
		flightto.sendKeys("LON");

		WebElement flightdate = driver.findElement(By.id("flight-departing"));
		flightdate.click();
		
	}

}
