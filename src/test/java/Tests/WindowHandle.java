package Tests;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WindowHandle extends Base {
	public void openNewTab() throws InterruptedException {
		String parentWindow = driver.getWindowHandle();
		WebElement newTabBtn = driver.findElement(By.id("btn-open-new-tab"));
		newTabBtn.click();
		Thread.sleep(1000);
		
		
		System.out.println("Parent Window = "+parentWindow);
		
		Set<String> windows = driver.getWindowHandles();
		
		System.out.println("All Windows = "+windows);
		
		for(String w : windows) {
			if(!w.equals(parentWindow)) {
				driver.switchTo().window(w);
				String newWindow = driver.getWindowHandle();
				System.out.println("Current window is "+newWindow);
				
				WebElement sideWindowBtn = driver.findElement(By.id("nav-link-windows"));
				a.scrollToElement(sideWindowBtn).perform();
				a.click(sideWindowBtn).perform();
				driver.close();
				break;
			}
		}
		driver.switchTo().window(parentWindow);
		
		
		
	}
	
	
	@Test
	public void performWindowHandle() throws InterruptedException {
		WebElement sideWindowBtn = driver.findElement(By.id("nav-link-windows"));
		a.scrollToElement(sideWindowBtn).perform();
		a.click(sideWindowBtn).perform();
		
		openNewTab();
	}
}
