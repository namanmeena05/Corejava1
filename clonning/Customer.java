package com.rays.clonning;

public class Customer implements Cloneable {
	
	String name = null; 
	Dealer balance = null; 
	
	public Customer(String name  ) {
		this.name=name;
		this.balance=new Dealer(10); 
	}
	protected Object clone() throws CloneNotSupportedException {
		
		Customer cu = (Customer) super.clone(); 
		
		cu.balance =(Dealer) balance.clone(); 
		
		return cu;
	}

}
