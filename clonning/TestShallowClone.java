package com.rays.clonning;

public class TestShallowClone {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Account a = new Account(12);
		
		Account b = (Account) a.clone();
		b.balance=19;
		System.out.println(a.balance);
		System.out.println(b.balance);
		}

}
