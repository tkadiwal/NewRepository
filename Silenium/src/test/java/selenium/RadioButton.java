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

public class RadioButton {
	
	public WebDriver driver;
	
	@BeforeClass
	void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\Eclipse\\Silenium\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	
	@Test
	void Test() throws InterruptedException {
		
		driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();

		

		/**
		 * Find radio button using ID, Validate isSelected and then click to select
		 */
		WebElement radioEle = driver.findElement(By.id("yesRadio"));
		boolean select = radioEle.isSelected();
		System.out.print(select);
		// performing click operation if element is not already selected
		if (select == false) {
			radioEle.click();
		}

		/**
		 * Find radio button using Xpath, Validate isDisplayed and click to select
		 */
		WebElement radioElem = driver.findElement(By.xpath("//div/input[@id='impressiveRadio']"));
		boolean sel = radioEle.isDisplayed();

		// performing click operation if element is displayed
		if (sel == true) {
			radioElem.click();
		}

		/**
		 * Find radio button using CSS Selector, Validate isEnabled and click to select
		 */
		WebElement radioNo = driver.findElement(By.cssSelector("input[id='noRadio']"));
		boolean selectNo = radioEle.isDisplayed();

		// performing click operation if element is enabled
		if (selectNo == true) {
			radioNo.click();
		}

	}
		
	
	
	@AfterClass
	void tearDown() {
		
		driver.quit();
	}

}
