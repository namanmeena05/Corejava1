package com.rays.orverridingwithConstructor;

public class Triangle extends Shape{

    private double base;
    private double height;
    
    
    public Triangle(String shapeName, double base, double height) {
        super(shapeName);
        this.base = base;
        this.height = height;
    }
    
    public void displayArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of the triangle: " + area);
    }


}
