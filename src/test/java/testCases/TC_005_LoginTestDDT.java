package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.BookStoreApplicationPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_005_LoginTestDDT extends BaseClass{
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class,groups= {"Regression"})
	public void test_LoginDDT(String UserName1,String Password1,String exp) {
		try {
			logger.info("****Login Test****");
			HomePage hp=new HomePage(driver);
			hp.Book_Store_Application();
			logger.info("Clicked on BookStore Application");
			BookStoreApplicationPage bsa=new BookStoreApplicationPage(driver);
			bsa.login();
			logger.info("Clicked on Login Page");
			LoginPage lp=new LoginPage(driver);
			
			lp.set_username(UserName1);
			logger.info("Entered User name");
			lp.set_password(Password1);
			logger.info("Entered password");
			lp.clic_login();
			logger.info("Clicked on login button");
		
			/*boolean target=lp.logout();
			System.out.println(target);
			
			if(exp.equals("Valid")) 
			{
				if(target) {
							lp.click_logout();
							driver.navigate().back();
							driver.navigate().back();
							Assert.assertTrue(true);
					}
				else {
							Assert.fail();
					}
				}
			else if(exp.equals("Invalid")) {
				 if(target) {
								lp.click_logout();
								Assert.fail();
								
							}
							else {
								Assert.assertTrue(true);
							}

				}*/
			
			String target = "";
			try {
				 target = lp.logout1();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			logger.info("testing string");
			if(exp.equals("Valid")) 
			{
				if(target.equals("Log out")) {
							lp.click_logout();
							driver.navigate().back();
							driver.navigate().back();
							Assert.assertTrue(true);
					}
				else {
							Assert.fail();
					}
				}
			else if(exp.equals("Invalid")) {
				 if(target.equals("Log out")) {
								lp.click_logout();
								Assert.fail();
								
							}
							else {
								driver.navigate().back();
								driver.navigate().back();
								Assert.assertTrue(true);
							}

				}
			
			
		} catch (Exception e) {
			
			//e.getStackTrace();
			//e.getMessage();
			e.printStackTrace();
			Assert.fail();
		}
	
		logger.info("***********login finished********");
	
	}

}
