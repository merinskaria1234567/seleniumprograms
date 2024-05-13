package seleniumpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
//String tit=driver.getTitle();
String source=driver.getPageSource();
System.out.println(source);
//System.out.println(tit);
//String exp="Google";

if(source.contains("Gmail")) 
{
	System.out.println("pass");
}
/*if(tit.equals(exp)) {
	System.out.println("pass");
}*/
else {
	System.out.println("fail");
}
	}

}
