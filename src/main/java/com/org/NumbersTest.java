package com.org;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NumbersTest {
	@BeforeSuite
	public void one() {
		System.out.println("First");
	}
	@AfterSuite
	public void two() {
		System.out.println("Second");
	}
@BeforeTest
	public void three() {
		System.out.println("Third");
	}
@AfterTest
	public void four() {
		System.out.println("Fourth");
	}
@BeforeClass
	public void five() {
		System.out.println("Fifth");
	}
@AfterClass
	public void six() {
		System.out.println("Sixth");
	}
@BeforeMethod
	public void seven() {
		System.out.println("Seventh");
	}
@AfterMethod
	public void eight() {
		System.out.println("eighth");
	}
@Test
	public void nine() {
		System.out.println("Ninth");
	}


}
