package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pageobjects.LoginObjects;
import Pageobjects.LoginObjectsPageFactory;

public class LoginPagefactory {
	
	@Test
	public void logint() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium webdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		//if we put static in method we dont need to create object
		//also it avoids dependencies
		PageFactory.initElements(driver, LoginObjectsPageFactory.class);
		LoginObjectsPageFactory.username.sendKeys("Admin");
		LoginObjectsPageFactory.password.sendKeys("admin123");
		LoginObjectsPageFactory.login.click();
		
	}	
}