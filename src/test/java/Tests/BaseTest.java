package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	WebDriver driver;
	
	public void initializeBrowser() {
		driver = new ChromeDriver();
//		driver = new FirefoxDriver();
//		driver = new EdgeDriver();
		driver.get("https://justqaplayground.pythonanywhere.com/");	
//		driver.manage().window().maximize();
//		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		}
	public void browserQuit() {
		driver.quit();
	}
}
