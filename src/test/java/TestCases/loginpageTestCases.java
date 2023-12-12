package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ObjectectRepository.AddTocart;
import ObjectectRepository.loginpage;

public class loginpageTestCases extends TestBaseClass{
	@Test
	public void loginBycorrectCredential()
	{
		driver.get(baseurl);
		
		loginpage login=new loginpage(driver);
		login.username().sendKeys(username);
		login.password().sendKeys(password);
		login.loginbtn().click();
	
	}
	
	
}
