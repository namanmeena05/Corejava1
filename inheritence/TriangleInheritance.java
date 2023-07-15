package com.rays.inheritence;

public class TriangleInheritance extends ShapeInheritance{
	private int base =0;
	private int heigth =0;
	
	public int getBase() {
		return base;
		
	}
	public void setBase(int base) {
		this.base=base;
	} public int getHeigth() {
		return heigth;
		
	}public void setHeigth(int heigth) {
		this.heigth=heigth;
	}public void area() {
		int a=base*heigth;
		System.out.println("AREA OF TRIANGLE "+a);
		
	}

}
