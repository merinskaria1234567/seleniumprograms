package testngprograms;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Screenshotpgm {
	ChromeDriver driver;
	@BeforeTest
	public void setting() {
	 driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
			}
	@Test
	public void Scrrensot() throws Exception {
		//to take screenshot of whole page
	/*	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("D://error7.png"));*/
	
		//Screenshot of a web element	
		WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		File srcl = dayelement.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcl, new File("./Screenshot//Elementscreenshot.png"));
	}
}
