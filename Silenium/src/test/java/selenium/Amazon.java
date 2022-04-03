package selenium;

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
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.Keys;
	import java.util.*;
	import java.net.MalformedURLException;
	import java.net.URL;
	
	public class Amazon {
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
	  @Test
	  public void amazon() {
	    driver.get("https://www.amazon.ca/");
	    driver.manage().window().setSize(new Dimension(1382, 744));
	    {
	      WebElement element = driver.findElement(By.cssSelector(".\\_cropped-image-map_style_image-map__12oiu > a"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.linkText("Best Sellers")).click();
	    {
	      WebElement element = driver.findElement(By.linkText("Best Sellers"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    
	    driver.findElement(By.cssSelector("#anonCarousel1 .a-carousel-card:nth-child(1) .p13n-sc-truncate-desktop-type2")).click();
	    driver.findElement(By.id("add-to-cart-button")).click();
	    driver.close();
	  }
	}


