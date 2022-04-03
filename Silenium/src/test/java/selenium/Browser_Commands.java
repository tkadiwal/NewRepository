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

public class Browser_Commands {
	
	public WebDriver driver;
	
	@BeforeClass
	void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\Eclipse\\Silenium\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	
	@Test
	void title() {
		
		driver.get("https://www.javatpoint.com/");
		
		String url = driver.getCurrentUrl();
		System.out.println("Current url is : " + url);
		
		String title = driver.getTitle();
		System.out.println("Title of the page is :" + title);
		
		int titleLength = driver.getTitle().length();
		System.out.println("Length of title is :" + titleLength);
	}
	
	
	
	@AfterClass
	void tearDown() {
		
		driver.quit();
	}

}
