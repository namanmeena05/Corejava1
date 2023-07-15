package com.rays.interfaces;

public class Businessman3 implements SocialWorker {
	
	private String name = null;
	private String addr = null;
	
	public Businessman3(String name , String addr ) {
		
		System.out.println(this.name=name);
		System.out.println(this.addr=addr);
		
	}

	public void helpToOthers() {
		
		System.out.println("Sachin help all needy people");
		
		
	}

}
