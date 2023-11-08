package tests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SwitchingWindows extends BaseClass {
	
//	@Test
//	public void handleWindows() {
//		initialization();
//		driver.findElement(By.xpath("//input[@value='Safe New Window']")).click();
//		Set<String> s = driver.getWindowHandles();
//		for(String i:s) {
//			String tit = driver.switchTo().window(i).getTitle();
//			System.out.println(tit);
//			if(tit.contains("ksoft- Startup Select - Windows Startup Manager")) {
//				driver.close();
//			}
//		}
	
	
	@Test
	public void handleWindows() {
		initialization();
		driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//a[@class='button e.g. button_hilite button_pale small_button'][normalize-space()='Click Here']")).click();
		Set<String> s = driver.getWindowHandles();
		Iterator<String> it = s.iterator();
		String win1 = it.next();
		String win2 = it.next();
		System.out.println(win1);
		System.out.println(win2);
		driver.switchTo().window(win2);
		driver.close();
		driver.switchTo().window(win1);
		driver.close();
		
		}
		
		
	
		
		
	}


