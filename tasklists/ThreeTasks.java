package tasklists;

import tasks.*;

public class ThreeTasks implements TaskList{

	private Task task1;
	private Task task2;
	private Task task3;
	private int num;

	
	public ThreeTasks() {
		num = 0;
	}
	
	public ThreeTasks(Task task1) {
		super();
		this.task1 = task1;
		num = 1;
	}


	public String toString() {
		String ret = "[";

		if (num >=1 ) {
			ret += task1;
		}
		if (num >=2 ) {
			ret += ", " + task2;
		}
		if (num >=3 ) {
			ret += ", " + task3;
		}
		
		ret += "]";
		
		return ret;
	}

	public void addTask(Task t) {
		switch(num) {
		case 0:
			task1 = t;
			num++;
			break;
		case 1:
			task2 = t;
			num++;
			break;
		case 2:
			task3 = t;
			num++;
			break;
		}
		
	}

	public void printTasks() {
		if (num >=1 ) {
			System.out.println(task1);
		}
		if (num >=2 ) {
			System.out.println(task2);
		}
		if (num >=3 ) {
			System.out.println(task3);
		}
		
	}
	
}
