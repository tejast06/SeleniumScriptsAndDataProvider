package dataprovider;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import tests.BaseClass;

public class DataProviderExample extends BaseClass {
	
	
//	@DataProvider(name="logindata")
//	public Object[][] getData(){
//		Object[][] data = {{"abc1@gmail.com","abc"},{"abc2@gmail.com","qsd"},{"abc3@gmail.com","oiuu"}};
//		return data;
//	}
	
	
	@Test(dataProvider = "logindata", dataProviderClass = CustomDataProvider.class)
	public void testData(String email,String pw) {
		
		initialization();
		System.out.println("Email" +email +"password" +pw);
		
		driver.findElement(By.xpath("//input[@id='username']")).clear();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(email);
		
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pw);
		
	}

}
