package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RadioButton extends Base {
	@Test
	public void clickRadio() throws InterruptedException {
		Actions a = new Actions(driver);
		By sidebarRadio = By.xpath("//a[@id='nav-link-radio-buttons']");
		a.scrollToElement(driver.findElement(sidebarRadio)).perform();
		driver.findElement(sidebarRadio).click();
		driver.findElement(By.xpath("//input[@type='radio' and @data-testid='radio-exp-senior']")).click();
		Thread.sleep(1500);
		driver.quit();
	}
}
