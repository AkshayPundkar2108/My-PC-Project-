package TestCases;

import org.testng.annotations.Test;

import ObjectectRepository.AddTocart;
import ObjectectRepository.loginpage;

public class AddinTocartTestcase extends TestBaseClass{

@Test
public void additemincart()
{
	driver.get(baseurl);
	loginpage login=new loginpage(driver);
	login.username().sendKeys(username);
	login.password().sendKeys(password);
	login.loginbtn().click();
	AddTocart clickonadd=new AddTocart(driver);
	clickonadd.addIntocart();
}


}
