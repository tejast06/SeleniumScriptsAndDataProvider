package tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyDropDownIsSorted extends BaseClass {
	
	@Test
	public void verifyDropDown() {
		initialization();
		
		
		WebElement countires = driver.findElement(By.xpath("//select[@id='country']"));
		Select se = new Select(countires);
		
		List<String> originalList = new ArrayList();
		for(WebElement e : se.getOptions()) {
			originalList.add(e.getText());
		}
		System.out.println("original list before sort:" +originalList);
		
		List<String> temp = originalList;
		Collections.sort(temp);
		Assert.assertEquals(temp, originalList);
		
		System.out.println("original list after sort:" +temp);
		
		
		
		
		
	}

}
