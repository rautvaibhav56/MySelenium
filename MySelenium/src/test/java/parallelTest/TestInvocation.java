package parallelTest;

import org.testng.annotations.Test;

public class TestInvocation extends BaseTest {

	@Test(priority = 1, invocationCount = 5)
	public void excuteTest() {

		driver = getdriver("chrome");
		
		driver.get("https://www.google.com/");

		System.out.println(driver.getTitle());
	}

	@Test(priority = 2)
	public void tearDown() {
		
		driver.quit();
		
	}
}
