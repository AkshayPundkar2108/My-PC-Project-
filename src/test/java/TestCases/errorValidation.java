package TestCases;

import org.testng.annotations.Test;

import ObjectectRepository.AddTocart;
import ObjectectRepository.clickOnCart;
import ObjectectRepository.clickoncheckout;
import ObjectectRepository.continuePage;
import ObjectectRepository.loginpage;

public class errorValidation extends TestBaseClass{
@Test
void endtoend()
{
	driver.get(baseurl);
	loginpage login=new loginpage(driver);
	login.username().sendKeys("lala");
	login.password().sendKeys(password);
	login.loginbtn().click();
	login.errormsg();
	
	
	/*AddTocart clickonadd=new AddTocart(driver);
	clickonadd.addIntocart();
	
	clickOnCart cart=new clickOnCart(driver);
	cart.clickoncart().click();
	cart.pricetag();
	
	clickoncheckout checkout=new clickoncheckout(driver);
	checkout.clickOncheckOut().click();
	checkout.name().sendKeys("Yogesh");
	checkout.lastname().sendKeys("Tayade");
	checkout.zip().sendKeys("443103");
	
	continuePage conti=new continuePage(driver);
	conti.clickoncontinue().click();
	conti.itemtext();
	conti.finsh().click();
	conti.thanksmsg();*/
	
	
}
}
