package tests;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void initialization() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		//driver.get("https://www.guru99.com/");
		//driver.get("https://demo.automationtesting.in/FileDownload.html");
		//driver.get("https://demoqa.com/text-box");
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		//driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		
			//https://testautomationpractice.blogspot.com/-verify drop down
	}
	
	public  void takeScreenShot() {
		
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.getFile(scrFile, "F:\\eclipse\\SeleniumScripts\\src\\main\\java\\tests\\ss.png");
		
		
		
	}

}
