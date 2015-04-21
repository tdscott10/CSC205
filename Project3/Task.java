package Project3;

//Program Name : Task
//Author : Aaron Stahley	
//Date Written: 2/13/2015
//Class : Task.java

public class Task implements Priority
{
	
	String task;
	int priority; 
	
	public Task()
	{
		this.task = "Null";
		this.priority = 0;
	}

	public Task(String task)
	{
		this.task = task; 
	}
	
	public Task(String task, int priority)
	{
		this.task = task;
		this.priority = priority;
	}
	
	// Implemented Methods from priority Interface
	public void setPriority(int priority)
	{
		this.priority = priority; 
	}
	
	// Implemented Methods from priority Interface
	public int getPriority()
	{
		return this.priority; 
	}
	
	public String toString()
	{
		return getPriority() + " " + task;
		
	}



}
