package com.rays.inheritence;

public class TestShapeInheritance {
	public static void main(String[] args) {
		RectangleInheritance r = new RectangleInheritance();
		r.setBorderWidth(12);
		r.setShapeName("rectangle");
		System.out.println(r.getBorderWidth());
		System.out.println(r.getShapeName());
		
		CircleInheritance c = new CircleInheritance();
		c.setradius(7);
		System.out.println(c.getRadius());
		c.area();
		
		TriangleInheritance t = new TriangleInheritance();
		t.setBase(6);
		t.setHeigth(3);
		t.area();
		t.setShapeName("circle");
		System.out.println(t.getShapeName());
	
	
				
	}

}
