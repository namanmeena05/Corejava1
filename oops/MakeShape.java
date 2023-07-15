package com.rays.oops;

public class MakeShape {
	public static void main(String[] args) {
		Shape s = new Shape();
		 s.setBorderWidth(3);
		 s.setColor("red");
		 s.setDimension(2);
	    System.out.println(s.getBorderWidth());
	    System.out.println(s.getColor());
	    System.out.println(s.getDimension());
	    
	}

}
