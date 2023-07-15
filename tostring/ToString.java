package com.rays.tostring;

public class ToString {

	private int id = 0;
	private String name = null;

	public ToString(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public String toString() {
		return name + " " + id;
	}

}
