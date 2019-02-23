package com.java.selenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestNG {

	@DataProvider
	public Object[][] dataStr() {
		
		Object [][] obj=new Object[2][2];
		obj[0][0]="String1";
		obj[0][1]="String2";
		obj[1][0]="String3";
		obj[1][1]="String4";
		
		return obj;
	}
	
	@Test(dataProvider="dataStr")
	public void man(String s1,String s2) {
		System.out.println(s1);
	}
	
}
