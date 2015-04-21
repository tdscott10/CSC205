package csc205;

public class Searching {

	private static int counter = 0;
	
    public static int getCounter() {
		return counter;
	}

	public static void setCounter(int c) {
		counter = c;
	}

	public static <T>   
		T linearSearch(T[] data, T target) {
		setCounter(0);
    	return linearSearch(data, 0, data.length-1, target);
    }
	
    public static <T>   
		T linearSearch(T[] data, int min, int max, T target) {
    	
    	T ret = null;
    	
    	int current = min;
    	boolean found = false;
    	
    	while (!found && current<=max) {
    		counter ++;
    		if (target.equals(data[current])) {
    			ret = data[current];
    			found = true;
    		}
    		current ++;
    	}  	
    	return ret;
    }

    public static <T extends Comparable<T>>  
		T binarySearch(T[] data, T target) {  	
    	setCounter(0);
    	return binarySearch(data, 0, data.length-1, target);
    }
    
    public static <T extends Comparable<T>>  
		T binarySearch(T[] data, int min, int max, T target) {
    	
    	T ret = null;
    	int mid = (min + max) / 2;
    	
    	if (min > max) {
    		return ret;   // not found
    	}
    	
    	counter ++;
    	if (data[mid].compareTo(target) == 0) {
    		ret = data[mid];
    	}
    	else if (data[mid].compareTo(target) > 0) {
    		ret = binarySearch(data, min, mid-1, target);
    	}
    	else
    		ret = binarySearch(data, mid+1, max, target);
    	
    	return ret;
    }

    
}
