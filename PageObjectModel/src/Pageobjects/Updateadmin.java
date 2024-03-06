package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Updateadmin {
	
	public static WebElement admin(WebDriver driver)
	{
		return(driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")));
	}
	
	public static WebElement Userrole(WebDriver driver)
	{
		return(driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")));
	}
	public static WebElement User(WebDriver driver)
	{
		return(driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")));
	}
	public static WebElement search(WebDriver driver)
	{
		return(driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")));
	}


}
