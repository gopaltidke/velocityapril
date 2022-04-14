package cs01Pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cs02_logout {

	@FindBy(xpath = "//a[text()='Log out']") private WebElement logoutbutton;

public Cs02_logout(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void logout() throws 
InterruptedException
{
Thread.sleep(100);
logoutbutton.click();
}

}
