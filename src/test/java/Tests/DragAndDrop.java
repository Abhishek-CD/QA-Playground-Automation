package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DragAndDrop extends Base{
	public void firstDragAndDrop() {
		WebElement source1, source2, destination;
		source1 =  driver.findElement(By.id("drag-item-1"));
		source2 = driver.findElement(By.id("drag-item-2"));
		destination = driver.findElement(By.id("container-drop-target"));
		a.dragAndDrop(source1, destination).perform();
		
		a.clickAndHold(source2).moveToElement(destination).release().perform();
	}
	@Test
	public void performDragAndDrop() {
		WebElement leftDragBtn = driver.findElement(By.id("nav-link-drag-drop"));
		a.scrollToElement(leftDragBtn).perform();
		leftDragBtn.click();
		firstDragAndDrop();
		}
	
}
