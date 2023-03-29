package testBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;


import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public Logger logger;
	public ResourceBundle rb;
	@BeforeClass(groups= {"Regression","Master","Sanity"})
	@Parameters("browser")
	public void setup(String br) {
		logger=LogManager.getLogger(this.getClass());
		
		if(br.equals("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		driver = new ChromeDriver(options);
		}
		else if(br.equals("edge")) {
			driver=new EdgeDriver();
		}
		else {
			driver=new FirefoxDriver();
		}
		
		
		//driver=new ChromeDriver();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		rb=ResourceBundle.getBundle("config");
		
		driver.get(rb.getString("appURL"));
		driver.manage().window().maximize();
	}
	@AfterClass(groups= {"Regression","Master","Sanity"})
	public void teardown() {
		driver.quit();
	}
	public String randomString() {
		String randomString1=RandomStringUtils.randomAlphabetic(5);
		return (randomString1);
		
	}
	
	public String randomNumber() {
		String randomNumber1=RandomStringUtils.randomNumeric(10);
		return (randomNumber1);
		
	}
	public String AlphaNumericValue() {
		String randomString2=RandomStringUtils.randomAlphabetic(5);
		
		String randomNumber2=RandomStringUtils.randomNumeric(10);
		return (randomString2+randomNumber2);
		
		
	}
	public String captureScreen(String tname) throws IOException{
		SimpleDateFormat df=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
				Date dt=new Date();
			String timeStamp=df.format(dt);
			TakesScreenshot takesScreenshot=(TakesScreenshot) driver;
			File source=takesScreenshot.getScreenshotAs(OutputType.FILE);
			String destination=System.getProperty("user.dir")+"\\screenshots\\"+tname+"_"+timeStamp+".png";
			try {
				FileUtils.copyFile(source, new File(destination));
			} catch (Exception e) {
				
				e.getMessage();
			}
		return destination;
	}
	
}
