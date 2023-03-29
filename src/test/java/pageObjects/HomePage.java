package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	JavascriptExecutor js= (JavascriptExecutor)driver;

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//@FindBy(xpath="//h5[text()='Elements']") WebElement ElementsLoc;
	
	
	//Locators
	@FindBy(xpath="//h5[text()='Book Store Application']")WebElement bksa;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
public void Elements() {
	WebElement ele=driver.findElement(By.xpath("//h5[text()='Elements']"));
	
	js.executeScript("arguments[0].click();",ele);
}
public void Forms() {
	driver.findElement(By.xpath("//h5[text()='Forms']")).click();
}
public void Alerts_Frame_Windows() {
	driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();
}
public void Widgets() {
	driver.findElement(By.xpath("//h5[text()='Widgets']")).click();
}
public void Book_Store_Application() {
	//WebElement bksa=driver.findElement(By.xpath("//h5[text()='Book Store Application']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",bksa);
}

}
