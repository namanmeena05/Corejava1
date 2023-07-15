package com.rays.orverridingwithConstructor;

public class Circle extends Shape{

    private double radius;
    
    
    public Circle(String shapeName, double radius) {
        super(shapeName);
        this.radius = radius;
    }
    
    public void displayArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }


}
