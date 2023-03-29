package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookStoreApplicationPage extends BasePage {

	public BookStoreApplicationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//span[text()='Login']")WebElement log;
	
	public void login() {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//WebElement log=driver.findElement(By.xpath("//span[text()='Login']"));
		js.executeScript("arguments[0].click();",log);
	}
}
