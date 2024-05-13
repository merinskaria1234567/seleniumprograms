package seleniumpackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitprogram {
ChromeDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void titleverification() {
		 String title=driver.getTitle();
		 System.out.println(title);
		 String exp="Google";
		 if(title.equals(exp)) {
			 System.out.println("pass");
		 }
		 else {
			 System.out.println("fail");
		 }
	}
	@After
	public void browserclose() {
		//driver.close();
		driver.quit();
	}
}
