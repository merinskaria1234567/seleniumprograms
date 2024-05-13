package seleniumpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class containss {
	ChromeDriver driver;
	
	@Before
	public void  setup() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void facebook() {
	
		driver.findElement(By.id("email")).sendKeys("abcd");
		driver.findElement(By.id("pass")).sendKeys("avf12@");
		driver.findElement(By.xpath("//*[contains(@id,'u_0_9)]")).click();
		
	}
}
