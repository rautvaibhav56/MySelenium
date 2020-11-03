package com.selenium;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;

public class SeleniumBasics {

	WebDriver driver;

	@BeforeSuite
	public void setup() {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe");
		
		 driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");

	

		System.out.println("open browser");
		
	

	}

	@Test
	public void doLogin() {
		
		// 1.id->faster
				WebElement Uname = driver.findElement(By.id("txtUsername"));
				Uname.sendKeys("Admin");

				// 2.Name By.name("txtPassword");// By is a class
				driver.findElement(By.name("txtPassword")).sendKeys("admin123");

				// click Login

				WebElement Login = driver.findElement(By.id("btnLogin"));
				Login.click();
				

	}

	@AfterSuite
	public void endUp() {
		driver.close();
		
	}
	
	
	
	
	
}
