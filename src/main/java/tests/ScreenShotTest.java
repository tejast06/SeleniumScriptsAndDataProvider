package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(CustomListener.class)
public class ScreenShotTest extends BaseClass {
	
	@BeforeTest
	public void launch() {
		initialization();
	}
	
	
	@Test
	public void getSS() {
		
		String title = driver.getTitle();
		Assert.assertEquals(title, "jgjjgjg");
		
	}
	
	

}
