package com.rays.orverridingwithConstructor;


public class TestShape {
	public static void main(String[] args) {
		
		Shape s[] = new Shape[2];
				
		s[0]= new Triangle("triangle",9,9);
		s[1]= new Circle(" circle" , 2);
												
		for (int i = 0; i < s.length; i++) {
			
	  System.out.println(s[i].shapeName);
	    s[i].displayArea();
		}
		
		
					
		/*
		 * Shape s = new Circle("circle", 12); Circle c = (Circle) s; Shape s1 = new
		 * Triangle("triangle", 5, 4); Triangle t = (Triangle) s1; c.displayArea();
		 * c.displayShape(); t.displayArea(); t.displayShape();
		 */
	

      }

}
