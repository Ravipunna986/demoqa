package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage extends BasePage {

	public ElementsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void Text_Box() {
		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
	}
	public void Check_Box() {
		driver.findElement(By.xpath("//span[text()='Check Box']")).click();
			}
	
	
	
	
	
	
	
}
