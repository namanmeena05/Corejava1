package com.rays.inheritence;

public class CircleInheritance extends ShapeInheritance{
	private int radius =0;
	
	public int getRadius() {
		return radius;
		
	}public void setradius(int radius) {
		this.radius=radius;
		
		
	}public void area() {
		 double ar = 2*3.14 * radius*radius;
	
		System.out.println(ar);
	}

}
