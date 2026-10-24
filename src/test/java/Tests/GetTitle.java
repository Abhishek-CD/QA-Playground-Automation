package Tests;

public class GetTitle extends BaseTest{
	public void getTitle(){
		String s = driver.getTitle();
		System.out.println(s);
	}
	public static void main(String[] args) {
		GetTitle title = new GetTitle();
		title.initializeBrowser();
		title.getTitle();
		title.browserQuit();
	}

}
