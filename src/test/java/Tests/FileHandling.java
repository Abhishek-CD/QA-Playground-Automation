package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FileHandling extends Base{
	public void downloadFile() {
		WebElement fileSelect = driver.findElement(By.id("input-file-single"));
		fileSelect.sendKeys("C:\\Users\\Abhi\\Downloads\\FGZSIGO-ZVVVW.pdf");

		WebElement multifileSelect = driver.findElement(By.id("input-file-multi"));
		multifileSelect.sendKeys("C:\\Users\\Abhi\\Downloads\\FGZSIGO-ZVVVW.pdf");
		multifileSelect.sendKeys("C:\\Users\\Abhi\\Downloads\\hr1.png");
		
		
	}
	
	@Test
	public void performFile() {
		WebElement leftFileBtn = driver.findElement(By.id("nav-link-file-upload"));
		a.scrollToElement(leftFileBtn).perform();
		leftFileBtn.click();
		downloadFile();
	}
}
