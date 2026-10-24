package Tests;

import org.openqa.selenium.Dimension;

public class GetCurrentURL extends BaseTest {
	public void geturl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		Dimension size = driver.manage().window().getSize();

		System.out.println("Width: " + size.getWidth());
		System.out.println("Height: " + size.getHeight());

	}
	
	public static void main(String[] arg) {
		GetCurrentURL u = new GetCurrentURL();
		u.initializeBrowser();
		u.geturl();
//		u.browserQuit();
	}
}
