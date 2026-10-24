package Tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AlertOperations extends Base {
	
	public void simpleAlert(){
		By simpleAlertBtn = By.cssSelector(".qa-btn.qa-btn-primary");
		driver.findElement(simpleAlertBtn).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
	public void confirmDialogAlert() {
		By confirmDialogAlertBtn = By.id("btn-trigger-confirm");
		driver.findElement(confirmDialogAlertBtn).click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	public void promptAlert() {
		driver.findElement(By.id("btn-trigger-prompt")).click();
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		System.out.println(msg);
		alert.sendKeys("Abhishek");
		alert.accept();
		
		driver.findElement(By.id("btn-close-banner-danger")).click();
	}
	@Test
	public void performAlert() {
		By sideAlertMenu = By.xpath("//a[@id='nav-link-alerts']");
		a.scrollToElement(driver.findElement(sideAlertMenu)).perform();
		a.click(driver.findElement(sideAlertMenu)).perform();
		
		
		simpleAlert();
		confirmDialogAlert();
		promptAlert();
		
	}
}
