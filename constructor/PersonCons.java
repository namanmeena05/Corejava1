package com.rays.constructor;

public class PersonCons {
	
	private String name = null;
	private int id = 0;
	private  String addr = null;
	
	public PersonCons() {
		System.out.println(" ");
	}
	public PersonCons(String name , String addr) {
		System.out.println(this.name=name);
		System.out.println(this.addr=addr);
	}public PersonCons(int id){
		System.out.println(this.id = id);
	}
	

}
