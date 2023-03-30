package handle_web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



import utilities.DriverSetup;

public class TC03_iframeCheckboxRadioButton extends DriverSetup {
	@Test
	public void Testradiobutton () throws InterruptedException {
		driver.get("https://jqueryui.com/checkboxradio/");
		
		//jodi index dea korte chai
		
		driver.switchTo().frame(0);
		WebElement radioButton = driver.findElement(By.cssSelector("label[for='radio-1']"));
		radioButton.click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		WebElement header =driver.findElement(By.xpath("//h1[normalize-space()='Checkboxradio']"));		
		Thread.sleep(3000);
		
		// jodi value dea korta chai
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		WebElement radioButton2 = driver.findElement(By.xpath("//label[normalize-space()='Paris']"));
		radioButton2.click();
		Thread.sleep(3000); 
		
		WebElement checkbox1 = driver.findElement(By.cssSelector("label[for='checkbox-1']"));
		checkbox1.click();
		Thread.sleep(3000);
		WebElement checkbox2 = driver.findElement(By.cssSelector("label[for='checkbox-2']"));
		checkbox2.click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
	}
	
	
	
	
	
	
	
}
