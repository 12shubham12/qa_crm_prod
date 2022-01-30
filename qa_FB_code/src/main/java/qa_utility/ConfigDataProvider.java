package qa_utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties prop;
	
	public ConfigDataProvider(){
		File src = new File("./Config/config.properties");
		
		try{
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		}
		catch(Exception e){
			System.out.println("config file not loaded successfully "+e.getMessage());
		}
	}
	
	public String getBrowser(){
		return prop.getProperty("browser");
	}
	
	public String getURL(){
		return prop.getProperty("url");
	}

}
