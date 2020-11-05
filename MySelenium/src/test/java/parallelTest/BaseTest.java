package parallelTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	public WebDriver driver;
	
	public WebDriver getdriver(String browser) {
		
		if (browser.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe");
			
			 driver = new ChromeDriver();

			
		} else if (browser.equals("firefox")) {
			
			
			System.out.println("firefox");
			
		}
		
		return driver;}
	

}
