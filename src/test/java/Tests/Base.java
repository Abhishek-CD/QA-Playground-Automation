//for jenkins 
package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

    protected WebDriver driver;
    protected Actions a;

    @BeforeMethod
    public void initializeBrowser() {

        driver = new ChromeDriver();

        String baseUrl = System.getProperty(
            "baseUrl",
            "https://justqaplayground.pythonanywhere.com/"
        );

        driver.manage().window().maximize();
        driver.get(baseUrl);

        a = new Actions(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void browserQuit() {

        if (driver != null) {
            driver.quit();
        }
    }
}
