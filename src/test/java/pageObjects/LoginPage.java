package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="userName")WebElement un;
	@FindBy(id="password")WebElement pw;
	@FindBy(xpath="//button[text()='Login']")WebElement ln;
	@FindBy(xpath="//button[text()='Log out']")WebElement lo;
	public void set_username(String UserName) {
		//driver.findElement(By.id("userName")).sendKeys(UserName);
		un.sendKeys(UserName);
	}
	public void set_password(String Password) {
		//driver.findElement(By.id("password")).sendKeys(Password);
		pw.sendKeys(Password);
	}
	public void clic_login() {
		//driver.findElement(By.xpath("//button[text()='Login']")).click();
		ln.click();
	}
	public boolean logout() {
		//return driver.findElement(By.xpath("//button[text()='Log out']")).isDisplayed();
		return lo.isDisplayed();
	}
	public String logout1() {
		return (lo.getText());
		
	}
	public void click_logout() {
		//driver.findElement(By.xpath("//button[text()='Log out']")).click();
		lo.click();
	}
}
