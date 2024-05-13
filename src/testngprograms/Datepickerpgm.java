package testngprograms;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;

public class Datepickerpgm {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url() {
		driver.get("https://www.trivago.com");
		driver.manage().window().maximize();
		
	}
	@Test
	public void testing() {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[1]/fieldset/button[1]")).click();
		while(true) {
		WebElement month=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3"));
		String month1=month.getText();
		if(month1.equals("May 2024")) {
			System.out.println(month);
			break;
		}
		else {
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]/span")).click();
		    }
		}
		List<WebElement> alldate1 = driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[2]/div[2]/button/time"));	
		for(WebElement dateelement:alldate1) {
			String date=dateelement.getText();
				System.out.println(date);
				if(date.equals("24")) {
					System.out.println(date);
					dateelement.click();
					System.out.println("date selected");
					break;
				}
			}
	}
	

}
