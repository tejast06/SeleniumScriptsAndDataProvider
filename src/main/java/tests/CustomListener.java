package tests;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;




public class CustomListener extends BaseClass implements ITestListener  {
	
	public void onTestFailure(ITestResult result) {
		takeScreenShot();
		
	}

}
