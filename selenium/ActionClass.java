import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import tests.BaseClass;

public class ActionClass extends BaseClass  {
	
	@BeforeTest
	public void setUp() {
		initialization();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		driver.findElement(By.xpath("//span[text()='Job ']")).click();
		
	}
	
	@Test
	public void mouseHoover() {
		
        WebElement jobTitle = driver.findElement(By.xpath("//ul[@role='menu']/li/a[text()='Job Titles']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(jobTitle).click().build().perform();
		
	}
	
	

}
