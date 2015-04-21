package Activity3;

//Program Name : AreaCalculator
//Author : Aaron Stahley	
//Date Written: 2/5/2015
//Class : AreaCalculator.java

public class AreaCalculator {

	public static void main(String[] args) 
	{
		
		
		Shape[] shapeList = new Shape[4];
		
		
		// Instantiating all the shapes and placing them into an array.
		shapeList[0] = new Square(8);
		shapeList[1] = new Rectangle(2,5); 
		shapeList[2] = new Circle(5);
		shapeList[3] = new Triangle(4,7);
		
		for(int i = 0; i < shapeList.length; i++)
		{
			shapeList[i].calculateArea(); // Example of polymorphism by taking the area for all the shapes in the array.
			
			System.out.println(shapeList[i].toString());
			
			System.out.println("----------------------------------------------------");
			
		}

        
		} 

	}
/* output
 
Square [s=8.0 perimeter=32.0 area=64.0]
----------------------------------------------------
Rectangle [l=2.0 w=5.0 perimeter=14.0 area=10.0]
----------------------------------------------------
Circle [r=5.0 perimeter=31.4159 area=78.5398]
----------------------------------------------------
Triangle [b=4.0 h=7.0 perimiter=18.0 area=14.0]
----------------------------------------------------
 
 */
 

