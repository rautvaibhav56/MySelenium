package com.selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public class TestNG1 {
	
	WebDriver driver;
	
	@BeforeSuite
	public void setup1() {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe");
		
		 driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/r.php");

		System.out.println("open browser");
		
	}

	@Test
	public void doRegistration() {
		
		 WebElement username = driver.findElement(By.name("firstname"));

	        username.sendKeys("abc");
	        
	        String nameValue = username.getAttribute("name");
	        
	        System.out.println("Attribute of name is>>" + nameValue);
	        
	        driver.findElement(By.name("lastname")).sendKeys("pqr");
	        
	        // driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("pqr");


	        driver.findElement(By.name("reg_email__")).sendKeys("999999");
	        
	       driver.findElement(By.name("reg_passwd__")).sendKeys("999999");
	        
	        System.out.println("valid credential is pass");
	}
	
	@Test
    public void enterDate() {
		//sel.selectByIndex //sel.selectByValue//selectByVisibleText
		
        WebElement element = driver.findElement(By.id("day"));
        
        Select sel = new Select(element);
        
        // sel.selectByIndex(7);

        // sel.selectByValue("10");
        
        sel.selectByVisibleText("8");

        System.out.println("day is enter");
    }

	
	@Test
    public void entermonth() {

        // month data

        WebElement monthlocator = driver.findElement(By.id("month"));
        
        Select sel2 = new Select(monthlocator);

        List<WebElement> alloption = sel2.getOptions();
        
        int size = alloption.size();
        
        System.out.println("total size is" + size);
        
        for (int i = 1; i < size; i++) {
        	
            String alldata = alloption.get(i).getText();
            
            System.out.println("All dropdown text is" + alldata);
            
            alloption.get(5).click();
        }
        System.out.println(" valid month enter");
    }

	
	@Test
    public void enterYear() {
		
        List<WebElement> allyeardata = driver.findElements(By.xpath("//option[contains(@value,'199')]"));
        
        int allyearsize = allyeardata.size();
        
        System.out.println("size of year>>>" + allyearsize);
        
        for (int i = 1; i < allyearsize; i++) {
        	
            String allyeardatavalue = allyeardata.get(i).getText();
            
            System.out.println("All dropdown text is" + allyeardatavalue);
            
            allyeardata.get(3).click();
        }
        System.out.println("valid year enter");
    }

	 @Test
	    public void selectRadiobtn() {

	       // WebElement radiobtn = driver.findElement(By.name("sex"));
		 
	        WebElement radiobtn = driver.findElement(By.id("u_0_5"));
	        //u_0_5 
	        
	        radiobtn.click();
	        
	        driver.findElement(By.name("websubmit")).click();
	        
	        System.out.println("radio btn select");
	    }


	
	
	@AfterSuite
	public void endUp() {
		
		driver.close();
		
	}
	

}
