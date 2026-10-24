package Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DatePicker extends Base {
	@Test
	public void datePickerPage() {
		By layoutDatePage = By.id("nav-link-date-pickers");
		By firstDate = By.xpath("//input[@type='date' and @data-testid='input-date-single']");
		By time = By.id("input-time-picker");
		driver.findElement(layoutDatePage).click();
		driver.findElement(firstDate).sendKeys("18-12-1999");
		
		driver.findElement(time).sendKeys("09:40AM");
		
	}
}
