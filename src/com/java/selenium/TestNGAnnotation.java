package com.java.selenium;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation {

	
	@BeforeSuite
	public void test1() {
System.out.println("Executing @BeforeSuite ");
	}

	@BeforeTest
	public void test2() {
		System.out.println("Executing @BeforeTest ");
	}
@BeforeClass
	public void test3() {
		System.out.println("Executing @Beforeclass ");
	}
@BeforeMethod
	public void test4() {
	System.out.println("Executing @Beforemethod ");

	}
@AfterSuite
	public void test5() {
System.out.println("Executing @AfterSuite ");
	}


@AfterTest
	public void test6() {
		System.out.println("Executing @Aftertest ");
	}

@AfterClass
	public void test7() {
	System.out.println("Executing @Aftertest ");
	}
@AfterMethod
	public void test8() {
	System.out.println("Executing @Aftermethod ");
	}
@Test
	public void test9() {
	System.out.println("Executing @ATest1");
	}
@Test
	public void test10() {
	System.out.println("Executing @ATest2");
	}
}
