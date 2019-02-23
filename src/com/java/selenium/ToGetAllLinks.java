package com.java.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ToGetAllLinks extends BrowserHelper  {
	
	public void allLinks() {
		
		openBrowser("https://www.flipkart.com/");
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		System.out.println("No. of links"+ alllinks.size());
		for (WebElement webElement : alllinks) {
			System.out.println("Links- "+webElement.getText());
		}
	closeBrowse();
	}
	
	
public static void main(String[] args) {
	
	ToGetAllLinks al=new ToGetAllLinks();
	al.allLinks();
}
}
