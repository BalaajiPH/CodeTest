package main.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CommonLibrary {
	
	static WebDriver driver;
	
	public WebDriver getDriver(String sDriver) {
		
		switch(sDriver)
		{
		
		case "ie":
			System.setProperty("webdriver.ie.driver", "src/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
			
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "src/chromedriver.exe");
			driver = new ChromeDriver();
			break;
			
		case "ff":
			System.setProperty("webdriver.gecko.driver", "src/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
			
		case "edge":
			System.setProperty("webdriver.edge.driver", "src/MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
			break;
		}
		return driver;
	}
	
	public void navigateTo(String sURL) {	
		
		driver.get(sURL);
		driver.manage().window().maximize();
		
		
	}
	
	public void closeBrowser() {
		
		driver.quit();		
		
	}
}
