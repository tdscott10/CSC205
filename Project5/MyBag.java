package Project5;

//Program Name : MyBag
//Author : Aaron Stahley	
//Date Written: 3/1/2015
//Class : MyBag.java

import java.util.ArrayList;
import java.util.Iterator;

public class MyBag<T> implements Bag<T> 
{
	ArrayList<T> bag;	
	
	public MyBag()
	{
		bag = new ArrayList<T>();
	}


	public Iterator<T> iterator() {

		return bag.iterator();	
		
		}


	public boolean isEmpty() {
	
		if(bag.isEmpty() == true)
		{
		return true;
		}
		else
		{
		return false; 
		}
	}

	public int size() {
		
		return bag.size();
	}

	public void add(T item) {
		
		bag.add(item);
		
	}
	
	public void printBag()
	{
		for(int i = 0; i < bag.size(); i++)
		{
			System.out.println(bag.get(i));
		}
	}
	
	public String toString()
	{
		for(int i = 0; i < bag.size(); i++)
		{
			System.out.println( bag.get(i));
			
		}
		return "";
	}



}
