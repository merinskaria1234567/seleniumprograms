package testngprograms;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignmentrishiherbalsite {
	ChromeDriver driver;
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://rishiherbalindia.linker.store/");
	}
	@Test
	public void assignment() throws InterruptedException, Exception {
		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Herbal agro Growth Booster");

		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[1]/a")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[1]/input")).sendKeys("206merinskaria@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[2]/input")).sendKeys("Abcd@123");
		driver.findElement(By.name("i_agree_tnc")).click();
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/button")).click();
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[1]/button/span")).click();
		//login
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[2]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[1]/input")).sendKeys("206merinskaria@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[2]/input")).sendKeys("Abcd@123");
		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/button[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);

		//search bar
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebElement d=driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
		//d.sendKeys("Herbal agro Growth Booster");
		try {
			d.sendKeys("Herbal agro Growth Booster");
		}
		catch(StaleElementReferenceException e) {
			 d=driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
			d.sendKeys("Herbal agro Growth Booster");
		}
		driver.findElement(By.xpath("//*[@id=\"searchDDWrp\"]/ul/div[4]/div/div/li[1]/div/div[2]/div/a")).click();
	driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[4]/a")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	
	
	/*WebDriverWait wait = new WebDriverWait (driver,  Duration.ofSeconds(30)); // 10-second explicit wait

    try {
     // driver.get("https://example.com");

      // Wait until the element is visible and interactable
      WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"content\\\"]/div[3]/div[1]/div/div/div[1]/div/div[2]/div[2]/ul/li[1]/button/span")));

      // Perform actions on the element
      button.click();} 
    catch (ElementNotInteractableException e) {
          System.out.println("Element not intractable: " + e.getMessage());
      }
	*/
	driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/div[2]/div[2]/ul/li[1]/button/span")).click();
	//
	driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a")).click();

	driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a")).click();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,250)", "");
	driver.findElement(By.xpath("//html/body/div/footer/div[1]/div/div[2]/div[2]/div/ul/li[2]/a")).click();
	
	//Screenshot
	WebElement dayelement=driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[4]/div/ul/li[1]/a"));
	File srcl = dayelement.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(srcl, new File("./Screenshot//Assignmentshot.png"));
	//Response code
	URL ob=new URL("https://rishiherbalindia.linker.store/");
		HttpURLConnection con=(HttpURLConnection)ob.openConnection();
	int code=con.getResponseCode();
	System.out.println(code);
	con.connect();
	
	}

}
