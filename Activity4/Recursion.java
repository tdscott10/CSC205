package Activity4;

//Program Name : Recursion
//Author : Aaron Stahley	
//Date Written: 2/16/2015
//Class : Recursion.java

public class Recursion {

	// Class example
	public static int sum_up(int n) {
		if (n <=1 ) {
			return 1;
		}
		else {
			return n + sum_up(n-1);
		}
	}
	
	// Class example
	public static int sum_up_tail(int n) {
		return sum_up_tail(n, 0);
	}
	public static int sum_up_tail(int n, int tmp) {
		if (n <1 ) {
			return tmp;
		}
		else {
			return sum_up_tail(n-1, tmp+n);
		}
	}
	
	// Activity 4 int fact(int n) 
	public static int fact(int n)
	{
		if (n <=1)
		{
			return 1;
		}
		else 
		{
			return n * fact(n - 1);
		}
	}
	
	// Activity 4 int fib(int n) 
	public static int fib(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		if(n <= 2)
		{
			return 1;
		}
		
		int fibTerm = fib(n - 1) + fib(n - 2);
		return fibTerm;
	}
	
	
	// Activity 4 int gcd(int num1, int num2)
	public static int gcd(int num1, int num2)
	{
		if(num2 == 0)
		{
			return num1;
		}
		return gcd(num2, num1 % num2);
	}

    // Project 4 int power (int x, int y)
	public static int power(int x, int y)
	{
		if (y == 0)
		{
			return 1;
		}
		else 
			return x * power(x, y - 1);
		
		
	}
    
    // Project 4 int ack(int m, int n) 
	public static int ack(int m, int n)
	{
		if(m == 0)
		{
			return n + 1;
		}
		else if( n == 0)
		{
			return ack(m - 1, 1);
		}
		else
		{
			return ack(m - 1, ack(m, n-1));
		}
		
	}
	
}
