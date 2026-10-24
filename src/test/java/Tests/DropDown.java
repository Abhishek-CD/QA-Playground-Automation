package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown extends Base{
	@Test
	public void selectDropDown() throws InterruptedException {
		driver.findElement(By.id("nav-link-dropdowns")).click();
		WebElement drop = driver.findElement(By.xpath("//select[@id='select-standard-framework']"));
		Select s = new Select(drop);
		s.selectByVisibleText("Selenium WebDriver");
		Thread.sleep(1500);
		s.selectByIndex(2);
		Thread.sleep(1500);
		s.selectByValue("Cypress");
		Thread.sleep(1500);
		driver.quit();
	}
	
}
