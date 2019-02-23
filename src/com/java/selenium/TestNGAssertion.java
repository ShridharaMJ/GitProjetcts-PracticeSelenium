package com.java.selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertion {
	
	@Test(groups="Smoke")
	public void test1() {
		
		Assert.assertTrue(false);
	}
	@Test(groups="regression")
	public void test2() {
		Assert.assertTrue(true);
		
	}
	@Test(groups= {"Smoke","regression"})
	public void test3() {
		Assert.assertFalse(false);
	}
	@Test(groups="system")
	public void test4() {
		Assert.assertFalse(true);
		
	}
	
	@Test(groups="system")
	public void test5() {
		Assert.assertTrue(false,"It is exceping true");
	}
	@Test(groups="Smoke")
	public void test6() {
		Assert.assertTrue(true,"It is excepting the true");
		
	}
	
	@Test(groups= {"Smoke","system","regression"})
	public void test7() {
		Assert.assertEquals(100, 100);
	}
	@Test(groups="system")
	public void test8() {
		Assert.assertEquals(100, 1001);
		
	}
	
	@Test(groups="Smoke")
	public void test9() {
		Assert.assertNotEquals(100, 100);
		
	
		
	}
	@Test(groups= {"Smoke","system","regression"})
	public void test10() {
		Assert.assertNotEquals(100, 1001);
		
	}
	

}
