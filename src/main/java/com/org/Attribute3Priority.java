package com.org;

import org.testng.annotations.Test;

public class Attribute3Priority {
	

	@Test(priority=3)
	public void pomo() {
		System.out.println(("pomogranate fruit"));
	}

	@Test(priority=2)
	public void mango() {
		System.out.println(("Mango fruit"));
	}

	@Test(priority=5)
	public void apple() {
		System.out.println(("Apple fruit"));
	}
	
	@Test(priority=1)
	public void orange() {
		System.out.println(("Orange fruit"));
	}
	
	@Test(priority=4)
	public void grapes() {
		System.out.println(("Grapes fruit"));
	}
	
	@Test
	public void banana() {
		System.out.println(("Banana fruit"));
	}
	
		
}
