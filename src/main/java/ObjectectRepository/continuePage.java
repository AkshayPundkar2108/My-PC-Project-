package ObjectectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class continuePage {

	WebDriver driver;
	public	continuePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By clickoncontinue=(By.id("continue"));
	
	public WebElement clickoncontinue()
	{
		return driver.findElement(clickoncontinue);
	}
	
	By selecteditemList=By.xpath("//*[@class='cart_item_label']");
	public List<WebElement> itemtext()
	{
		  List<WebElement> la= driver.findElements(selecteditemList);
		return la;
	}
	
	By finish=By.id("finish");
	
	public WebElement finsh()
	{
		return driver.findElement(finish);
	}
	
	By thanksmsg=By.xpath("//*[@class='complete-header']");
	
	public String thanksmsg()
	{
		WebElement text= driver.findElement(thanksmsg);
		return text.getText();
	}
}
