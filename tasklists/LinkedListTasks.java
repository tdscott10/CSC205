package tasklists;

//Program Name : Activity5
//Author : Aaron Stahley	
//Date Written: 2/21/2015
//Class : Activity6.java

import Lists.LinkedList;
import tasks.Task;

public class LinkedListTasks implements TaskList
{
	LinkedList<Task> array;
	
	public LinkedListTasks()
	{
		array = new LinkedList<Task>();
	}

	public void addTask(Task t) 
	{
		array.addToFront(t);
	}
	
	public void addRear(Task t)
	{
		array.addToRear(t);
	}
	
	public void printTasks() 
	{
		
		System.out.println(array.toString());
		
	}
	
	// uses the toString from the LinkedList data structure to display the linked list
	public String toString()
	{
		return super.toString(); 
	}
	
	

}
