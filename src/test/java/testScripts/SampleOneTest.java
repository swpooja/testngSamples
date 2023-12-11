package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleOneTest {
  @Test
  public void CucumberSearchTest() {
	  WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.google.com/");
		System.out.println("Main title.."+driver.getTitle());
		WebElement srcBox = driver.findElement(By.id("APjFqb"));
		srcBox.sendKeys("Cucumber Tutorial ");
		srcBox.submit();
		System.out.println("cucumber : "+driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Cucumber Tutorial - Google Search");
		driver.close();
	  }
}
