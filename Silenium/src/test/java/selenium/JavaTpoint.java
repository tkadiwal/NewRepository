package selenium;

	// Generated by Selenium IDE
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.remote.RemoteWebDriver;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.Dimension;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.Keys;
	import java.util.*;
	import java.net.MalformedURLException;
	import java.net.URL;
	public class JavaTpoint {
		
	  private WebDriver driver;
	  private Map<String, Object> vars;
	  
	  @BeforeClass
	  public void setUp() {
	    driver = new ChromeDriver();
	    vars = new HashMap<String, Object>();
	  }
	  @AfterClass
	  public void tearDown() {
	    driver.quit();
	  }
	  @org.testng.annotations.Test
	  public void javatpoint() {
	    driver.get("https://www.javatpoint.com/");
	    driver.manage().window().setSize(new Dimension(1382, 744));
	    driver.findElement(By.linkText("Java")).click();
	    driver.findElement(By.linkText("Java If-else")).click();
	    {
	      WebElement element = driver.findElement(By.linkText("Spring Boot"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.close();
	  }
	}
