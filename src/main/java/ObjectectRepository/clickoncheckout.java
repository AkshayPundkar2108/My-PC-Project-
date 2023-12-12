package ObjectectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class clickoncheckout {
	WebDriver driver;
	public clickoncheckout(WebDriver driver)
	{
		this.driver=driver;
	}

	By clickOncheckOut=By.id("checkout");
	public WebElement clickOncheckOut()
	{
		return driver.findElement(clickOncheckOut);
	}

	By name=By.id("first-name");
	public WebElement name()
	{
		return driver.findElement(name);
	}
	By lastname=By.id("last-name");
	public WebElement lastname()
	{
		return driver.findElement(lastname);
	}
	By zip=By.id("postal-code");
	public WebElement zip()
	{
		return driver.findElement(zip);
	}
}
