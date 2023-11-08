import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import tests.BaseClass;

public class RightClick extends BaseClass {
	
	@Test
	public void rightClickPerform() {
			initialization();
			WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
			Actions act = new Actions(driver);
			act.contextClick(ele);
	}
	
	

}
