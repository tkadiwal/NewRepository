package selenium;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageforselenium.GoogleSearch;
import pageforselenium.GoogleSearchPageObjectPage;

public class GoogleSearchPageObject {
	
	public WebDriver driver;
	
	@BeforeClass
	void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\Eclipse\\Silenium\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	
	@Test
	void test() throws InterruptedException{
		
		
		GoogleSearchPageObjectPage searchObj = new GoogleSearchPageObjectPage(driver);
		
		driver.get("https://www.google.com/");
		
		searchObj.setTextInSearchBox("A B C D");
		searchObj.clickSearchButton();
		
		Thread.sleep(500);
	}
	

	@AfterClass
	void tearDown() {
		
		driver.quit();
	}

}
