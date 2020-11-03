
  import org.testng.annotations.Test; import
  org.testng.annotations.BeforeMethod; import
  org.testng.annotations.AfterMethod; import
  org.testng.annotations.BeforeClass; import org.testng.annotations.AfterClass;
  import org.testng.annotations.BeforeTest; import
  org.testng.annotations.AfterTest; import org.testng.annotations.BeforeSuite;
  import org.testng.annotations.AfterSuite;
  
  public class FirstProject {
  
  @Test public void testDemo() { System.out.println("In Test Demo"); }
  
  @BeforeMethod public void beforeMethod() {
  System.out.println("Before method"); }
  
  @AfterMethod public void afterMethod() { System.out.println("After Method");
  }
  
  
  @BeforeClass public void beforeClass() { System.out.println("Before class");
  }
  
  @AfterClass public void afterClass() { System.out.println("After class"); }
  
  @BeforeTest public void beforeTest() { System.out.println("beforeTest"); }
  
  @AfterTest public void afterTest() { System.out.println("afterTest"); }
  
  @BeforeSuite public void beforeSuite() { System.out.println("beforeSuite"); }
  
  @AfterSuite public void afterSuite() { System.out.println("afterSuite"); }
  
  }
 