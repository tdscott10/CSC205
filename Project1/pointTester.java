package Project1;

//Program Name : pointTester
//Author : Aaron Stahley	
//Date Written: 1/30/2015
//Class : pointTester.java
//Description: demonstrates the Point class.

public class pointTester {

	public static void main(String[] args)
	{
		// Instantiates the new point object named P1
		Point p1 = new Point();
		
		// Sets the initial x and y value by using the set x and y methods.
		p1.setX(5);
		p1.setY(3);
		
		System.out.println(p1 + " The initial X and Y value"); // Displays the state of p1.
		
		// Shifts the p1 point by 10 on the x axis and 3 on the y axis.
		p1.shiftX(10);
		p1.shiftY(3);
		
		// Displays the state of p1.
		System.out.println(p1 + " Values of X and Y after the shift");
		
		// Sets the point using the method set point, the first number is the X value and the second is the Y value.
		p1.setPoint(10,12);
		
		// Displays the state of p1
		System.out.println(p1 + " Setting the value of p1");
		
		// Rotates the point by 10 degrees.
		p1.rotate(15);
		System.out.println(p1.displayRotate());
		
		// Displays the state of p1
		//System.out.println(p1);
		
		// Resets the point of p1 to 10,4 and then finds the distance between another point at 20,8. 
		p1.setPoint(10, 4);
		p1.distanceBetween(20, 8);
		
		// Displays the distance between the two points. 
		System.out.println(p1.displayDistanceBetween());


		
	}
	
}
