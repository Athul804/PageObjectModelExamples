package TestCases;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Pageobjects.LoginObjects;
import Pageobjects.Updateadmin;

public class Update {
	
		@Test
		public void update() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","C:\\Selenium webdriver\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(3000);
			//if we put static in method we dont need to create object
			//also it avoids dependencies
			LoginObjects.username(driver).sendKeys("Admin");
			LoginObjects.password(driver).sendKeys("admin123");
			LoginObjects.login(driver).click();
			Thread.sleep(3000);
			Updateadmin.admin(driver).click();
			Thread.sleep(3000);
			Updateadmin.Userrole(driver).sendKeys("ESS");
		 	Thread.sleep(3000);
			Updateadmin.User(driver).sendKeys("Athul");
			Updateadmin.search(driver).click();
			
			
		}	
	}
