package com.rays.inheritence;
class Shape {
    protected String shapeName;
    protected int color=12;
    
    
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }
    
    public void displayShape() {
        System.out.println("Shape: " + shapeName);
    }public Shape (int color){
    	this.color=color;
    	
    }public void displayShapecolor() {
    	System.out.println(color);
    }
}

class Circle extends Shape {
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

class Triangle extends Shape {
    private double base;
    private double height;
    
    
    public Triangle(String shapeName,int shapeNameColor, double base, double height) {
        super(shapeName);
        this.base = base;
        this.height = height;
    }
    
    public void displayArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of the triangle: " + area);
    }
}

class Square extends Shape {
    private double side;
    
    
    public Square(String shapeName, double side) {
        super(shapeName);
        this.side = side;
    }
    
    public void displayArea() {
        double area = side * side;
        System.out.println("Area of the square: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle", 3.5);
        circle.displayShape();
        circle.displayArea();
        
        Triangle triangle = new Triangle("Triangle",12, 4.0, 6.0);
        triangle.displayShape();
        triangle.displayArea();
        triangle.displayShapecolor();
        
        
        Square square = new Square("Square", 5.0);
        square.displayShape();
        square.displayArea();
    }
}
