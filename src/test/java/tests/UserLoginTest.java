package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import data.ExcelReader;
import pages.HomePage;
import pages.LoginPage;

public class UserLoginTest extends TestBase{
	
	
	HomePage homeOpj;
	LoginPage loginOpj;
	
	@DataProvider(name ="loginData")
	public Object[][] UserRegistrationData() throws IOException{
	
		String sheetName="loginData";
		ExcelReader readerObj= new ExcelReader();
		Object excelDataAr [][]=readerObj.getExcelData(sheetName);
		return excelDataAr;
	} 
	
	
	/*String userMail= "va3afhxze@moakt.co";
	String userPass= "Y&9tQ/Xu<ke,7D-";*/
	
	@Test(priority = 1,dataProvider = "loginData")
	public void userLoginSuccss(String userMail,String userPass) {

		homeOpj.openLoginpage();
		loginOpj=new LoginPage(driver);
		loginOpj.userLogin(userMail, userPass);
		Assert.assertTrue(loginOpj.welcomeMess.getText().contains("Welcome"));
	}
	
	@Test(priority = 2)
	public void userLoginNoCredentials() {

		homeOpj.openLoginpage();
		loginOpj=new LoginPage(driver);
		loginOpj.noCredentialsLogin();
		Assert.assertTrue(loginOpj.responseMess.isDisplayed());
	}

}
