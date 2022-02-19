package TestNGPkg;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import pageClass.login;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.asserts.*;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

//@Listeners(TestNGPkg.ListenerTest.class)
public class TestNGTestOne {
	WebDriver driver;
	 login lp;
	@BeforeTest
	public void browserlaunch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\chromedriver.exe");  
	      WebDriver driver=new ChromeDriver();
	      lp=new login(driver);
	     driver.get("https://gmail.com");
	}

	//private static final String TRUE = null;
	// launch the Chrome browser and open the application url
		 
  @Test
  public void f0() {
	 
	  //driver.get("https://gmail.com");
      	  driver.manage().window().maximize();
      	lp.enterUserName("latteri.siva");
	//declare and initialize the variable to store the expected title of the webpage.
	      String expectedTitle = "Sign in - Google Accounts";
	      String actualTitle = "Sign in - Google Accounts";
	//fetch the title of the web page and save it into a string variable
	     // String actualTitle = driver.getTitle();
	  Assert.assertEquals(expectedTitle,actualTitle);
	
	 
	 
	 driver.quit();
  }
  @Test		
  public void TestToFail()				
  {		
      System.out.println("This method to test fail");					
      Assert.assertTrue(true);			
  }		
  
  @Test		
  public void TestToPass()				
  {		
	  String expectedTitle = "Sign in - Google Accounts";
      String actualTitle = "Sign in - Google Accounts";
//fetch the title of the web page and save it into a string variable
     // String actualTitle = driver.getTitle();
      Assert.assertEquals(expectedTitle,actualTitle);
  }		
}
