//Program Name : Sorting
//Author : Aaron Stahley	
//Date Written: 4/21/2015
//Class : Sorting.java

package csc205;

import java.lang.reflect.Array;

public class Sorting {

	private static <T extends Comparable<T>> 
		boolean less_than(T a, T b) {
		return (a.compareTo(b) < 0);
	}
	private static <T extends Comparable<T>> 
		boolean greater_than(T a, T b) {
		return (a.compareTo(b) > 0);
	}
	private static void swap(Object[] a, int ii, int jj) {
		Object swap = a[ii];
		a[ii] = a[jj];
		a[jj] = swap;
	}
	
	public static <T extends Comparable<T>> 
		boolean isSorted(T[]data){
		return isSorted(data, 0, data.length-1);
	}

	public static <T extends Comparable<T>> 
		boolean isSorted(T[]data, int min, int max){
		for (int ii=min+1; ii<=max; ii++) {
			if (less_than(data[ii], data[ii-1]))
				return false;
		}
		return true;
	}
	
	public static <T extends Comparable<T>> 
		void selectionSort (T[] data) {
		selectionSort (data, 0, data.length-1);
		
	}
	public static <T extends Comparable<T>> 
		void selectionSort (T[] data, int min, int max) {
		
		int start; 
		
		min = Math.max(min, 0);
		max = Math.min(max, data.length-1);
		
		for(int ii=min; ii<max; ii++) {
			start = ii;
			for(int scan=ii+1; scan<=max; scan++) {
				if(less_than(data[scan], data[start])) {
					start = scan;
				}
			}
			swap(data, start, ii);
		}
	}
	
	// Insertion Sort
	public static <T extends Comparable<T>> 
		void insertionSort(T[] data) {
	    insertionSort(data, 0, data.length);
	    }
	
    public static <T extends Comparable<T>> 
		void insertionSort(T[] data, int min, int max) {
    	
    	int start = Math.max(min, 1);
    	int end = Math.min(max, data.length-1);
    	
    	for (int ii=start; ii <= end; ii++) {
    		T key = data[ii];
    		int position = ii;
    		
    		while (position > 0 && greater_than(data[position-1], key)) {
    			data[position] = data[position-1];
    			position--;
    		}
    		data[position] = key;
    	}    	
    }

	// Bubble sort
    public static <T extends Comparable<T>> 
		void bubbleSort(T[] data) {
    	bubbleSort(data, 0, data.length);
    }	
    
    public static <T extends Comparable<T>> 
		void bubbleSort(T[] data, int min, int max) {
    	
    	int limit, scan;
    	for (limit = max-1; limit >= min; limit --) 
    		for (scan=0; scan <limit; scan++) {
    			if (greater_than(data[scan], data[scan+1])) 
    				swap(data, scan, scan+1);   
    		}
    }
	
    // Merge sort
	public static <T extends Comparable<T>>
		void mergeSort(T[] data) {
		mergeSort(data, 0, data.length - 1);
	}

	private static <T extends Comparable<T>>
		void mergeSort(T[] data, int first, int last) {
		if (first < last) {
			int mid = (first + last) / 2;
			mergeSort(data, first, mid);
			mergeSort(data, mid+1, last);
			merge(data, first, mid, last);
		}
	}

	private static <T extends Comparable<T>>
		void merge(T[] data, int first, int mid, int last) {
		T[] temp = (T[]) new Comparable[data.length];
		
		int first1 = first, last1 = mid;    // first subarray endpoints
		int first2 = mid+1, last2 = last;	// second subarray endpoings
		int index = first1; 				// index to temp array
		
		// Copy smallest from front of each subarray into temp array
		while ( (first1 <= last1)  &&  (first2 <= last2) ) {
			if (less_than(data[first1], data[first2])) {
				temp[index] = data[first1];
				first1++;
			}
			else {
				temp[index] = data[first2];
				first2++;
			}
			index++;
		}
		
		// Copy remaining elements to temp 
		while(first1 <= last1) {
			temp[index] = data[first1];
			first1++;
			index++;
		}
		while(first2 <= last2) {
			temp[index] = data[first2];
			first2++;
			index++;
		}
		
		for (int ii=first; ii<=last;ii++) {
			data[ii] = temp[ii];
		}
	}
	
