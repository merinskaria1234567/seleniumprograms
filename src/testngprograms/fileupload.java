package testngprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fileupload {
	ChromeDriver driver;
	@BeforeTest
	public void setup() {
		 driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
}
	@Test
	public void fileuploadd() {
		WebElement element=driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
		element.sendKeys("D:\\Merin.pdf");
		
		
		
	}
}