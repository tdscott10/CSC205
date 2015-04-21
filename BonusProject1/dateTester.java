package BonusProject1;

//Program Name : dateTester
//Author : Aaron Stahley	
//Date Written: 2/14/2015
//Class : dateTester.java

public class dateTester {

	public static void main(String[] args) 
	{
		date d1 = new date(5,6,2015);
		date d2 = new date(2,6,2015);
		
		date d3 = new date(5,20,2015);
		date d4 = new date(5,12,2015);
		
		date d5 = new date(5,15,2008);
		date d6 = new date(5,15,1998);
		
		date d7 = new date(5,6,1995);
		date d8 = new date(5,6,1995);
		
		int result = d1.compareTo(d2);
		int result2 = d3.compareTo(d4);
		int result3 = d5.compareTo(d6);
		int result4 = d7.compareTo(d8);
		
		System.out.println("Comparing Dates");
		System.out.println("---------------");
		
		// if statements for result 1 d1 - d2
		if(result < 0)
		{
			System.out.println(d1 + " comes before " + d2);
		}
		else if(result > 0)
		{
			System.out.println(d2 + " comes before " + d1);
		}
		else 
			System.out.println(d1 + " is the same as " + d2);
		
		
		// if statements for result2 d3 - d4
		if(result2 < 0)
		{
			System.out.println(d3 + " comes before " + d4);
		}
		else if(result2 > 0)
		{
			System.out.println(d4 + " comes before " + d3);
		}
		else 
			System.out.println(d3 + " is the same as " + d4);
		
		
		// if statements for result3 d5 - d6
		if(result3 < 0)
		{
			System.out.println(d5 + " comes before " + d6);
		}
		else if(result3 > 0)
		{
			System.out.println(d6 + " comes before " + d5);
		}
		else 
			System.out.println(d5 + " is the same as " + d6);
		
		// if statements for result4 d7 - d8
		if(result4 < 0)
		{
			System.out.println(d7 + " comes before " + d8);
		}
		else if(result4 > 0)
		{
			System.out.println(d8 + " comes before " + d7);
		}
		else 
			System.out.println(d7 + " is the same as " + d8);
		
	}

}
/*

Comparing Dates
---------------
2,6,2015 comes before 5,6,2015
5,12,2015 comes before 5,20,2015
5,15,1998 comes before 5,15,2008
5,6,1995 is the same as 5,6,1995


 */
