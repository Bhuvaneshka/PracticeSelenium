package PracticeTestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGStructure {

	ChromeDriver driver = new ChromeDriver();
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before Method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("before Method");
	}
}
