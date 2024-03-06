package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pageobjects.LoginObjects;
import Pageobjects.LoginObjectsPageFactory;
import Pageobjects.Updateadmin;
import Pageobjects.UpdateadminPagefactory;

public class UpdatePagefactory {
	
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
		PageFactory.initElements(driver, UpdateadminPagefactory.class);
		LoginObjectsPageFactory.username.sendKeys("Admin");
		LoginObjectsPageFactory.password.sendKeys("admin123");
		LoginObjectsPageFactory.login.click();
		Thread.sleep(3000);
		UpdateadminPagefactory.admin.click();
		Thread.sleep(3000);
		UpdateadminPagefactory.Userrole.sendKeys("ESS");
	 	Thread.sleep(3000);
	 	UpdateadminPagefactory.User.sendKeys("Athul");
	 	UpdateadminPagefactory.search.click();
		
	}	
}
