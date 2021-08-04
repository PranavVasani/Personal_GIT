package helper_utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;
	public ConfigDataProvider() throws Exception
	{
		File src = new File ("./Configuration/Config.properties");
		FileInputStream fis = new FileInputStream(src);
		pro = new Properties();
		pro.load(fis);
		
	}
	
	public String getBrowser()
	{
		return pro.getProperty("browser");
	}
	
	public String url()
	{
		return pro.getProperty("qaURL");
	}
}
