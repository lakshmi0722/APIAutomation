package com.ng;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.testng.annotations.Test;

public class CreateUserData {
	
	@Test()
	public void createUser() {
		ArrayList li = new ArrayList();
		
		li.add("Rama");
		li.add("Kirshna");
		li.add("Sita");
		li.add("Lakshmi");
		li.add("Shekar");
		System.out.println(li);
		li.add("Sita");
		System.out.println(li);
		System.out.println(li.get(4));
	}


	@Test()
	public void students() {
		
		HashSet hs = new HashSet();
		
		hs.add("Student1");
		hs.add("Student2");
		hs.add("Student3");
		hs.add("Student4");
		hs.add("Student5");
		System.out.println(hs);
		hs.add("Student2");		
		System.out.println(hs);
		
	}
	
	@Test()
	public void teachers() {
		
		HashMap hm = new HashMap();
				
		hm.put(1, "ID");
		hm.put(2, "Name");
		hm.put(3, "Mobile No");
		hm.put(4, "Salary");
		System.out.println(hm);
	}
	
}
