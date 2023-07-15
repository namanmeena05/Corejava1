package com.rays.oops;

public class Automobile {
	private String color = null;
	private int speed = 00;
	private String make = null;
	
	public void setColor(String color) {
		this.color = color;
		
	}
	public String getColor() {
		return color;
		
	}public String getMake(){
		return make;
		
	}public void setMake(String make) {
		this.make = make;
	
		
	}public void setSpeed(int speed){
		this.speed = speed;
		
	}public int getSpeed() {
		return speed;
		
	}public void breck (int b) {
		int br = b;
		speed= speed-br;
		
	}public void changeGear(int changeGear) {
		
		speed = speed + changeGear;
	}public void acc (int j) {
		speed = speed + j;
	}
	

}
