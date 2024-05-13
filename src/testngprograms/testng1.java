package testngprograms;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testng1 {
@BeforeTest
	public void setup() {
		System.out.println("browseropen");
	}	
@BeforeMethod
	public void urlloading() {
		System.out.println("urlload");
		}
@Test
	public void test() {
		System.out.println("test");
	}
@Test
	public void test1(){
		System.out.println("test1");
	}
@Test
	public void test2() {
		System.out.println("test2");
	}
@AfterMethod
	public void report() {
		System.out.println("aftermethod");
	}
@AfterTest
	public void browserclose() {
		System.out.println("browserclose");
	}
}
