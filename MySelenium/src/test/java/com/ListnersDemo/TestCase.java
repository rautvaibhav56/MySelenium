package com.ListnersDemo;
//Impl on suit level
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//Listener Added in TestNG.xml 
public class TestCase {
	WebDriver driver;
	@Test
	public void titleVerify() {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe");
		
		 driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

		System.out.println("open browser");
		
		System.out.println(driver.getTitle());
		
		driver.close();
		

		
	}
	@Test
	public void titleVerify1() {
		
		System.out.println("Test is going on ...");
		Assert.assertTrue(false);
	}
	
	
}
