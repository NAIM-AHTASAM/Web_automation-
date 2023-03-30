package handle_web_element;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utilities.DriverSetup;

public class TC02TestNGexample extends DriverSetup {
	public String base_url="https://rahulshettyacademy.com/AutomationPractice/";
	@Test	
	public void navigateToWebPage() throws InterruptedException {
		driver.get(base_url);
		Thread.sleep(5000);
		driver. navigate().to("https://rahulshettyacademy.com/documents-request");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.quit();
		
	}
	@Test
	public void handleBrowserWindow() throws InterruptedException {
		driver.get(base_url);
//		Thread.sleep(5000);
//		driver.switchTo().newWindow(WindowType.TAB);
//		Thread.sleep(5000);
//		driver.get(base_url);
//		Thread.sleep(5000);
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		Thread.sleep(5000);
//		driver.get(base_url);
//		Thread.sleep(5000);
//		driver.navigate().refresh();
//		Thread.sleep(5000);
//		driver.close();
		
		driver.findElement(By.id("openwindow")).click();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.findElement(By.id("opentab")).click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		List<String> windowhandleList = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(windowhandleList.get(0));
		System.out.println(windowhandleList.get(1));
		System.out.println(windowhandleList.get(2));
		
		
		driver.switchTo().window(windowhandleList.get(0));
		System.out.println(driver.getTitle());
		driver.switchTo().window(windowhandleList.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(windowhandleList.get(2));
		System.out.println(driver.getTitle());
		
		
	}
	
	
}
