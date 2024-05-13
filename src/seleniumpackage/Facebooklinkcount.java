package seleniumpackage;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklinkcount {
	ChromeDriver driver;
	
	@Before
	public void setup() {
		
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	@Test
	public void test() {
		List<WebElement>t=driver.findElements(By.tagName("a"));
		System.out.println("no of links:"+t.size());
		for(WebElement e:t) {
		String s=e.getAttribute("href");
		String text=e.getText();
		System.out.println(s+"-------"+text);

		}
		
	}
}
