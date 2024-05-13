package seleniumpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignAmazon {
ChromeDriver driver;
@Before
public void setup() {
 driver=new ChromeDriver();
 driver.get("https://www.amazon.in/");
	}
@Test
public void testing() {
	driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles");
	driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
	driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-belt']/div[3]/div[1]/a[4]")).click();
	driver.findElement(By.xpath("//header/div[@id=\"navbar\"]/div[@id=\"nav-belt\"]/div[3]/div[1]/a[2]")).click();
	driver.findElement(By.xpath("//input[@id=\"ap_email\"]")).sendKeys("sfdhg@gmail.com");
	driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().back();
	driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]")).click();
	driver.findElement(By.xpath("//a[contains(@id,'nav-hamburger-menu')]")).click();
}
}
