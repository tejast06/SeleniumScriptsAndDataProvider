package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovidertest {
	
	
	@Test(dataProvider = "logindataprovider")
	public void loginTest() {
		
	}
	
	
	
	
	@DataProvider(name="logindataprovider")
	public Object[][] getData(){
		Object[][] data = {{"abc@gmail.com","123"},{"okh@gmail.com","456"},{"gfgf@gmail.com","787"}};
		return data;
	}

}
