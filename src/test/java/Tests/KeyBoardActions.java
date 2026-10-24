package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class KeyBoardActions extends Base{
	public void text() {
		driver.findElement(By.id("input-hotkey-target")).sendKeys("This is a sample text");
		}
	public void copyPaste() {
		WebElement copyElement, pasteElement;
		
		copyElement = driver.findElement(By.id("input-copy-source"));
		copyElement.click();
		copyElement.sendKeys(Keys.LEFT_CONTROL,"a");
		copyElement.sendKeys(Keys.LEFT_CONTROL,"c");
//		
		pasteElement = driver.findElement(By.id("input-paste-target"));
		pasteElement.sendKeys(Keys.LEFT_CONTROL,"v");
		
		
	}
	public void tabOp() {
		WebElement tabFocus = driver.findElement(By.id("input-tab-1"));
		tabFocus.sendKeys(Keys.TAB);
	}
	@Test
	public void performKeyboard() {
		WebElement sideKeyOption = driver.findElement(By.id("nav-link-keyboard-actions"));	
		a.scrollToElement(sideKeyOption);
		sideKeyOption.click();
		
		text();
		copyPaste();
		tabOp();
		
	}
}
