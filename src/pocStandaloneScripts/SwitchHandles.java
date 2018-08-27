package pocStandaloneScripts;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchHandles {

	public static void main(String[] args) {
		
		String chromeDriverPath="C:\\Users\\977250\\Documents\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://loyaltystage.tul.aa.com");
		
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://loyaltystage.tul.aa.com");
		
		Set<String> handles= driver.getWindowHandles();
		System.out.println(handles.size());
		

	}

}
