package com.zillow.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		prop = new Properties();
		
		FileInputStream fp;
		try {
			fp = new FileInputStream("/Users/mrugeshnpatel/Eclipse/com.zillow/src/main/java/com/zillow/config/config.properties");
			prop.load(fp);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setup() {

		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "/Users/mrugeshnpatel/Downloads/chromedriver");
			driver= new ChromeDriver();
		}else if(browserName.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "/Users/mrugeshnpatel/Downloads/geckodriver");
			driver= new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

}
