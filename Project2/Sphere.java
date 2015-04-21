package Project2;

//Program Name : Sphere
//Author : Aaron Stahley	
//Date Written: 2/8/2015
//Class : Sphere.java

import java.text.DecimalFormat;

public class Sphere extends Shapes
{
	
	private double radius;
	
	DecimalFormat fmt = new DecimalFormat("0.####");
	
	public Sphere()
	{
		radius = 0.0; 
	}
	
	public Sphere(double radius)
	{
		this.radius = radius;
	}
	
	@Override
	public double calculateVolume() 
	{
		return Math.PI * Math.pow(radius , 3) * 4/3;
	}

	@Override
	public double calculateSurfaceArea()
	{
		return 4 * Math.PI * Math.pow(radius , 2);
		
	}

	@Override
	public String toString() {
		return "Sphere [ radius=" + radius + ", Volume="
				+ fmt.format(calculateVolume()) + ", SurfaceArea="
				+ fmt.format(calculateSurfaceArea()) + " ]";
	}

}
