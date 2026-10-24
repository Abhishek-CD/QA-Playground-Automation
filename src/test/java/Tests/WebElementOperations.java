package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebElementOperations extends Base{
	public void performOperations() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[contains(@id,'nav-link-login')]")).click();
		
		driver.findElement(By.xpath("//input[contains(@name,'username') and contains(@class,'form-input')]")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input[type='password']")).clear();
		WebElement passwordField = driver.findElement(By.cssSelector("input[type='password']"));
		System.out.println(passwordField.getAttribute("id"));
//		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.quit();
		
		
//		isDisplayed()
//		isEnabled()
//		isSelected() ----->for checkbox
//		WebElement button =
//	    driver.findElement(By.id("login"));
//
//	if (button.isEnabled()) {
//	    System.out.println("Button is enabled");
//	} else {
//	    System.out.println("Button is disabled");
//	}


	}
	@Test
	public void performOp() throws InterruptedException {
		performOperations();
	}
}
