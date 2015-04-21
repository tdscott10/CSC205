import Project6.LinkedQueue;
import Project6.project6;

import java.util.*;
public class QueueDriver {

	public static void main (String args[])
	{
		LinkedQueue<Character> myQueue = new LinkedQueue<Character>();
		
		myQueue.enqueue('n');
		myQueue.enqueue('o');
		myQueue.enqueue('g');
		myQueue.enqueue('o');
		myQueue.enqueue('o');
		myQueue.enqueue('d');
		myQueue.dequeue();
		myQueue.dequeue();
		
		if (myQueue.isEmpty())
			System.out.println("isEmpty() does not work (non-empty).");
		else
			System.out.println("isEmpty() works! (non-empty)");

		System.out.println("Queue:\n" + "=============");
		System.out.println(myQueue);
		System.out.println("=============\n");
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();

		System.out.print("Enter some Text:");
		
		if(project6.checkPalindrome(input))
		{
			System.out.println(input + " is a Palindrome.");
		}
		else
		{
			System.out.println("\""+input + "\" is Not a Palindrome.");
		}
		
		
		scan.close();
	}
	
}