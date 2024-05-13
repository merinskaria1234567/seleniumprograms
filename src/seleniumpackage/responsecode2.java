package seleniumpackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class responsecode2 {
	ChromeDriver driver;
	String baseurl="https://www.google.com";
	@Before
	public void set() {
		
		driver=new ChromeDriver();
		driver.get(baseurl);
		
	}
	@Test
	public void linktest() throws Exception {
		URL ob=new URL(baseurl);
		HttpURLConnection con=(HttpURLConnection)ob.openConnection();//type casting
	con.connect();//connection code
	if(con.getResponseCode()==200) {
		System.out.println("valid url");
	}
	else {
		System.out.println("invalid url");
	}
	}

}
