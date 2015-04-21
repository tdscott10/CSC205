package Activity1; 

//Program Name : MultiSphere
 //Author : Aaron Stahley	
 //Date Written: 1/23/2015
 //Class : MultiSphere.java
 //Brief Description: This program uses the shpere.java class to make sphere objects that will calculate the 
					//radius, volume, and surface area. 

import java.text.DecimalFormat;

public class MultiSphere {

	public static void main(String[] args)
	{
		
		String spacing = "-----------------------------------------------------------------------------" +
				"------------------"; // Separates the lines from each sphere object. 
				
		// creates new sphere objects.
		
		sphere sphere1 = new sphere();  // This demonstrates using the non overloaded constructor.
		
		// This demonstrates using the overloaded method in order to set the diameter.
		sphere sphere2 = new sphere(13); 
		sphere sphere3 = new sphere(20);
		sphere sphere4 = new sphere(123);
		sphere sphere5 = new sphere(32.48);

		// setting the parameters of sphere 1. 
		sphere1.setDiameter(10.25); // when not using the overloaded method you need the setDiameter method in order for there to be a diameter. 
		sphere1.calculateRadius();
		sphere1.calculateVolume();
		sphere1.calculateSurfaceArea();
		System.out.println("Sphere 1, " + sphere1);
		
		System.out.println(spacing);
		
		// setting the parameters of sphere 2. 
		sphere2.calculateSurfaceArea();
		sphere2.calculateVolume();
		sphere2.calculateRadius(); 
		System.out.println("Sphere 2, " + sphere2);
		
		System.out.println(spacing); 
		
		// setting the parameters of sphere 3. 
		sphere3.calculateSurfaceArea();
		sphere3.calculateVolume();
		sphere3.calculateRadius(); 
		System.out.println("Sphere 3, " + sphere3);
		
		System.out.println(spacing);

		// setting the parameters of sphere 4. 
		sphere4.calculateSurfaceArea();
		sphere4.calculateVolume();
		sphere4.calculateRadius(); 
		System.out.println("Sphere 4, " + sphere4);
		
		System.out.println(spacing);
		
		// setting the parameters of sphere 5. 
		sphere5.calculateSurfaceArea();
		sphere5.calculateVolume();
		sphere5.calculateRadius(); 
		System.out.println("Sphere 5, " + sphere5);
				
		System.out.println(spacing);

	}
}
/* Output
 
Sphere 1, Diameter = 10.25, Radius =  5.125, Volume = 563.8586, Surface Area = 330.0636
-----------------------------------------------------------------------------------------------
Sphere 2, Diameter = 13, Radius =  6.5, Volume = 1150.3465, Surface Area = 530.9292
-----------------------------------------------------------------------------------------------
Sphere 3, Diameter = 20, Radius =  10, Volume = 4188.7902, Surface Area = 1256.6371
-----------------------------------------------------------------------------------------------
Sphere 4, Diameter = 123, Radius =  61.5, Volume = 974347.6828, Surface Area = 47529.1553
-----------------------------------------------------------------------------------------------
Sphere 5, Diameter = 32.48, Radius =  16.24, Volume = 17941.0016, Surface Area = 3314.2244
-----------------------------------------------------------------------------------------------

 */
