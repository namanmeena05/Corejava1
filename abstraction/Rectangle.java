package com.rays.abstraction;

public class Rectangle extends Shape {

	private int length = 0;
	private int width = 0;

	public Rectangle(int length, int width) {

		System.out.println(this.length = length);
		System.out.println(this.width = width);

	}

	public void area() {

		int total = length * width;
		System.out.println(total);

	}

}
