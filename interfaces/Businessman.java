package com.rays.interfaces;

public class Businessman implements Richman{
    private String name =null;
    private String addr=null;
    
	public Businessman(String name , String addr) {
		System.out.println(this.name=name);
		System.out.println(this.addr=addr);
		
	}
	public void earnMoney() {
		System.out.println("earnMoeny");
		
	}

	public void donation() {
		System.out.println("donation");
	}

	
	public void party() {
		System.out.println("party");
	}

}
