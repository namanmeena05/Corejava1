package com.rays.oops;

public class Shape {
	private String color = null;
	private int borderWidth = 0;
	private int dimension = 0;
	
	public int  getBorderWidth() {
		return borderWidth;
			}
	
	public void setBorderWidth(int bw){
		borderWidth = bw;
		
	}

	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setDimension(int d) {
		dimension = d;
	}public int getDimension() {
		return dimension;
		
	}

}
