package Project3;

//Program Name : TaskTester
//Author : Aaron Stahley	
//Date Written: 2/13/2015
//Class : TaskTester.java

public class TaskTester
{

public static void main(String[] args) 
	{
		
	Task[] taskList = new Task[7];
		
	taskList[0] = new Task("Go to the store");// first overloaded constructor that only accepts the task name. 
	taskList[1] = new Task("Do laundry");
	taskList[2] = new Task("Do home work");
	taskList[3] = new Task("Clean my room");
	taskList[4] = new Task("Go to the bank");
	taskList[5] = new Task("Cook Dinner", 6); // sets the priority and the task name. 
	taskList[6] = new Task("Fix Computer", 7); 
	
	taskList[0].setPriority(1);
	taskList[1].setPriority(2);
	taskList[2].setPriority(3);
	taskList[3].setPriority(4);
	taskList[4].setPriority(5);
	
	System.out.println("To Do List");
	System.out.println("----------");
	
	for(int i = 0; i < taskList.length; i++)
	{
		
		System.out.println(taskList[i]);
	
	}
  }
}
/* output
 
 To Do List
----------
1 Go to the store
2 Do laundry
3 Do home work
4 Clean my room
5 Go to the bank
6 Cook Dinner
7 Fix Computer
 
 */
