package com.rays.interfaces;

public class Businessman2 implements Richman , SocialWorker{

	private String name=null;
	private String addr=null;
	
	public Businessman2(String name , String addr){
		System.out.println(this.name=name);
        System.out.println(this.addr=addr);		
	}
	public void earnMoney() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void donation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void party() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void helpToOthers() {
		System.out.println("help others");
		
	}

}
