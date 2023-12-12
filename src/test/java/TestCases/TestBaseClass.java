package TestCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import ObjectectRepository.loginpage;
import Utilities.ReaddatafromExternalFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.io.FileHandler;

public class TestBaseClass {
	public static WebDriver driver;
	public   loginpage  login;
	ReaddatafromExternalFile read = new ReaddatafromExternalFile();
	public	String baseurl = read.getapplicationurl();
	public String username = read.getusername();
	public String password = read.getpassword();

@BeforeClass
	public WebDriver setupmethod() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow=origins=*");
		co.setBinary("C:/Users/eryog/Downloads/chrome-win64/chrome-win64/chrome.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;
	}
public String getscreenshot(String testCaseName , WebDriver driver)
{
	File obj=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
try {
	FileHandler.copy(obj, new File("C:\\Users\\admin\\eclipse-workspace1(mobie_testing )\\Automation_FrameWork\\screenshot\\Images.jpg"));
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//	FileHandler.copy(obj, new File("user.dir")+"//reports"+testCaseName+".png");
return testCaseName;

}
   public loginpage launchApplication() {
	   
	   
	   driver= setupmethod();
	   
	   login = new loginpage(driver);
	   login.goTo();
	   return login;
   }

}
