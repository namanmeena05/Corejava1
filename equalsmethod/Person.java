package com.rays.equalsmethod;

public class Person {
	private int id =0;
	private String name =null;
   
	public int getId() {
		return id;
	}public void setId(int id) {
		this.id = id;
	}public String getName() {
		return name;
	}public void setName(String name) {
		this.name = name;
	}public Person(int id, String name){
		this.id=id;
		this.name=name;
		}
	
	public boolean equals(Object obj) {
		
		Person p = (Person) obj;
		boolean b = this.id==p.id&&this.name==p.name;
		
		return b;
	}
	public int hashCode() {
		String str = this.id +this.name;
		return str.hashCode();
	}
	
}
