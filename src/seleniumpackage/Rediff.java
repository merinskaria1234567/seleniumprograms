package seleniumpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {
	ChromeDriver driver;
	@Before
	public void setting() {
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	@Test
	public void Fieldchecking() {
		driver.findElement(By.xpath("//table[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("abc");
		driver.findElement(By.xpath("//table[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input")).sendKeys("dfgsh");
		driver.findElement(By.xpath("//table[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).click();
	}

}
