package Activity3;

//Program Name : Circle
//Author : Aaron Stahley	
//Date Written: 2/5/2015
//Class : Circle.java

import java.text.DecimalFormat;


public class Circle extends Shape{
	
	double r;
	DecimalFormat fmt = new DecimalFormat("0.####");
	
	
	public Circle() {
		this(1);
	}

	public Circle(double r) {
		super();
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
	@Override
	public double calculateArea() {
		return Math.PI * Math.pow(r,2);
	}
	
	@Override
	public double calculatePerimeter() {
		return r * 2.0 * Math.PI;
	}

	public String toString() {
		return "Circle [r=" + r + " perimeter=" + fmt.format(calculatePerimeter()) + " area=" + fmt.format(calculateArea()) + "]";
	}

}
