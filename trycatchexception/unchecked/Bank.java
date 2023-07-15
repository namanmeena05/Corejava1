package com.rays.trycatchexception.unchecked;

public class Bank {
	
	
	  private int amount = 1000; private int deposite = 0; private int withdrawl =0;
	 
	public Bank(int deposite , int withdrawl) throws Unchecked{
		int total =this.deposite=amount + deposite;
		System.out.println("Total amount " + total);
		
		int finalbalance = this.withdrawl = total - withdrawl;
		System.out.println("After withdrawl "+ finalbalance);
		
		
	if( finalbalance >=2000)

	{
		System.out.println("Balance is sufficient");

	}else
	{
		throw new Unchecked();
	}

}}
