package com.rays.thread;

public class RunnableObject implements Runnable {
	
	String shapeName = null;
	
	public RunnableObject (String shapeName) {
		this.shapeName=shapeName;
		
	}
public void run() {
	
	while(true) {
		System.out.println(  " " + shapeName);
		
	}
} 
}
