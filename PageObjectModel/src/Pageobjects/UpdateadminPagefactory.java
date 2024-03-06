package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
public class UpdateadminPagefactory {
	@FindBy(xpath = "//*[@id=\'app\']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")
	public static WebElement admin;
	
	@FindBy(xpath ="//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")
	public static WebElement Userrole;
	@FindBy(xpath ="//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")
	public static WebElement User;
	@FindBy(xpath="//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")
	public static WebElement search;
	}
