import org.openqa.selenium.By;
import org.testng.annotations.Test;

import tests.BaseClass;

public class DownloadFileUsingChrome extends BaseClass {
	
	
	@Test
	public void downloadFile() {
		initialization();
		driver.findElement(By.xpath("//textarea[@id='textbox']")).sendKeys("test");
		driver.findElement(By.xpath("//button[@id='createTxt']")).click();
		driver.findElement(By.linkText("//a[@download='info.txt' and text()='Download']")).click();
	}

}
