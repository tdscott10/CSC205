package Activity2;

//Program Name : Activity2
//Author : Aaron Stahley	
//Date Written: 1/30/2015
//Class : Activity2.java
//Description: Handling exceptions

import java.util.*;
import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {

		Fraction n = new Fraction(8,3);
		
		Scanner scan = new Scanner(System.in);
		
		// Trying this chunk of code and checking for errors but only to what is in the try block.
		try{
	
		System.out.print ("Enter the numerator:  ");
		n.setNumerator(scan.nextInt());		
		System.out.print ("Enter the denominator:  ");
		n.setDenominator(scan.nextInt());	
		
		System.out.println ("The fraction " + n.getNumerator() + "/" +
		n.getDenominator() + " is equal to " + n.toMixedNumber());
		
		scan.close();

			}
			
		// Catching the error that involves the user trying to divide by zero.
	   catch(ArithmeticException e)
	    {
			System.out.println("You can't have a denominator of zero. Please try again");
		}
		
		// Catching the error that involves the user inputing a non whole number or a entering letters.
		catch(InputMismatchException e)
		{
			
			System.out.println("Please enter a whole number or a number without letters . Please try again.");

		}
		
		// Catches all errors other than those two.
		catch(Exception e)
		{
			System.out.println("Something went wrong please try that again.");
		}
		
	}
}