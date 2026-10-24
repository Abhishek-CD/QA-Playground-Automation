package Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ButtonClicks extends Base{
	void singleClick() {
		By singleClickBtn = By.id("btn-single-click");
		driver.findElement(singleClickBtn).click();
	}
	void doubleClick() {
		By doubleClickBtn = By.id("btn-double-click");
		a.doubleClick(driver.findElement(doubleClickBtn)).perform();
	}
	void rightClick() {
		By rightClickBtn = By.xpath("//button[@id='btn-right-click']");
		a.contextClick(driver.findElement(rightClickBtn)).perform();
	}
	void hoverButton() {
		WebElement hoverBtn = driver.findElement(By.cssSelector("#btn-hover-me"));
		a.moveToElement(hoverBtn).perform();
	}
	void submitWithSpinner() {
		WebElement submitSpinnerBtn = driver.findElement(By.cssSelector("button[data-qa='loading-btn']"));
		submitSpinnerBtn.click();
		WebElement showText =  driver.findElement(By.cssSelector("span[data-testid='text-loading-status']"));
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		w.until(ExpectedConditions.textToBePresentInElement(showText, "Completed!"));
	}
	void checkBox() {
		driver.findElement(By.cssSelector("input#checkbox-toggle-disabled")).click();
	}
	
	
	@Test
	public void buttonPlayGround() {
		
		WebElement sidebarButton = driver.findElement(By.id("nav-link-buttons"));
		a.scrollToElement(sidebarButton).perform();
		sidebarButton.click();
		
		singleClick();
		doubleClick();
		rightClick();
		hoverButton();
		submitWithSpinner();
		checkBox();
	}
}
