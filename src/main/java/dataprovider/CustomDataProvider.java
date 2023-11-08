package dataprovider;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {
	
	@DataProvider(name="logindata")
	public Object[][] getData(){
		Object[][] data = {{"abc1@gmail.com","abc"},{"abc2@gmail.com","qsd"},{"abc3@gmail.com","oiuu"}};
		return data;
	}

}
