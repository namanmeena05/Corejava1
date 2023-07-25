package com.rays.thread;

public class TestDeoman {
	

	
	public static void main(String[] args) {
		
		
		RunnableObject r1 = new RunnableObject("circle");
		RunnableObject r2 = new RunnableObject("Square");
		RunnableObject r3 = new RunnableObject("Pentagon");
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		
		t1.setDaemon(true);
		t2.setDaemon(true);
		
		
		t1.start();
		t2.start();
		t3.start();
	}
	
	
	



}
