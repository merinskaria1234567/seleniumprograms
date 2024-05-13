package testngprograms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Taskamazonsite {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading() {
		driver.get("https://www.amazon.in/");
	}
	@Test
	public void testing() {
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile phones");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		String actual=driver.getTitle();
		String expected="Amazon.in : mobile phones";
		Assert.assertEquals(actual, expected);
		System.out.println("title");
		driver.manage().window().maximize();
		String parentwindow=driver.getWindowHandle();
		System.out.println("parent window title"+driver.getTitle());
		  driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();

		Set<String> allWindowHandles = driver.getWindowHandles();
		  
	  	  for(String handle:allWindowHandles) {
	  		  System.out.println(handle);
	  		  if(!handle.equalsIgnoreCase(parentwindow)) {
	  			  driver.switchTo().window(handle);
	  			
	  			  driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[8]/div[8]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[38]/div[1]/span/span/span/input")).click();
	  			  driver.findElement(By.xpath("//*[@id=\"nav-cart-count-container\"]/span[2]")).click();
	  			  
	  		  }
	  	  }
	  	  }
	

}
