package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Work\\\\Eclipse\\\\Silenium\\\\drivers\\\\chromedriver\\\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.ca");
		
	System.out.println(driver.getTitle());
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple phones");
	driver.findElement(By.className("nav-input")).click();

		}
		
		
 	}

