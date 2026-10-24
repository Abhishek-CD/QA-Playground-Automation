package Tests;

public class GetPageSource extends BaseTest {
	void getPageSource() {
		String s = driver.getPageSource();
		System.out.println(s);
	}
	public static void main(String[] args) {
		GetPageSource p = new GetPageSource();
		p.initializeBrowser();
		p.getPageSource();
		p.browserQuit();

	}

}