	// Quick sort
	public static <T extends Comparable<T>> 
		void quickSort(T[] data) {
		quickSort(data, 0, data.length - 1);
	}
	
	

	private static <T extends Comparable<T>> 
	void quickSort(T[] data, int min, int max) 
	{
		if (min < max) 
		{
		int partitionindex = partition(data, min, max);
		quickSort(data, min, partitionindex-1);
		quickSort(data, partitionindex+1, max);
		}	
	}
	
	
	private static <T extends Comparable<T>> 
			int partition(T[] data, int min, int max) {
			
			T partitionelement;
			int left, right;
			int middle = (min+max) / 2;
			
			partitionelement = data[middle];
			
			// copy the partition element to the front of the array
			swap(data, middle, min);
			
			left = min;
			right = max;
			
			while (left < right) 
			{
				while ( (left < right) && data[left].compareTo(partitionelement) <=0) {
					left ++;
				}
				while (greater_than(data[right], partitionelement)) {
					right --;
				}
				if (left < right) {
					swap(data, left, right);
				}
			}
			
			swap(data, min, right);
			
			return right;
		
			
		}
	
	
	 public static final void swapReferences(Object[] a, int index1, int index2) {
		    Object tmp = a[index1];
		    a[index1] = a[index2];
		    a[index2] = tmp;
		  }
	 
	 
	 
	 
	 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	

	
	 public static <T extends Comparable<T>> 
		void sort(T[] a){
	
		 sort(a, 0, a.length);
	 }
	 
	 public static <T extends Comparable<T>> 
		void sort(T[] data, int min, int max){
		 
		 int start = Math.max(min, 1);
	    	int end = Math.min(max, data.length-1);
	    	
	    	for (int ii=start; ii <= end; ii++) {
	    		T key = data[ii];
	    		int position = ii;
	    		
	    		while (position > 0 && greater_than(data[position-1], key)) {
	    			data[position] = data[position-1];
	    			position--;
	    		}
	    		data[position] = key;
	    	}    	
		 
	 }
	
	
	// Beginning of the cutoff_qsort method. 
	
	 private static final int CUTOFF = 10; // This is were you set the cutoff value where it switches from quick sort
											// To insertion sort
	
	public static <T extends Comparable<T>> 
		void cutoff_qsort(Integer[] a){
	
		cutoff_qsort(a, 0, a.length - 1);
		
	}
	
	private static <T extends Comparable<T>>  
		void cutoff_qsort(T[] data, int min, int max){
	if (min + CUTOFF > max) 
	{
		insertionSort(data, min, max); // If the array is not longer than the cutoff value than switches it to insertion sort
	}							   	  // You can change this to another sorting method if needed
	else
	{
		int partitionindex = partition(data, min, max);
		quickSort(data, min, partitionindex-1);
		quickSort(data, partitionindex+1, max);
	}
}
	
	// Finding the nth element in an array before its sorted. 
	
	public static <T extends Comparable<T>> 
		T find_nth(T[] a, int targetValue) 
	{
		int first = 0;
		int last = a.length - 1;
		
		while(true) {
			
			int pivot = partition(a, first, last); // Partitions the array a into first and last elements. 
			if(pivot == targetValue)  // if the target value is the same as the pivot then it returns the pivot.
				return a[pivot];
			else if(pivot < targetValue)  // Increments the first by one so it shifts the pivot by one. 
				first = pivot + 1;
			else
				last = pivot - 1; // Increments the last by one so it shifts the pivot by one. 
		}
	}
	
	// Finding the first nth elements in a sorted array. 
	
	public static <T extends Comparable<T>> T[] top_n(T[] a, int myN) 
	{
		T[] result = (T[]) Array.newInstance(a.getClass().getComponentType(), myN);
		
		// Simple for loop that as long as i is < than myN it increments 
		//it by one and stores those values into the result value. 
		for(int i = 0; i < myN; i++) {
			result[i] = a[i]; // results stores the values of how many elements myN is asking for
		}
		return result;
	}
}








	

