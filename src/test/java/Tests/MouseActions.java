package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MouseActions extends Base{
	public void hover() {
		By hoverContainer = By.id("box-hover-target");
		a.moveToElement(driver.findElement(hoverContainer)).perform();
	}
	public void rightClick() {
		WebElement rightClickBtn = driver.findElement(By.id("div-context-area"));
		a.contextClick(rightClickBtn).perform();
	}
	public void resize() {
		
		WebElement resizeBox = driver.findElement(By.cssSelector("div[data-testid='box-resizable-container']"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].style.width = '400px'; arguments[0].style.height = '200px';", resizeBox);
	    
	    System.out.println("New Width: " + resizeBox.getCssValue("width"));
	    System.out.println("New Height: " + resizeBox.getCssValue("height"));
	    
	    System.out.println("Resizing task executed successfully via JS!");

	}

@Test
	public void performMouseActions() {
		By sideMouseActionBtn = By.xpath("//a[@id='nav-link-mouse-actions']");
		a.scrollToElement(driver.findElement(sideMouseActionBtn)).perform();
		driver.findElement(sideMouseActionBtn).click();
		
		hover();
		rightClick();
		resize();
	}

}
