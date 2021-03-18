package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
		action= new Actions(driver);
	}


	@FindBy(linkText = "Log in")
	WebElement LoginLink;

	public void openLoginpage() {
		clickBtn(LoginLink);
	}


	}
