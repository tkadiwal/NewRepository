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

public class NavigationTest {
	
	public WebDriver driver;
	
	@BeforeClass
	void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\Eclipse\\Silenium\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	
	@Test
	void logoTest() throws InterruptedException {
		
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Javatpoint");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
	}
	
	
	@AfterClass
	void tearDown() {
		
		driver.quit();
	}

}
