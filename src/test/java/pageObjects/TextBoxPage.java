package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage extends BasePage{
	

	public TextBoxPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Locators
	
	//Methods
	public void User_Name(String username) {
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(username);
		
	}
	public void User_Email(String email) {
		driver.findElement(By.id("userEmail")).sendKeys(email);
	}
	public void current_Address(String currentAddress) {
		driver.findElement(By.id("currentAddress")).sendKeys(currentAddress);
	}
	public void permanent_Address(String permanentAddress) {
		driver.findElement(By.id("permanentAddress")).sendKeys(permanentAddress);
	}
	public void Submit() {
		WebElement clicksubmit=driver.findElement(By.xpath("//button[@id='submit']"));
		//clicksubmit.click();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",clicksubmit);
		//Actions ac=new Actions(driver);
		
		//ac.keyDown(Keys.TAB).keyUp(Keys.TAB).click(clicksubmit).build().perform();
		//ac.doubleClick(clicksubmit).build().perform();
		//ac.sendKeys(Keys.TAB).click().build().perform();
	//	JavascriptExecutor js= (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();",clicksubmit);
	//	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
	//	wait.until(ExpectedConditions.elementToBeClickable(clicksubmit));
		//ac.sendKeys(Keys.TAB).doubleClick().build().perform();
	}
	public boolean validate() {
		return driver.findElement(By.xpath("//div[@class='border col-md-12 col-sm-12']")).isDisplayed();
	}
	public String validate1() {
		 return driver.findElement(By.xpath("//div[@class='border col-md-12 col-sm-12']/p[3]")).getText();
		
	}
}
