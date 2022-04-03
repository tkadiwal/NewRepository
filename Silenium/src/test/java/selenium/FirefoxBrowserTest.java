package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserTest {
	
	public static void main(String[] args) {
		
		String projectpath = System.getProperty("user.dir");
		System.out.println("Project path : " + projectpath );
		
		System.setProperty("webdriver.gecko.driver", "C:\\Work\\Eclipse\\Silenium\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.ca");
		
		System.out.println(driver.getTitle());
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple phones");
		driver.findElement(By.className("nav-input")).click();
	}

}
