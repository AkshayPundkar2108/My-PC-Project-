package ObjectectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class clickOnCart {

	WebDriver driver;

	public clickOnCart(WebDriver driver) 
	{
this.driver=driver;
	}
	
	By clickoncart=By.xpath("//*[@class='shopping_cart_link']");

	public WebElement clickoncart()
	{
		return driver.findElement(clickoncart);
	}
	
	By priceTag=By.xpath("//*[@class='inventory_item_price']");
	
	public void pricetag()
	{
		List<WebElement> pricetag=driver.findElements(By.xpath("//*[@class='inventory_item_price']"));
		for(WebElement ch:pricetag)
		{
			System.out.println(ch.getText());
		}
	}
	
}
