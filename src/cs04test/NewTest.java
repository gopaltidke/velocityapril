package cs04test;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cs01Pomclasses.Cs01_login;
import cs01Pomclasses.Cs02_logout;
import cs02Base.BaseClasses;
import cs03Utility_pakage.Utility_class;

public class NewTest extends BaseClasses {
	
	Cs01_login login;
	Cs02_logout logout;
	@BeforeClass
	public void lanuchbrowser()
	{    
		lauchBrowser();
		login =new Cs01_login(driver);
		logout = new Cs02_logout(driver);
	}
	@BeforeMethod
	public void loginToGuruApp() throws EncryptedDocumentException, IOException
	{
	login.enteruserId(Utility_class.readDataFromExcel(0, 0));
	login.enterPAssword(Utility_class.readDataFromExcel(0, 1));
	login.clickOnLoginButtton();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	} 
	
	@Test
	 public void validateUserName() throws EncryptedDocumentException, IOException, InterruptedException 
	{
	int TCID=1000;
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	Utility_class.takeScreenshot(driver, TCID);
	}
	
	@AfterMethod
	public void logoutGuruapp() throws InterruptedException
	{
	Reporter.log("Logging out", true);
	}
	
	@AfterClass
	public void closingBrowser()
	{
	closeBrowser();
	}
	
  
}
