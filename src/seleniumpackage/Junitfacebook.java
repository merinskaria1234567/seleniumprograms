package seleniumpackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitfacebook {
		ChromeDriver driver;
		
		@Before
		public void  setup() {
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
		}
		@Test
		public void titleverification() {
			String title=driver.getTitle();
			 System.out.println(title);
			 String exp="Facebook";
			 if(title.equals(exp)) {
				 System.out.println("pass");
			 }
			 else {
				 System.out.println("fail");
			 }
		}
		@Test
		public void titleandcontentverification() {
			 String title=driver.getTitle();
			 System.out.println(title);
			 String source=driver.getPageSource();
			 if(source.contains("Facebook") )
			 	{
				 System.out.println("pass");
			 	}
			 else {
				 System.out.println("Fail");
			 }
			
		}
		@After
		public void browserclose() {
			driver.quit();
		}
}