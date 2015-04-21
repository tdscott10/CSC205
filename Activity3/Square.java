package Activity3;

//Program Name : Square
//Author : Aaron Stahley	
//Date Written: 2/5/2015
//Class : Square.java

public class Square extends Rectangle {
	
	public Square () {
		this(1);
	}

	public Square(double s) {
		super(s,s);
	}
	
	
	@Override
	public String toString() {
		return "Square [s=" + w + " perimeter=" + calculatePerimeter() + " area=" + calculateArea() + "]";
	}

}
