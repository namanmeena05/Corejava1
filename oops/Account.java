package com.rays.oops;

public class Account {
	private String number = null;
	private String accountType = null;
	private double balance = 00.00;
	private double withdrawal = 00;
	private double payBill = 00;
	
	public String getNumber() {
		return number;
		
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAccountType() {
		return accountType;
		
	}public void setAccountType(String accountType) {
		this.accountType=accountType;
		
	}public double getBalance() {
		return balance;
		
	} public void setBalance(double balance) {
		this.balance=balance;
	}
	public void setWithdrawal(double withdrawal) {
		this.withdrawal = getBalance()-withdrawal;
		
	}public double getWithdrawal() {
		
		return withdrawal;
		
	}public void setPayBill(double payBill) {
		this.payBill = getBalance()-payBill;
	}public double getPayBill() {
		return payBill;
		
	}
	

}
