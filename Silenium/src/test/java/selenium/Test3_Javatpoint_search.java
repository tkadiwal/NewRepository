package selenium;

import org.openqa.selenium.By.ByName;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test3_Javatpoint_search {
	
	private WebDriver driver;
	
	@BeforeClass
	void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\Eclipse\\Silenium\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	
	@Test
	void test_by_name() {
		
		driver.get("http://www.javatpoint.com/");
		driver.manage().window().maximize();  
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("scrollBy(0,5000)");
		
		driver.findElement(By.linkText("Data Science")).click();
		
	
	}
	
	@AfterClass
	void teardown() {
		
		driver.quit();
	}

}
