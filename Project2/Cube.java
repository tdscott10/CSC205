package Project2;

//Program Name : Cube
//Author : Aaron Stahley	
//Date Written: 2/8/2015
//Class : Cube.java

import java.text.DecimalFormat;


public class Cube extends Shapes
{

	private double side; 
	
	
	DecimalFormat fmt = new DecimalFormat("0.####");

	public Cube()
	{
		side = 0.0;
	}
	
	public Cube(double side)
	{
		this.side = side;
	}
	
	@Override
	public double calculateVolume() 
	{
		return Math.pow(side, 3);
	}

	@Override
	public double calculateSurfaceArea() 
	{
		return 6 * Math.pow(side, 2);
	}

	@Override
	public String toString() {
		return "Cube [ side length=" + side + " Volume=" + fmt.format(calculateVolume()) + " SurfaceArea=" + fmt.format(calculateSurfaceArea())+ " ]";
	}
	
	

}
