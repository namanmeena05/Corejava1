package com.rays.clonning;

public class TestDeepCloning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Customer c = new Customer("Ram");
		Customer cm = (Customer) c.clone();
		
		
		
		
		cm.name="Krishna";
		cm.balance.balance=18;
		System.out.println(c.balance.balance);
		System.out.println(c.name);
		System.out.println(cm.name);
		System.out.println(cm.balance.balance);
	
	}

}
