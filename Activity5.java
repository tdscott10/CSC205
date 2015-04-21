
//Program Name : Activity5
//Author : Aaron Stahley	
//Date Written: 2/21/2015
//Class : Activity5.java

import tasklists.*;
import tasks.*;

public class Activity5 {
	public static void main(String[] args) {
		TaskList list = new ThreeTasks();
	
		/* Makes 2 identical task list - one of each type of task list */
		
		// this class is designed to only hold three task so any more and it wont work.
		list = new ThreeTasks();  
	
		list.addTask(new Task("Install Eclipse upgrade", 4));
		list.addTask(new Task("Do Project 4", 8));
		list.addTask(new Task("Learn about lists", 7));
		
		list.printTasks();
		
		System.out.println("---------------------------------------------------------------");

		ArrayTasks list2 = new ArrayTasks(3);// this number will change the size of the array to how many objects you want in it. 
		
		list2.addTask(new Task("Do CSC 205 homework" ,  5));
		list2.addTask(new Task("Do MAT 230 homework" ,  8));
		list2.addTask(new Task("Do ECE 103 homework" ,  2));
		
		list2.printTasks(); 
		
		System.out.println("---------------------------------------------------------------");
		 
		
		// this array can grow and shrink depending on how many items you have in the array. 
		ArrayListTasks list3 = new ArrayListTasks(); 
		
		list3.addTask(new Task("Do the reading quiz", 1)); 
		list3.addTask(new Task("Study for physics quiz", 3)); 
		list3.addTask(new Task("Do test corrections for calc 2", 6)); 
		list3.addTask(new Task("Make dinner", 5)); 
		
		
		list3.printTasks();
		
		System.out.println("---------------------------------------------------------------");

		
		// This uses a linked list so that you can easily add and remove items from the list. It also is displayed in reverse order
		// because it loads it from the front unless you add the tasks to the tail of the linkedList. 
		LinkedListTasks list4 = new LinkedListTasks();
		
		list4.addTask(new Task("Stay at home and do nothing" , 1));
		list4.addTask(new Task("Feed my dog" , 2));
		list4.addTask(new Task("Get my car washed" , 3));
		list4.addTask(new Task("Go see a movie" , 4));
		list4.addTask(new Task("Get my mom a birthday present" , 5));
		list4.addTask(new Task("Go deposit my check" , 6));
		
		list4.printTasks(); 
	
		
	}

}
