package Activity1;

//Program Name : sphere
 //Author : Aaron Stahley	
 //Date Written: 1/23/2015
 //Class : sphere.java
 //Brief Description: This program takes the diameter of a sphere then
 				   // converts the diameter to the radius and gives you the volume and the surface area.

import java.math.*;
import java.text.DecimalFormat;

public class sphere {
	
	private double diameter;
	private double volume; 
	private double surfaceArea; 
	private double radius; 
	
	DecimalFormat fmt = new DecimalFormat("0.####"); // changes how many decimals places are being produced.
	
	// normal constructor
	public sphere()
	{
		diameter = 0.0;
		volume = 0.0;
		surfaceArea = 0.0;
		radius = 0.0; 
	}
	
	// overloaded constructor
	public sphere(double diameter)
	{
		this.diameter = diameter;
		volume = 0.0;
		surfaceArea = 0.0;
		radius = 0.0; 
	} 
	
	// Sets the diameter if user is not using the overloaded method. 
	public void setDiameter(double diameter)
	{
		this.diameter = diameter; 
	}
	
	// displays the current diameter. 
	public double getDiameter()
	{
		return diameter; 
	}
	
	// Calculates the volume of the sphere.
	public void calculateVolume()
	{
		volume = (Math.PI * Math.pow(diameter / 2 , 3)) * 4/3; // divides the diameter by two to get the radius of the sphere then solves. 
	}
	
	// Displays the volume after the it is calculated. 
	public double getVolume()
	{
		return volume;
	}
	
	// calculates the surface area of the sphere.
	public void calculateSurfaceArea()
	{
		surfaceArea = 4 * Math.PI * Math.pow(diameter / 2 , 2); // divides the diameter by two in order to get the radius then solves. 
	}
	
	// returns the calculated surface area. 
	public double getSurfaceArea()
	{
		return surfaceArea; 
	}
	
	// calculates the radius by dividing the diameter by two. 
	public void calculateRadius()
	{
		radius = this.diameter / 2 ;  
	}
	
	// returns the radius of the sphere. 
	public double getRadius()
	{
	
		return radius; 
	}

	// displays the state of each sphere object that is created and formats the answers to the fourth decimal point. 
	public String toString() 
	{
		return "Diameter = " + fmt.format(diameter) + ", Radius =  " + fmt.format(radius) + ", Volume = " + 
				fmt.format(volume) + ", Surface Area = " + fmt.format(surfaceArea);
	}
	
	
	
}
