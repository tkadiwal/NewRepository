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

public class PageSearchByPage {
	
	public WebDriver driver;
	
	@BeforeClass
	void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\Eclipse\\Silenium\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	
	@Test
	void test(){
		
		driver.get("https://www.google.com/");
		
		GoogleSearch.textbox_search(driver).sendKeys("javatpoint");
		
		GoogleSearch.button_search(driver).click();
	}
	

	@AfterClass
	void tearDown() {
		
		driver.quit();
	}

}
