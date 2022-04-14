package cs02Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class BaseClasses {

	protected WebDriver driver;
	
	public void lauchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");

	ChromeOptions opt= new ChromeOptions();
	opt.addArguments("--disable-notifications");
	driver= new ChromeDriver(opt);
	driver.get("https://demo.guru99.com/Agile_Project/Agi_V1/index.php");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	driver.manage().window().maximize();
    Reporter.log("Browser sussessfuul open",true);
    }
	public void closeBrowser() {
		driver.close();
		Reporter.log("browsee successfull close");
	}


}
