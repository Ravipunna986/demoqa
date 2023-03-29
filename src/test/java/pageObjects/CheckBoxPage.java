package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxPage extends BasePage{

	public CheckBoxPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
public void click_on_Expand() {
	driver.findElement(By.xpath("//button[@aria-label='Expand all']")).click();
}
public void Click_on_Notes() {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Notes']")));
	driver.findElement(By.xpath("//span[text()='Notes']")).click();
	driver.findElement(By.xpath("//span[text()='Private']")).click();
}
public void Selecting_Private() {
	List<WebElement> ls=driver.findElements(By.xpath("//li[@class='rct-node rct-node-parent rct-node-expanded']//li[@class='rct-node rct-node-leaf']"));
	for(WebElement lst:ls) {
		if(lst.getText().equals("Private")){
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();",lst);
			//lst.click();
		}
	}
}
}
