package com.rays.methodOverriding;

public class TestShape {

	public static void main(String[] args) {

		Shape s = new Rectangle();

		Rectangle r = (Rectangle) s;
		Shape s1 = new Circle();

		Shape s2 = new GetShape();
		GetShape g = (GetShape) s2;
		System.out.println(g.getShape(3));
		

		Circle c = (Circle) s1;
		r.setBorderWidth(10);
		r.setColor("Yellow");
		r.setLength(4);
		r.setWidth(12);
		c.setRadius(7);
		c.area();
		r.area();
		System.out.println(r.getBorderWidth());
		System.out.println(r.getColor());
		System.out.println(r.getlength());
		System.out.println(r.getWidth());

	}

}
