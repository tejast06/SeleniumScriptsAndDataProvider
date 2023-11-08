import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import tests.BaseClass;

public class WebDriverConditionalCommands extends BaseClass {
	
	@Test
	public void conditionalCmds() {
		
		initialization();
		WebElement firstName = driver.findElement(By.xpath("//input[@name = 'firstname']"));
		if(firstName.isDisplayed() && firstName.isEnabled()) {
			firstName.sendKeys("tejas");
		}
		
	}

}
