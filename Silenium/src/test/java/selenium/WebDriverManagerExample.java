package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerExample {
	
	RemoteWebDriver driver;
	
	@BeforeClass
	void setup() {
		
		//WebDriverManager.chromedriver().browserVersion("51.0.2704").setup();
		WebDriverManager.firefoxdriver().setup();
		
		//driver = new ChromeDriver();
		driver = new FirefoxDriver();
		
	}
	
	@AfterClass
	void teardown() {
		driver.quit();
	}
	
	@Test
	void test() {
		
		driver.get("https://www.google.com/");
	}
	

}
