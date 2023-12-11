package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GooglePageTest {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		   driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
	}
  @Test
  public void javaSearchTest() {
	  
		driver.navigate().to("https://www.google.com/");
		System.out.println("Main title java.."+driver.getTitle());
		WebElement srcBox = driver.findElement(By.id("APjFqb"));
		srcBox.sendKeys("Java Tutorial ");
		srcBox.submit();
		Assert.assertEquals(driver.getTitle(), "Java Tutorial - Google Search");
		driver.close();
  }
  
  @Test
  public void seleniumSearchTest() {
	  
		driver.navigate().to("https://www.google.com/");
		System.out.println("Main title selenium.."+driver.getTitle());
		WebElement srcBox = driver.findElement(By.id("APjFqb"));
		srcBox.sendKeys("Selenium Tutorial ");
		srcBox.submit();
		Assert.assertEquals(driver.getTitle(), "Selenium Tutorial - Google Search");
		driver.close();
  }
  @AfterMethod
  public void tearDown() {
	  System.out.println("after method");
	 // driver.close();
  }
  }

