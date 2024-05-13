package seleniumpackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitprogram1 {
ChromeDriver driver;

@Before
public void setting() {
	driver=new ChromeDriver();
	//driver.get("https://www.google.com");
	driver.get("https://www.facebook.com");
}
/*@Test
public void inspecting() {
	driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
	driver.findElement(By.name("btnK")).click();
}
@Test
public void facebook() {
	driver.findElement(By.id("email")).sendKeys("abcd");
	driver.findElement(By.id("pass")).sendKeys("avf12@");
	driver.findElement(By.name("login")).click();
	
}*/
@Test
//using xpath
public void xxpath() {
driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("abc@gmail.com");
driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("abcdefg");
driver.findElement(By.xpath("//button[@name=\"login\"]")).click();

}

@After
public void close() {
	driver.quit();
}
	

}
