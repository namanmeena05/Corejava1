package com.rays.oops;

public class TestAutomobile {
	public static void main(String[] args) {
		Automobile am = new Automobile();
		am.setColor("red");
		am.setMake("Tesla");
		am.setSpeed(300);
		
		am.breck(77);
		am.changeGear(5);
		am.acc(310);
		System.out.println(am.getColor());
		System.out.println(am.getMake());
		System.out.println(am.getSpeed());
	
		
		
		
	}

}
