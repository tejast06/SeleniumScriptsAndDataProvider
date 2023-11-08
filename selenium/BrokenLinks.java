import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import tests.BaseClass;

public class BrokenLinks extends BaseClass {
	
	
	@Test
	public void verifyBrokenLink() throws IOException, InterruptedException {
		initialization();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int i=0; i<links.size(); i++) {
			WebElement ele = links.get(i);
			String url = ele.getAttribute("href");
			
			URL u = new URL(url);
			HttpURLConnection con = (HttpURLConnection) u.openConnection();
			Thread.sleep(2000);
			con.connect();
			int responseCode = con.getResponseCode();
			if(responseCode >=400) {
				System.out.println(url  +">" +"broken link");
			}
			else {
				System.out.println(url  +">" +"no broken link");
			}
		}
		
	}

}
