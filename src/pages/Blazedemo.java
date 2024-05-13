package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Blazedemo {
	WebDriver driver;//null
	By bname=By.id("name");	
	By bcompany=By.id("company");
	By bemail=By.id("email");
	By bpassword=By.id("password");
	By bconfirmpas=By.id("password-confirm");
	By bregister =By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
	public Blazedemo(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String email,String password) {
		driver.findElement(bname).sendKeys(name);
		driver.findElement(bcompany).sendKeys(company);
		driver.findElement(bemail).sendKeys(email);
		
	}
	public void login() {
		driver.findElement(fblogin).click();
	}
}
