package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class VerifyOtp extends Base{
	public void enterOTP() throws InterruptedException {
		int[] value = {0,9,8,7,6,5,4};
		for(int i=1;i<=6;i++) {
			WebElement otpArea = driver.findElement(By.id("input-otp-digit-"+i));
			String strValue = String.valueOf(value[i]);
			otpArea.sendKeys(strValue);
		}
		driver.findElement(By.id("btn-verify-otp-code")).click();
		Thread.sleep(2000);
		
	}
	public void selectValue() {
		WebElement dropdown = driver.findElement(By.id("select-active-role"));
		Select s = new Select(dropdown);
		s.selectByIndex(1);
		driver.quit();
	}
	
	@Test
	public void performOTP() throws InterruptedException {
		WebElement sideAuthBtn = driver.findElement(By.id("nav-link-authentication"));
		a.scrollToElement(sideAuthBtn).perform();
		sideAuthBtn.click();
		
		enterOTP();
		selectValue();
	}
}
