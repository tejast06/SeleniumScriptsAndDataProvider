import org.testng.annotations.Test;

import tests.BaseClass;

public class WebDriverCommands extends BaseClass {
	
	
	@Test
	public void webDriverCmd() {
		initialization();
		driver.navigate().to("https://www.rolex.com/");
        driver.navigate().back();
        driver.navigate().forward();
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getPageSource());
	}

}
