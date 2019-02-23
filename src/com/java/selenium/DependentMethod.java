package com.java.selenium;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependentMethod {
@Test
public void test1() {
	Assert.assertTrue(true);
}

@Test(dependsOnMethods="test1")
public void test2() {
	Reporter.log("Test2 is passed",true);
}

@Test(dependsOnMethods= {"test1","test2"})
public void test3() {
	Reporter.log("Test3 is passed",true);
}

@Test
public void test4() {
	Assert.assertTrue(false);
}
@Test(dependsOnMethods="test4")
public void test5() {
	Reporter.log("Test5 got failed",true);
}
}
