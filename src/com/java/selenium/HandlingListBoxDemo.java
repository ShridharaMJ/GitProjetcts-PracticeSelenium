package com.java.selenium;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBoxDemo extends BrowserHelper{

	public void countDatInListBox() {
	openBrowser("https://semantic-ui.com/modules/dropdown.html");
	WebElement select_ref = driver.findElement(By.name("skills"));
		Select select=new Select(select_ref);
		List<WebElement> list_ref = select.getOptions();
		System.out.println(list_ref.size());
	//	Actions act=new Actions(driver);
		
		for (WebElement webElement : list_ref) {
			System.out.println(webElement.getText());
		}
		
		closeBrowse();
	}
	
	public static void main(String[] args) {
		HandlingListBoxDemo demo=new HandlingListBoxDemo();
		demo.countDatInListBox();
	}
}
