package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		// Left-hand side: instance variables (can use this.)
		this.length = length;
		this.width = width;
	}
	/*
	 * Steps for automatically creating setters and getters:
	 * Right click -> source -> Generate Getters and Setters -> select instance variables
	 */
	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double area() {
		return this.length * this.width;
	}
	
	public double perimeter() {
		return 2*this.length + 2*this.width;
	}
	
	public boolean isSmaller(Rectangle r) {
		if (this.area() < r.area()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isSquare() {
		if (this.width == this.length) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle (0.3, 0.2);
		StdDraw.filledRectangle(0.5, 0.5, r.getLength(), r.getWidth());
	}
	
}