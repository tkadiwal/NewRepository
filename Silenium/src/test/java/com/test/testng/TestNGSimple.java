package com.test.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGSimple {
	public WebDriver driver;

	@Test
	public void openMyBlog() {
		driver.get("https://www.softwaretestingmaterial.com/");
	}

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\Eclipse\\Silenium\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
