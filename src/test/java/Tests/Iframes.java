package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Iframes extends Base {
	public void iframeInput() {
		WebElement frameElement = driver.findElement(By.id("iframe-demo-single"));
		driver.switchTo().frame(frameElement);
		
		WebElement inputBox = driver.findElement(By.id("input-inside-frame-single"));
		inputBox.sendKeys("This is a sample text");
		driver.switchTo().defaultContent();
		
	}
	
	@Test
	public void performIframe() {
		WebElement sideIframeBtn = driver.findElement(By.id("nav-link-frames"));
		a.scrollToElement(sideIframeBtn).perform();
		
		sideIframeBtn.click();
		iframeInput();
	}
}
