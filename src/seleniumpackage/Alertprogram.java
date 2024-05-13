package seleniumpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertprogram {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/OneDrive/Documents/alertprogram.html");
		
	}
	@Test
	public void Buttonverify() {
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		//driver.switchTo().alert().dismiss();
		Alert a=driver.switchTo().alert();
		String actualtext=a.getText();
		System.out.println(actualtext);
		if(actualtext.equals("hello i am "))
		{
			System.out.println("PaSS");
		}
		else {
			System.out.println("FaiLL");
		}
		a.accept();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("acdfg");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("ghyt");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
	}

}
