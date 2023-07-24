package com.rays.comparable;

public class Employee implements Comparable<Employee> {

	private int id = 0;
	private String name = null;
	private String addr = null;

	public Employee(int id, String name, String addr) {
		this.id = id;
		this.name = name;
		this.addr = addr;

	}

	public String toString() {

		return id + ", " + name + ",  " + addr;
	}

	public int compareTo(Employee o) {

		if (this.id - o.id == 0) {

			if (this.name.compareTo(o.name) == 0) {
				int d = this.addr.compareTo(o.addr);
				return d;
			} return this.name.compareTo(o.name) ;

		}
		return this.id - o.id;

		
	}

	private String namecompareTo() {
		
		return null;
	}

}
