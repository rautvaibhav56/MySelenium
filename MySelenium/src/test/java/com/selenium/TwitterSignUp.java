package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TwitterSignUp {

	WebDriver driver;

	@BeforeSuite
	public void setUp() {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe");

		driver = new ChromeDriver();

		// driver.manage().window().maximize();

		driver.get(
				"https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");

		System.out.println("open browser");
	}

	@Test
	public void doSignUp() throws InterruptedException {

		WebElement name = driver.findElement(By.xpath("//input[@name='firstName']"));
		name.sendKeys("pratik");

		// driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Raut");
		driver.findElement(By.id("lastName")).sendKeys("pore");

		Thread.sleep(5000);

	}

	@AfterSuite
	public void closeUp() {

		driver.close();

	}
}
