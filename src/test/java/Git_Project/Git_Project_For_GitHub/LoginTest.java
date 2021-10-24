package Git_Project.Git_Project_For_GitHub;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//secure shell cryptography
public class LoginTest {

	public static WebDriver driver;
	
	@BeforeTest
	public void setUp(){
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver.exe");
		driver driver=new ChromeDriver();
		System.out.println("launch browser");
	}
	
	
	@Test
	public void doLogin()
	{
		System.out.println("Executing Login test");
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20L,  TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[id='email']")).sendKeys("p.sutar1995@gmail.com");
		driver.findElement(By.xpath("//*[id='pass']")).sendKeys("abcd");
		
		driver.findElement(By.name("login")).click();
		
		System.out.println("Log into facebook account");
		
		
		
	}
	
	@AfterTest
	public void QuitDriver()
	{
		if (driver!=null)
		driver.close();
	}
}
