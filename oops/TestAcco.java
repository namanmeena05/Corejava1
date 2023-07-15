package com.rays.oops;

public class TestAcco {

	public static void main(String[] args) {
		Account a = new Account();
		a.setAccountType("123456789");
		System.out.println("ACC NO : " + a.getAccountType());
		a.setAccountType("SaVING");
		System.out.println(a.getAccountType());
		a.setBalance(12000.12);
		System.out.println(a.getBalance());
		a.setWithdrawal(1000.00);
		System.out.println(a.getWithdrawal());
		a.setPayBill(120);
		System.out.println(a.getPayBill());

	}

}
