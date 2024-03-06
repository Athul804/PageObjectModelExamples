package Pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginObjectsPageFactory {
	@FindBy(how = How.NAME,using = "username")  //instead to findelement we can use Find by annotation 
	public static WebElement username;
	@FindBy(name = "password")    //instead to findelement we can use Find by annotation (simple way)
	public static WebElement password;
	@FindBy(xpath = "//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	public static WebElement login;
	

}
