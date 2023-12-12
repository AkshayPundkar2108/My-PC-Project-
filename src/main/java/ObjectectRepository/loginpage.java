package ObjectectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {
WebDriver driver;
    public loginpage(WebDriver driver)
     {
    	
    	 this.driver=driver;
     }
    By username=By.xpath("//*[@id='user-name']");
    
    public WebElement username()
    {
    	return driver.findElement(username);
    }
    By password=By.xpath("//*[@placeholder='Password']");

    public WebElement password()
    {
		return driver.findElement(password);
    	
    }
   
    By loginbtn=By.xpath("//*[@id='login-button']");
    public WebElement loginbtn()
    {
    	return driver.findElement(loginbtn);
    }
    
    By errormsg=By.xpath("//*[@class='error-message-container error']");
    
    public String errormsg()
    {
		return driver.findElement(errormsg).getText();
    	
    }
   
    public void goTo()
    {
    	driver.get("https://www.saucedemo.com/");
    	
    }
    
}
