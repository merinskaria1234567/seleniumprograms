package seleniumpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbuttonverification {
	ChromeDriver driver;
		@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
		@Test
		public void buttontextverify() {
			WebElement button=driver.findElement(By.xpath("//*[@id=\"Register\"]"));
			String buttontext=button.getAttribute("value");
					if(buttontext.equals("Create my account >>")) {
						System.out.println("Pass button ");
					}
					else {
						System.out.println("Fail button");
					}
		}
		@Test
		public void display() {
			boolean boo=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
			if(boo) {
				System.out.println("heading pass");
			}
			else {
				System.out.println("heading fail");
			}
		}
			public void testverification() {
			
			boolean b=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).isSelected();
		    if(b) {
		    	System.out.println("Selected");
		        }
		    else {
		    	System.out.println("not selected");
		    }
		    
		    boolean b1=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isSelected();
		    if(b1) {
		    	System.out.println("selected");
		    }else {
		    	System.out.println("not selected");
		    }
		}

}
