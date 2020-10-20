package com.Insight.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader implements PropertiesReader{
	
	
	public Properties prop;
	
	public PropertiesFileReader()
	{
		try {
			File file = new File(
					"C:\\Users\\Pratik\\Desktop\\RestAssured\\AutomationFramework\\src\\main\\java\\com\\Insight\\config\\Config.properties");
			FileInputStream fis = new FileInputStream(file);

			prop = new Properties();
			prop.load(fis);
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public String getUsername() {
		return prop.getProperty("Username");
		
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return prop.getProperty("Password");
	}

	@Override
	public String getURL() {
		// TODO Auto-generated method stub
		return prop.getProperty("URL");
	}

	@Override
	public String getBrowser() {
		// TODO Auto-generated method stub
		return prop.getProperty("Browser");
	}

	@Override
	public String getOS() {
		// TODO Auto-generated method stub
		return prop.getProperty("OS");
	}
	
}