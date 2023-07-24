
package com.rays.methodOverriding;

public class Rectangle extends Shape {
	
	private int length =0;
	private int width =0;
	 
	public int getlength() {
		return length;
	}public void setLength(int length) {
		this.length=length;
	}public int getWidth() {
		return width;
	}public void setWidth(int width) {
		this.width=width;
		
	}public void area() {
		int total = length*width;
		System.out.println("Area Of Rectangle " + total);
	}

}
