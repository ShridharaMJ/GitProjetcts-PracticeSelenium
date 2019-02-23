package com.java.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable {
public static void main(String[] args) {
	int noOfROws=0;
	int NoOfCol=0;
	String key="webdriver.chrome.driver";
	String value="./ReqSoftware/Chromedriver.exe";
	System.setProperty(key,value);
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.cems.uwe.ac.uk/~pchatter/resources/html/emp_dept_data+schema.html");
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.manage().window().maximize();
		WebElement table = driver.findElement(By.className("MsoNormalTable"));
	List<WebElement> allrow = table.findElements(By.tagName("tr"));
	noOfROws=allrow.size();
	for (WebElement webElement : allrow) {
		List<WebElement> allcol = webElement.findElements(By.tagName("td"));
		NoOfCol=allcol.size();
		for (WebElement webElement2 : allcol) {
			System.out.println(webElement2.getText());
		}
	}
	System.out.println("No of Rows "+ noOfROws);
	
	System.out.println("No of Columns "+ NoOfCol);
	
}
}
