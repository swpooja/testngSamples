package testScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GooglePageTest {
	WebDriver driver;
	@BeforeMethod
	//@BeforeTest
	public void setup() {
		   driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
	}
  //@Test(priority=2)
	//@Test(enabled=false)
	@Test(dependsOnMethods="seleniumSearchTest")
  public void javaSearchTest() {
	  
		driver.navigate().to("https://www.google.com/");
		
		//Assert.assertEquals(driver.getTitle(), "Google1");
		//hard assert it will not execute below steps.
		System.out.println("Main title java.."+driver.getTitle());
		WebElement srcBox = driver.findElement(By.id("APjFqb"));
		srcBox.sendKeys("Java Tutorial ");
		srcBox.submit();
		Assert.assertEquals(driver.getTitle(), "Java Tutorial - Google Search");
		driver.close();
  }
//  @Test
//  public void javaSearchTest() {
//	  
//		driver.navigate().to("https://www.google.com/");
//		SoftAssert softAssert = new SoftAssert();
//		softAssert.assertEquals(driver.getTitle(),"Google1");
//		//even if assert fails it will execute below steps
//		System.out.println("Main title java.."+driver.getTitle());
//		WebElement srcBox = driver.findElement(By.id("APjFqb"));
//		srcBox.sendKeys("Java Tutorial ");
//		srcBox.submit();
//		softAssert.assertEquals(driver.getTitle(), "Java Tutorial - Google Search");
//		softAssert.assertAll();
//		driver.close();
//  }
  
  //@Test(priority=1)
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
  //@AfterTest
  public void tearDown() {
	  System.out.println("after method");
	 // driver.close();
  }
  }

