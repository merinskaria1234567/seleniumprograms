package testngprograms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testngnew {
@Test
public void setup() {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
}
}