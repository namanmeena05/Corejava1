package com.rays.thread;

public class DisplayName extends Thread{
	String name = null;
	public DisplayName(String name) {
	this.name=name;	
	}
	public void run() {
	for(int i=1;i<=4;i++) {
		System.out.println(i + " " + name);
	}

}
}