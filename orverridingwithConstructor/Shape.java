package com.rays.orverridingwithConstructor;

public class Shape {

    protected String shapeName;
    
    
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }
    
    public void displayShape() {
        System.out.println("Shape: " + shapeName);
    }public void displayArea() {
    	System.out.println(" ");
    }
    
}
