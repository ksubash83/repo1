package pocStandaloneScripts;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		
		String chromeDriverPath="C:\\Users\\977250\\Documents\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://loyaltystage.tul.aa.com");
		
		//Convert driver object to TakesScreenshot		
		TakesScreenshot srcShot=((TakesScreenshot)driver); 
		
		//Use getScreenshotAs method to capture the screenshot		
		File srcFile=srcShot.getScreenshotAs(OutputType.FILE);
		
		//Copy the screenshot to the required png file		
		File destFile=new File("C:\\Users\\977250\\Documents\\Automation Framework\\workspace\\screenshots\\Screenshot_" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) +".png");
		
		//Need CommonsIO jar for this to work
		FileUtils.copyFile(srcFile,destFile);

	}

}
