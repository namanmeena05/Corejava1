package com.rays.thread;

public class TestExThread {
	
	public static void main(String[] args) {
		
		DisplayName dn = new DisplayName("naman");
		DisplayName dn1 = new DisplayName("sachin");
		Thread t1 = new Thread(dn);
		Thread t2 = new Thread(dn1);
		t2.start();
		t1.start();
	}

}
