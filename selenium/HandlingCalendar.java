import org.openqa.selenium.By;
import org.testng.annotations.Test;

import tests.BaseClass;

public class HandlingCalendar extends BaseClass {
	
	@Test
	public void handlingCalendar() {
		initialization();
		driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
		for(int i=2; i<=1; i--) {
			driver.findElement(By.xpath("//a[@title='Next']/span")).click();
			String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			if(month.equals("December")) {
				driver.findElement(By.linkText("6")).click();
				break;
			}
		}
	}

}
