package qa_base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import qa_utility.BrowserFactory;
import qa_utility.ConfigDataProvider;
import qa_utility.ExcelDataProvider;

public class TestBase {
	
	ExcelDataProvider excel;
	ConfigDataProvider config;
	public WebDriver driver;
	
	@BeforeSuite
	//initialization by user2
	//Initialization
>>>>>>> 80cf601 (second commit from user1)
	public void initialization(){
		excel = new ExcelDataProvider();
		config = new ConfigDataProvider();
	}
	
	@BeforeClass
	public void setup(){
		BrowserFactory.startApplication(driver, config.getBrowser(), config.getURL());
	}
	
	@AfterClass
	public void teardown(){
		BrowserFactory.quitBrowser(driver);
	}

}
