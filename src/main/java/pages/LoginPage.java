package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "username")
	WebElement emailTxtBox;

	@FindBy(id = "password")
	WebElement passwordTxtBox;

	@FindBy(id = "loginButton")
	WebElement loginBtn;
	
	@FindBy(id = "switch-link")
	WebElement createAccountBtn;
	
	@FindBy(id = "qa-GENERIC_LIGHTBOX_CLOSE")
	WebElement closeSpecialOfferBtn;
	
	@FindBy(css = "h1._3tVNqDQBYk5Q4SeGbDUUk3._1wGfMpb8gbqgROScrowYLD.RIr0MzIfcaR0C_5J9UXLq")
	public WebElement welcomeMess; 
	
	
	@FindBy(id = "responseMessage")
	public WebElement responseMess;
	
	
	
	public void userLogin (String userEmail, String userPassword) {
		
        clearText(emailTxtBox);
		setText(emailTxtBox, userEmail);
		clickBtn(loginBtn);
		clearText(passwordTxtBox);
		setText(passwordTxtBox, userPassword);
		clickBtn(loginBtn);
		clickBtn(closeSpecialOfferBtn);
	}
	
public void noCredentialsLogin () {
		
        clearText(emailTxtBox);
		clickBtn(loginBtn);
	}

}
