package com.rays.methodOverriding;

public class GetShape extends Shape {
	
	public static Shape getShape(int i) {
		if (i==1) return new Rectangle();
		if (i==2) return new Circle();
		if(i==3) return new Shape();
		return null;
			
	}

}
