import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import tests.BaseClass;

public class HandlingWebTable extends BaseClass {
	
	@Test
	public void conditionalCmds() {
		
		initialization();
		int row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
		System.out.println(row);
		
		int column = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th")).size();
		System.out.println(column);
		
		
		for(int i=2; i<=row; i++) {
			for(int j=1; j<=column; j++) {
				String data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(data);
			}
		}
		
	}

}
