package Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NavigateAndXpath extends Base {
//	By loginPageBtn = By.xpath("//a[@id='nav-link-login']");
	
	public void clickLoginBtn() {
//		driver.findElement(loginPageBtn).click();
//		driver.findElement(By.cssSelector("a[data-qa='nav-login']")).click();
//		driver.findElement(By.cssSelector("a[data-qa='nav-login'][href='/login/']")).click();
		driver.findElement(By.xpath("//a[contains(@id,'link-home')]")).click();
		//a[@id='nav-link-login']/span-----> child xpath
		//span[@id='icon-nav-login']/parent::a ---------->parent xpath
	}
	public void clickBackBtn() throws InterruptedException {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement signBtn = driver.findElement(By.id("btn-login-submit"));
//		w.until(ExpectedConditions.elementToBeClickable(signBtn));
		Thread.sleep(1500);
		driver.navigate().back();
		Thread.sleep(1500);
		driver.navigate().forward();
		Thread.sleep(1500);
		driver.navigate().refresh();

	}
	@Test
	public void clickBack() throws InterruptedException {
		clickLoginBtn();
		clickBackBtn();
	}
	
}
