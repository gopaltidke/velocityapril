package cs01Pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cs01_login {
	@FindBy(xpath = "//input[@name='uid']") private WebElement userID;
	@FindBy(xpath = "//input[@name='password']") private WebElement password;
	@FindBy(xpath = "//input[@name='btnLogin']") private WebElement LoginButton;

	public Cs01_login(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void enteruserId(String uid) {
		userID.sendKeys(uid);
	}
	public void enterPAssword(String pwd)
	{
	password.sendKeys(pwd);
	}
	public void clickOnLoginButtton()
	{
	LoginButton.click(); 
	}
}
