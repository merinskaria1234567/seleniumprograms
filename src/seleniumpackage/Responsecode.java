package seleniumpackage;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Responsecode {
	ChromeDriver driver;
	String baseurl="https://www.google.com";
	@Before
	public void set() {
		
		driver=new ChromeDriver();
		driver.get(baseurl);
		
	}
	@Test
	public void linkcount() throws Exception {
		URL ob=new URL(baseurl);
	HttpURLConnection con=(HttpURLConnection)ob.openConnection();
	int code=con.getResponseCode();
	System.out.println(code);
	con.connect();
	}

}
