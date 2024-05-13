package seleniumpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerttask {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
	}
	@Test
	public void testing() {
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		driver.switchTo().alert().dismiss();
		//driver.switchTo().alert().accept();
		//First approach to handle prompt
		driver.switchTo().alert().sendKeys("asdf");
		driver.switchTo().alert().accept();
		//2nd approach
		Alert pro=driver.switchTo().alert();
		pro.sendKeys("sdfg");
		pro.accept();
		//pro.dissmiss();
		
	}

}
