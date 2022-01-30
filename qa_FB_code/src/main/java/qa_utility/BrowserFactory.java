package qa_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
public static WebDriver startApplication(WebDriver driver, String browser, String url){		
		
		if(browser.equalsIgnoreCase("firefox")){
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			}
		else if(browser.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			}
		else{
			System.out.println("No such browser");
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
	
	//quit browser
	public static void quitBrowser(WebDriver driver){
		driver.quit();
	}
}
