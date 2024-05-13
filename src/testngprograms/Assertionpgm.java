package testngprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertionpgm {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading() {
		driver.get("https://www.facebook.com");
	}
	@Test
	public void test1() {
		String actual=driver.getTitle();
		String expected="www.facebook.com";
		/*Soft assert
		 * if(actual.equalsIgnoreCase(expected)) {
			System.out.println("pass");}
		else {
			System.out.println("fail");
		}
		System.out.println("haiii");*/
		//Hard  Assert
		Assert.assertEquals(actual, expected);
		System.out.println("title");
	}

}
