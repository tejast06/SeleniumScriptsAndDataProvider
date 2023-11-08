package dataprovider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLogin {
	
public WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void setUp() {
		
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    
    
    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    driver.get("https://practicetestautomation.com/practice-test-login/");
    
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> data = TestUtil.getDataFromExcel();
		return data.iterator();
		
		
	}
	
	@Test(dataProvider = "getTestData")
	public void enterCredentials(String username, String pwd) {
		
		driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id = 'username']")).clear();
		
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		
		
	}

}
