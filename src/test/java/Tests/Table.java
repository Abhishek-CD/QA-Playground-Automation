 package Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Table extends Base {
	public void getTotalNoTableElements() {
		WebElement table = driver.findElement(By.tagName("table"));
		List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
		System.out.println("Total rows= " + rows.size());
		
		List<WebElement> columns = driver.findElements(By.xpath("//table//tr[1]//th"));
		System.out.println("Total columns= "+ columns.size());
	}
	public void getTableHeaders(){
		List<WebElement> headers = driver.findElements(By.xpath("//table//tr[1]//th"));
		for(WebElement head : headers) {
			System.out.println(head.getText());
		}
	}
	public void getSpecificCell() {
		WebElement cell = driver.findElement(By.xpath("//table//tr[1]//th[2]"));
		System.out.println("Cell name is: "+ cell.getText());
	}
	
	public void printEntireTable() {
		List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
		for(WebElement row:rows) {
			List<WebElement> cells = row.findElements(By.xpath("./th | ./td"));
			for(WebElement cell:cells) {
				System.out.print(cell.getText()+ " | ");
				}
			System.out.println();
			}
		}
	
	public void findRowContainSpecificText() {
		WebElement row = driver.findElement(By.xpath("//table//tr[contains(.,'Alice')]"));
		System.out.println(row.getText());
	}
	
	@Test
	public void runTable() {
		WebElement sideTableBtn = driver.findElement(By.cssSelector("a[data-testid='nav-link-tables']"));
		sideTableBtn.click();
		
		getTotalNoTableElements();
		getTableHeaders();
		getSpecificCell();
		printEntireTable();
		findRowContainSpecificText();
	}
}
