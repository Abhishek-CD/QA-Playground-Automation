package Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DynamicElements extends Base {
	
	public void dynamicWait() {
		driver.findElement(By.id("btn-trigger-delayed-render")).click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement dynamicBtn = w.until(ExpectedConditions.elementToBeClickable(By.id("btn-delayed-appear-target")));
		dynamicBtn.click();
	}
	
	public void generateRandomNum() {
		driver.findElement(By.id("btn-generate-random-num")).click();
		WebElement randomNumerElement = driver.findElement(By.id("text-random-num-val"));
		String randomNumber = randomNumerElement.getText();
		int num = Integer.parseInt(randomNumber.replace("#",""));
		System.out.println("Random Nubmber is "+ num);
//		driver.quit();
	}
	
	@Test
	public void performDynamic() {
		WebElement sideDinamicBtn = driver.findElement(By.id("nav-link-dynamic-elements"));
		a.scrollToElement(sideDinamicBtn).perform();
		sideDinamicBtn.click();
		
		dynamicWait();
		generateRandomNum();
	}
	
}
