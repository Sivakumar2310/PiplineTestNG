package pageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
	WebDriver driver;
	By userName = By.xpath("//*[@id='identifierId']");
	 public login(WebDriver driver){

	        this.driver = driver;
	        
	    }

	    //Set user name in textbox
	 public void enterUserName(String strUserName) {
	    	this.setUserName(strUserName);
	    }
	    public void setUserName(String strUserName){

	        driver.findElement(userName).sendKeys(strUserName);

	    }
	    
}
