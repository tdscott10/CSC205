package Activity4; 

//Program Name : Activity4
//Author : Aaron Stahley	
//Date Written: 2/16/2015
//Class : Activity4.java

public class Activity4 {

	public static void main(String[] args) {

		for (int ii=0;ii<10;ii++) {
			//System.out.println("sum_up " + ii + ": " + Recursion.sum_up(ii));
		}
		for (int ii=0;ii<10;ii++) {
			//System.out.println("sum_up_tail " + ii + ": " + Recursion.sum_up_tail(ii));
		}
		
		// Displays the Fibonacci  sequence
		System.out.println("The 7th number in the Fibonacci  sequence = " + Recursion.fib(7)); 
		
		// Displays the factorial of the number n that you enter.
		System.out.println("The factorial of 5 = " + Recursion.fact(5));
		
		// Finds the greatest common divisor for the number n that you enter.
		System.out.println("The greatest common divisor of 20 and 232 = " + Recursion.gcd(20, 232));
		
		
	}

}
/* output
 
The 7th number in the fibanachi sequence = 13
The factorial of 5 = 120
The greatest common divisor of 20 and 232 = 4 
 
 */
