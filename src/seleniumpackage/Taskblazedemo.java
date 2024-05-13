package seleniumpackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taskblazedemo {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://blazedemo.com/register");
		
	}
	@Test
	public void test() {
		driver.findElement(By.id("name")).sendKeys("abcd");
		driver.findElement(By.name("company")).sendKeys("sectorqube");
		driver.findElement(By.id("email")).sendKeys("dfndjfh@com");
		driver.findElement(By.id("password")).sendKeys("acdf");
		driver.findElement(By.id("password-confirm")).sendKeys("acdf");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
	}
	@After
	public void exit() {
		//driver.close();
	}

}
