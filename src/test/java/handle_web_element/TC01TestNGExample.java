package handle_web_element;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC01TestNGExample {
	@Test	
	public void textcase1() {
		System.out.println("this is testcase 1");
		
	}
	@Test	
	public void textcase2() {
		System.out.println("this is testcase 2");
		
	}
	@BeforeSuite	
	public void textcaseforbeforesuite() {
		System.out.println("this is testcase for before suite");
		
	}
	
	@BeforeTest	
	public void textcaseforbeforetest() {
		System.out.println("this is testcase for before test");
		
	}
	@BeforeClass	
	public void textcaseforbeforeclass() {
		System.out.println("this is testcase for before class");
		
	}
	@BeforeMethod	
	public void textcaseforbeforemethod() {
		System.out.println("this is testcase for before method");
		
	}
	
}
