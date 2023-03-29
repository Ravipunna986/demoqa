package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CheckBoxPage;
import pageObjects.ElementsPage;
import pageObjects.HomePage;
import pageObjects.TextBoxPage;
import testBase.BaseClass;

public class TC_002_Check_Box extends BaseClass {
	@Test(groups= {"Sanity","Regression"})
	void Check_Box() {
		logger.info("**** Started TC_002_Check_Box****");
		
		try {
			HomePage hm=new HomePage(driver);
			hm.Elements();
			logger.info("Clicked on Elements");
			ElementsPage ele=new ElementsPage(driver);
			ele.Check_Box();
			logger.info("Clicked on Check_Box");
			CheckBoxPage cb=new CheckBoxPage(driver);
			cb.click_on_Expand();
			logger.info("Clicked on Expand");
			cb.Click_on_Notes();
			logger.info("Clicked on Notes");
			//cb.Selecting_Private();
			logger.info("Clicked on Private");
			
			
		} catch (Exception e) {
			Assert.fail();
			logger.info("Test case failed");
			
			e.getMessage();
			
			e.printStackTrace();
			
		
		}
	}
	}


