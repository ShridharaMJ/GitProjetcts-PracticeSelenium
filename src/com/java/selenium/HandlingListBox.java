package com.java.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class HandlingListBox {

	public static ArrayList<String> getListOfData(WebElement element) {
		Select select = new Select(element);
		List<WebElement> alldata = select.getOptions();
		ArrayList<String> al = new ArrayList<String>();
		for (WebElement webelement : alldata) {
			al.add(webelement.getText());
		}
		return al;
	}

	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String value = "./ReqSoftware/Chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement webel = driver.findElement(By.className("ui fluid selection dropdown active visible"));
		ArrayList<String> listofdata = getListOfData(webel);
		java.util.Collections.sort(listofdata);
		for (String str : listofdata) {
			System.out.println(str);

		}

	}
}
