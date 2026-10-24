package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Base {
	WebDriver driver;
	Actions a;
	@BeforeMethod
	public void initializeBrowser() {
		driver = new ChromeDriver();
		driver.get("https://justqaplayground.pythonanywhere.com/");	
		driver.manage().window().maximize();
		a = new Actions(driver);
		}
	
//	@AfterMethod
	public void browserQuit() {
		driver.quit();
	}
}
