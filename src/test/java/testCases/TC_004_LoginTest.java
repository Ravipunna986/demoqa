package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.BookStoreApplicationPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_004_LoginTest extends BaseClass{
	@Test(groups= {"Sanity"})
	public void test_Login() {
		try {
			logger.info("****Login Test****");
			HomePage hp=new HomePage(driver);
			hp.Book_Store_Application();
			logger.info("Clicked on BookStore Application");
			BookStoreApplicationPage bsa=new BookStoreApplicationPage(driver);
			bsa.login();
			logger.info("Clicked on Login Page");
			LoginPage lp=new LoginPage(driver);
			lp.set_username(rb.getString("UserName"));
			logger.info("Entered User name");
			lp.set_password(rb.getString("Password"));
			logger.info("Entered password");
			lp.clic_login();
			logger.info("Clicked on login button");
			Assert.assertEquals(lp.logout(), true);
			logger.info("Validations");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getStackTrace();
			e.getMessage();
			e.printStackTrace();
			Assert.fail();
		}
	
		logger.info("***********login finished********");
	
	}

}
