package tasklists;

import tasks.Task;

public class ArrayTasks implements TaskList {
	private Task tasks[];
	private int num;

	
	public ArrayTasks(int n) {
		num = 0;
		tasks = new Task[n];
	}
	
	public String toString() {
		String ret = "[";
		int ii = 0;
		
		if (num>=1) {
			ret += tasks[ii];
		}
		ii++;
		
		while (ii < num) {
			ret += ", " + tasks[ii];
			ii++;
		}
		ret += "]";
		
		return ret;
	}

	public void addTask(Task t) {
		if (num < tasks.length) {
			tasks[num] = t;
			num++;
		}
		
	}

	public void printTasks() {
		for(int ii=0;ii<num;ii++) {
			System.out.println(tasks[ii]);
		}
	}
}
