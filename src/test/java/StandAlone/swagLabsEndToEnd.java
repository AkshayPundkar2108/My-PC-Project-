
package StandAlone;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class swagLabsEndToEnd {
	void open(WebDriver driver) {
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	void Login(WebDriver driver)
	{
		//   WebDriver driver
	
		driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id='login-button']")).click();
		
	}
	void addTocart(WebDriver driver)
	{
		List<WebElement> clickOnaddtocart=driver.findElements(By.xpath("//*[@class='btn btn_primary btn_small btn_inventory ']"));
		
		for(WebElement ss:clickOnaddtocart)
		{
			ss.click();
			
			/*
			 * here we have to select all 6 add to cart but by using for loop we select first 5add to cart 
			 * if we want to select all6 then used for each loop 
			 * 
			 */
		}
	}
	
	void cartpageDetails(WebDriver driver)
	{
		WebElement clickOnCart=driver.findElement(By.xpath("//*[@class='shopping_cart_link']"));
		clickOnCart.click();
		
		List<WebElement> veriaddditeminCart=driver.findElements(By.xpath("//*[@class='inventory_item_name']"));
		
		for(WebElement ch:veriaddditeminCart)
		{
			System.out.println(ch.getText());

		}
		
		System.out.println("***********************");
		WebElement cartlist=driver.findElement(By.xpath("//*[@class='cart_list']"));
		System.out.println(cartlist.getText());
	}
	
	void checkoutpageDetails(WebDriver driver)
	{
		WebElement clickOncheckOut=driver.findElement(By.xpath("//*[@id='checkout']"));
		clickOncheckOut.click();
		
		driver.findElement(By.id("first-name")).sendKeys("Yogesh");
		driver.findElement(By.id("last-name")).sendKeys("Tayade");
		driver.findElement(By.id("postal-code")).sendKeys("443103");
		
		
		WebElement clickontinue=driver.findElement(By.id("continue"));
		
		clickontinue.click();
		
		System.out.println("*****************");
		
	}
	
	void itemsForCheckOut(WebDriver driver)
	{
		//*[@id='checkout_summary_container']
		
		WebElement itemsInCart=driver.findElement(By.xpath("//*[@id='checkout_summary_container']"));
		System.out.println(itemsInCart.getText());
	}
	
	void finish(WebDriver driver)
	{
		driver.findElement(By.id("finish")).click();
		WebElement thanku=driver.findElement(By.xpath("//*[@class='complete-header']"));
		System.out.println(thanku.getText());
	}
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow=origins=*");
		co.setBinary("C:/Users/eryog/Downloads/chrome-win64/chrome-win64/chrome.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		swagLabsEndToEnd obj = new swagLabsEndToEnd();
		obj.open(driver);
		obj.Login(driver);
		obj.addTocart(driver);
		obj.cartpageDetails(driver);
		obj.checkoutpageDetails(driver);
		obj.itemsForCheckOut(driver);
		obj.finish(driver);
	}

}
