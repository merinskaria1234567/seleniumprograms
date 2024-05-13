package testngprograms;

import java.time.Duration;

import org.hamcrest.StringDescription;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fileuploadrobot {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@BeforeMethod
	public void urlloading() {
		driver.get("https://www.ilovepdf.com/pdf_to_word");
	}
	@Test
	public void test() throws Exception{
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		fileUpload("\"D:\\Merin RESUME2023.pdf\"");
	}
	public void fileUpload(String p)throws AWTException{
		//to copy path to clipboard
		StringSelection strSelection=new StringDescription(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection,null);
		//to paste into sysmwindow
		Robot robot=new Robot();
		robot.delay(3000);
	
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		//Thread.sleep(5000);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
