package Project1;

//Program Name : Point
//Author : Aaron Stahley	
//Date Written: 1/30/2015
//Class : Point.java
//Description: demonstrates the Point class.

import java.util.*;
import java.text.DecimalFormat;

public class Point {

	private double x;
	private double y;
	private double distance; 
	private double xPrime;
	private double yPrime;

	DecimalFormat fmt = new DecimalFormat("0.##"); // changes how many decimals places are being produced.
	
	public Point()
	{
		x = 0.0;
		y = 0.0;
		distance = 0.0; 
		xPrime = 0.0;
		yPrime = 0.0;
	}
	
	// Setting the X value of the point. 
	public void setX(double x)
	{
		this.x = x; 
	}
	
	// Setting the Y value of the point. 
	public void setY(double y)
	{
		this.y = y; 
	}
	
	// Sets the X and Y value for the point. 
	public void setPoint(double x, double y)
	{
		this.x = x; 
		this.y = y; 
	}
	
	// Shifts the X value by the value of n. 
	public void shiftX(double n)
	{
		this.x = n + this.x;
	}
	
	// Shifts the Y value by the value of n
	public void shiftY(double n)
	{
		this.y = n + this.y; 
	}
	
	// This tells you the distance between the point that the user enters.
	public void distanceBetween(double x, double y)
	{
		distance = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
	}
	
	// Returns the distance between the two points when the distanceBetween method is used. 
	public String displayDistanceBetween()
	{
		return "(" + fmt.format(distance) + ")" + " This is the distance between the two points" ;
	}
	
	// This rotates the point around the origin.
	public void rotate(double angle)
	{
		xPrime = (this.x * Math.cos(angle)) - (this.y * Math.sin(angle));
		yPrime = (this.x * Math.sin(angle)) - (this.y * Math.cos(angle));
	}
	
	public String displayRotate()
	{
		return  "(" + fmt.format(xPrime) + ","+ fmt.format(yPrime) + ")" + " This is the points location after the rotation. ";
	}

	// Returns the status of where the point is on the Cartesian plane. 
	public String toString() 
	{
		return ("(" + x + "," + y + ")");
	}
	
	
	
}
/* output
 
(5.0,3.0) The initial X and Y value
(15.0,6.0) Values of X and Y after the shift
(10.0,12.0) Setting the value of p1
(-15.4,15.62) This is the points location after the rotation. 
(10.77) This is the distance between the two points

 
 */
