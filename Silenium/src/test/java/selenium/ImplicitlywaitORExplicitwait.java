package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlywaitORExplicitwait {
	
	RemoteWebDriver driver;
	
	@BeforeClass
	void setup() {
		
		//WebDriverManager.chromedriver().browserVersion("51.0.2704").setup();
		WebDriverManager.firefoxdriver().setup();
		
		//driver = new ChromeDriver();
		driver = new FirefoxDriver();
		
		//implcite wait syntax
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@AfterClass
	void teardown() {
		driver.quit();
	}
	
	@Test
	void test() {
		
		driver.get("https://www.google.com/");
		
		//Explicite wait syntax
		WebDriverWait wait = new WebDriverWait(driver, 20 );
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abc")));
	}
	

}
