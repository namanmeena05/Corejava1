package com.rays.clonning;

public class Dealer implements Cloneable {
	
	int balance =0;
	
	public Dealer(int balance) {
		this.balance=balance;
		
	}
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

}
