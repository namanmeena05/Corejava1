package com.rays.methodOverriding;

public class Circle extends Shape{
	
	private int radius =0;
	public final double pi = 3.14;
	
	public int getRadius() {
		return radius;
	}public void setRadius(int radius) {
		this.radius=radius;
		
	}public void area() {
		double total =   pi *radius *radius;
		System.out.println("Area Of Circle "+ total);
	} public static Shape getShape(int radius) {
		System.out.println( radius= 2*radius);
		return null;
		
	}
	

}
