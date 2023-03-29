package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ElementsPage;
import pageObjects.HomePage;
import pageObjects.TextBoxPage;
import testBase.BaseClass;

public class TC_001_Text_Box extends BaseClass {
@Test(groups= {"Sanity","Regression"})
void Text_Box() {
	logger.info("**** Started TC_001_Text_Box****");
	
	try {
		HomePage hm=new HomePage(driver);
		hm.Elements();
		logger.info("Clicked on Elements");
		ElementsPage ele=new ElementsPage(driver);
		ele.Text_Box();
		logger.info("Clicked on Text_Box");
		TextBoxPage tb=new TextBoxPage(driver);
		tb.User_Name(randomString());
		logger.info("Entered Username");
		tb.User_Email(AlphaNumericValue()+"@gamail.com");
		logger.info("Entered Email");
		String address=randomString();
		tb.current_Address(address);
		logger.info("Entered current address");
		tb.permanent_Address(address);
		logger.info("Entered permenant address");
		tb.Submit();
		logger.info("Clicked on submit");
		//boolean sub = tb.validate();
		Assert.assertEquals(tb.validate(), true);
		
		
	} catch (Exception e) {
		logger.info("Test case failed");
		//logger.error("Test failed in error");
		
		e.getMessage();
		
		e.printStackTrace();
		Assert.fail();
	}
}
}
