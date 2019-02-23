package com.java.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HanndliingAutoSuggession {
public static void main(String[] args) {
	String key="webdriver.chrome.driver";
	String value="./ReqSoftware/Chromedriver.exe";
	System.setProperty(key,value);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in");
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.findElement(By.id("lst-ib")).sendKeys("Java");
	List<WebElement> listAuto = driver.findElements(By.className("sbqs_c"));
	System.out.println("No of auto suggession"+listAuto.size());
	int c=1;
	WebElement el = null;
	for (WebElement webElement : listAuto) {
		System.out.println(webElement.getText());
		if(c==3) {
		 el=webElement;
		}
		c++;
	}
	el.click();
}
}
