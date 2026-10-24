package Tests;

import org.testng.annotations.Test;

public class RefreshPage extends Base{
	@Test
	public void pageRefresh() {
		driver.navigate().refresh();
	}
}
