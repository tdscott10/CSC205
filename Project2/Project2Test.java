package Project2;

//Program Name : Project2Test
//Author : Aaron Stahley	
//Date Written: 2/8/2015
//Class : Project2Test.java

//Project #2 test class

public class Project2Test {

	public static void main(String[] args) {
		Sphere sphere = new Sphere(3.0);
		Cube cube = new Cube(10.0);
		Cylinder cylinder = new Cylinder(5,10);
		
		System.out.println(sphere);
		System.out.println(cube);
		System.out.println(cylinder);

	}

}
/* output

Sphere [ radius=3.0, Volume=113.0973, SurfaceArea=113.0973 ]
Cube [ side length=10.0 Volume=1000 SurfaceArea=600 ]
Cylinder [ radius=5.0, height=10.0, Volume=785.3982, SurfaceArea=471.2389 ]

*/