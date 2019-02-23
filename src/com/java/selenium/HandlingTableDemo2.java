package com.java.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTableDemo2 extends BrowserHelper{

public void handligTd() {
	openBrowser("https://www.contextures.com/xlSampleData01.html");
	WebElement table = driver.findElement(By.xpath("//table[@bordercolor='#6666FF']"));
	List<WebElement> allTr = table.findElements(By.tagName("tr"));
	for (WebElement webElement : allTr) {
		List<WebElement> allTd = webElement.findElements(By.tagName("td"));
		System.out.println(allTd.size());
		
		for (WebElement webElement2 : allTd) {
			System.out.print(webElement.getText());
		}
		
		System.out.println("");
	}
	
}
	
	public static void main(String[] args) {
		HandlingTableDemo2 hd=new HandlingTableDemo2();
		hd.handligTd();
	}
}
