//Program Name : Project6
//Author : Aaron Stahley	
//Date Written: 4/5/2015
//Class : Project6.java

package Project6;

import java.util.Stack;
import java.util.regex.Pattern;

public class project6 
{
	
	public static boolean checkPalindrome;

	public static boolean checkPalindrome(String s)
	{
		
		boolean isPalindrome = true ;
		LinkedStack<Character> stack = new LinkedStack<Character>();
		LinkedQueue<Character> queue = new LinkedQueue<Character>();
		
		char[] charArray = s.toCharArray();
		for(int i=0; i < s.length(); i++)
		{
			if(Character.isLetter(charArray[i]))
			{
				stack.push(charArray[i]);
				queue.enqueue(charArray[i]);
			}
		}
	
		while(!stack.isEmpty() && !queue.isEmpty())
		{
			char sElement = Character.toLowerCase(stack.pop());
			char qElement = Character.toLowerCase(queue.dequeue());
			
			if(sElement != qElement)
			{
				isPalindrome = false;
			}
		}
		
		return isPalindrome;

	}
	
	public static String changeIt(String s)
	{	
		s = s.replaceAll("\\p{Punct}+", "");
		
		String[] words = s.split(" ");  // This splits the sentence into words.
		
		for(int i = 0; i < words.length; i ++)
		{
			
			if(project6.checkPalindrome(words[i]) == false) // checks every word to see if it is a palindrome.
			{
				
			  System.out.print(project6.reverseString(words[i]) + " ");   // reverse the letters in each word without it reversing the entire string
			    
			}
			
		}
	     return "";
	    
	}

	
	public static String reverseString(String s)
	{

	     Stack<Character> stack = new Stack<Character>( );

	     
	     StringBuilder sb = new StringBuilder ();
	     
	     char[] charArray = s.toCharArray();

	  
	      for (int i=0; i < s.length(); ++i)
	      {

	        stack.push (charArray[i]);
	     
	      }
	     	     
	      while (!stack .empty())
	      {
	    	  
	        char c = stack.pop();
	        sb.append(c);
	        
	      }
	            
	     
	       return sb.toString();
	     
	}
	
	
	
}
	

