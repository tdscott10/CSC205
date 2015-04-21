package Activity3;

//Program Name : Triangle
//Author : Aaron Stahley	
//Date Written: 2/5/2015
//Class : Triangle.java

public class Triangle extends Shape
{
	
	double base;
	double height;

	
	public Triangle()
	{
		base = 0.0;
		height = 0.0;
	}
	
	public Triangle(double base , double height )
	{
		super();
		this.height = height; 
		this.base = base;
	}

	public double calculateArea() 
	{	
		
		return ((base * height)/2);
		
	}

	public double calculatePerimeter() {
		
		return (height + base + height);
	}

	public String toString() 
	{
		return ("Triangle [b=" + base + " h=" + height + " perimiter=" 
				+ calculatePerimeter() + " area=" +calculateArea() + "]");
	}
}
