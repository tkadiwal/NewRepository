package selenium;

import java.util.Iterator;
import java.util.Set;

import javax.xml.xpath.XPath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SimpleAlert {
	
	public WebDriver driver;
	
	@BeforeClass
	void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\Eclipse\\Silenium\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	
	@Test
	void test() throws InterruptedException {

		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		// This step will result in an alert on screen
		driver.findElement(By.id("alertButton")).click();
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
	}
	
	
	@AfterClass
	void tearDown() {
		
		driver.quit();
	}

}
