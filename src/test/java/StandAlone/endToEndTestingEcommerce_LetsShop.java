package StandAlone;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class endToEndTestingEcommerce_LetsShop {
	void open(WebDriver driver) {
		driver.get("https://rahulshettyacademy.com/client/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	void login(WebDriver driver) throws Exception {
		WebElement username = driver.findElement(By.id("userEmail"));
		username.sendKeys("eryogeshtayade92@gmail.com");
		WebElement password = driver.findElement(By.id("userPassword"));
		password.sendKeys("Yogeshrk45@");
		WebElement loginbtn = driver.findElement(By.id("login"));
		loginbtn.click();
		Thread.sleep(2000);
	}

	
	void addTocart(WebDriver driver) throws Exception
	{
		WebElement add=driver.findElement(By.xpath("(//button[@class='btn w-10 rounded'])[1]"));
		add.click();
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='btn w-10 rounded'])[1]")));
			
			Thread.sleep(3000);
	}
void cart(WebDriver driver)
{
	driver.findElement(By.xpath("//*[@routerlink='/dashboard/cart']")).click();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(7));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@routerlink='/dashboard/cart']")));	

	WebElement cartVerify=driver.findElement(By.xpath("//*[text()='zara coat 3']"));
	String expected=cartVerify.getText();
	Assert.assertEquals(expected, "ZARA COAT 3");
	
	WebElement clickonbuyNow=driver.findElement(By.xpath("//*[text()='Buy Now']"));
	clickonbuyNow.click();
}
void paymentdetails(WebDriver driver) throws Exception
{
	
	WebElement conuntrybox=driver.findElement(By.xpath("//*[@placeholder='Select Country']"));
	conuntrybox.sendKeys("ind");
	conuntrybox.click();
	Thread.sleep(2000);
	List<WebElement> listofcountry=driver.findElements(By.xpath("//*[@class='ng-star-inserted']"));
	for(WebElement ch:listofcountry)
	{
		//System.out.println(ch.getText());
		if(ch.getText().equalsIgnoreCase("India"))
		{
			ch.click();
		}
	}
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@class='btnn action__submit ng-star-inserted']")).click();
	
	WebElement text=driver.findElement(By.linkText(" Thankyou for the order. "));
	Thread.sleep(2000);

	System.out.println(text.getText());
}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/eryog/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow=origins=*");
		co.setBinary("C:/Users/eryog/Downloads/chrome-win64/chrome-win64/chrome.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		endToEndTestingEcommerce_LetsShop obj = new endToEndTestingEcommerce_LetsShop();
		obj.open(driver);
		obj.login(driver);
		obj.addTocart(driver);
		obj.cart(driver);
		obj.paymentdetails(driver);
		
	}

}
