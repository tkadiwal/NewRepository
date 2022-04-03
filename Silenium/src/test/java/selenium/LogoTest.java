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

public class LogoTest {
	
	public WebDriver driver;
	
	@BeforeClass
	void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\Eclipse\\Silenium\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	
	@Test
	void logoTest() throws InterruptedException {
		
		
		driver.get("https://www.google.com/");
		
		WebElement logo  =  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
		Assert.assertTrue(logo.isDisplayed());
		Thread.sleep(500);
	}
	
	@Test
	void homePageTitle() throws InterruptedException {
		
		driver.get("https://www.google.com/");
		
		Assert.assertEquals(driver.getTitle(), "Google");
		Thread.sleep(500);
	}
	
	@AfterClass
	void tearDown() {
		
		driver.quit();
	}

}
