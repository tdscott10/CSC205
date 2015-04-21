package Project2;

//Program Name : Cylinder
//Author : Aaron Stahley	
//Date Written: 2/8/2015
//Class : Cylinder.java

import java.text.DecimalFormat;

public class Cylinder extends Shapes
{
	
	private double radius;
	private double height;
	
	DecimalFormat fmt = new DecimalFormat("0.####");

	public Cylinder()
	{
		radius = 0.0;
		height = 0.0;
	}
	
	public Cylinder(double radius, double height)
	{
		this.radius = radius;
		this.height = height; 
	}
	
	@Override
	public double calculateVolume() 
	{
		return Math.PI * Math.pow(radius, 2) * height;
	}

	@Override
	public double calculateSurfaceArea()
	{
		return 2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Cylinder [ radius=" + radius + ", height=" + height
				+ ", Volume=" + fmt.format(calculateVolume())
				+ ", SurfaceArea=" + fmt.format(calculateSurfaceArea()) + " ]";
	}
	
	

}
