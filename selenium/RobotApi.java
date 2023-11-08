import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import tests.BaseClass;

public class RobotApi extends BaseClass {
	
	@Test
	public void keyBoardEvents() {
		initialization();
		WebElement currentAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		currentAddress.sendKeys("tejas");
		currentAddress.sendKeys(Keys.CONTROL);
		currentAddress.sendKeys("A");
		currentAddress.sendKeys(Keys.CONTROL);
		currentAddress.sendKeys("C");
		
		currentAddress.sendKeys(Keys.TAB);
		
	WebElement permanentAddress = 	driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
	permanentAddress.sendKeys(Keys.CONTROL);
	permanentAddress.sendKeys("V");
	}

}
