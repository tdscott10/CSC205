package tasklists;

//Program Name : ArrayListTasks
//Author : Aaron Stahley	
//Date Written: 2/21/2015
//Class : ArrayListTasks.java

import java.util.ArrayList;
import tasks.*;

// Complete ArrayListTasks which implements the TaskList interface using an ArrayList

public class ArrayListTasks  implements TaskList
{ 
	
	ArrayList<Task> array; 

public ArrayListTasks()
{
	array = new ArrayList<Task>();
}

public void addTask(Task t) 
{	
	
	array.add(t);

}

public void printTasks() 
{
	
	for(int i = 0; i < array.size(); i++)
	{
		System.out.println(array.get(i));
	}
	
}

}
