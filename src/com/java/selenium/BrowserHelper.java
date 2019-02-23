package com.java.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserHelper {
	WebDriver driver;
	public void openBrowser(String url) {
		String key="webdriver.chrome.driver";
		String value="./ReqSoftware/Chromedriver.exe";
		System.setProperty(key,value);
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public void closeBrowse() {
		driver.close();
	}
}
