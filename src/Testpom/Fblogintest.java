package Testpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FBloginpage;

public class Fblogintest {
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url() {
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void testlogin() throws Exception{
		FBloginpage ob=new FBloginpage(driver);
		ob.setvalues("abc@gmail.com", "aabcd");
		ob.login();
	}

}
