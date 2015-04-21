package Project2;

//Program Name : ShapesTester
//Author : Aaron Stahley	
//Date Written: 2/8/2015
//Class : ShapesTester.java

public class ShapesTester 
{

	public static void main(String[] args) 
	{
		
		Shapes[] shapesList = new Shapes[3];
		
		shapesList[0] = new Cube(10);
		shapesList[1] = new Sphere(6);
		shapesList[2] = new Cylinder(5,10);
		
		for(int i = 0; i < shapesList.length; i++)
		{
			shapesList[i].calculateVolume();
			shapesList[i].calculateSurfaceArea();
			
			System.out.println(shapesList[i].toString());
			
			System.out.println("------------------------------------" +
					"-------------------------------------------"); 
		}
		
	}
	
}
