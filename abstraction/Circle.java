package com.rays.abstraction;

public class Circle extends Shape {

	private double radius = 0;
	public final double pi = 3.14;
	
	public Circle (double radius) {
		System.out.println(this.radius=radius);
		
	}
	public void area() {
		
		double totalArea = pi*radius*radius;
		System.out.println(totalArea);
		
		
		
		
		
	}

}
