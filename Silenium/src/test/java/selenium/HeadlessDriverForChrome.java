package selenium;

import org.openqa.selenium.By.ByName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HeadlessDriverForChrome {
	
	private WebDriver driver;
	
	@BeforeClass
	void setUp() {		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\Eclipse\\Silenium\\drivers\\chromedriver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		driver = new ChromeDriver(options);

	}
	
	@Test
	void test_by_name() {
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();  
		
		driver.findElement(By.name("q")).sendKeys("Facebook.com");
		
		driver.findElement(By.name("q")).clear();
		
		driver.findElement(By.name("q")).sendKeys("Cnbc.com");
		
		driver.findElement(By.name("btnK")).click();
		
	}
	
	@AfterClass
	void teardown() {
		
		driver.quit();
	}

}
