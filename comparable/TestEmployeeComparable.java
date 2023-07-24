package com.rays.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestEmployeeComparable {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList();

		list.add(new Employee(4, "naman", "indore"));
		list.add(new Employee(2, "Abhishek", "bhopal"));
		list.add(new Employee(3, "Sachin", "panchor"));
		list.add(new Employee(4, "naman", "hathighat"));
		list.add(new Employee(5, "shubham", "rithward"));
		list.add(new Employee(6, "Deepak", "Nasrullaganj"));
		list.add(new Employee(8, "aditiya", "sehore"));
		list.add(new Employee(7, "adarsh", "larkui"));

		Collections.sort(list);

		Iterator it = list.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
